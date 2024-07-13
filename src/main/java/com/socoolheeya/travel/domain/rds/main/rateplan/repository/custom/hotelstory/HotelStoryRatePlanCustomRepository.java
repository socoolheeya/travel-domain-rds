package com.socoolheeya.travel.domain.rds.main.rateplan.repository.custom.hotelstory;


import com.querydsl.core.types.Projections;
import com.querydsl.core.types.dsl.Expressions;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.socoolheeya.travel.domain.rds.main.property.entity.QPropertyEntity;
import com.socoolheeya.travel.domain.rds.main.property.entity.QPropertySettlementCommissionEntity;
import com.socoolheeya.travel.domain.rds.main.property.entity.QPropertySettlementEntity;
import com.socoolheeya.travel.domain.rds.main.rateplan.domain.hotelstory.HotelstoryRatePlan;
import com.socoolheeya.travel.domain.rds.main.rateplan.entity.QMealPlanEntity;
import com.socoolheeya.travel.domain.rds.main.rateplan.entity.QRatePlanEntity;
import com.socoolheeya.travel.domain.rds.main.rateplan.entity.QRatePlanSettlementCommissionEntity;
import com.socoolheeya.travel.domain.rds.main.room.entity.QRoomEntity;
import com.socoolheeya.travel.domain.rds.main.room.entity.QRoomRatePlanEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class HotelStoryRatePlanCustomRepository {

    private final JPAQueryFactory queryFactory;

    @Transactional(readOnly = true)
    public List<HotelstoryRatePlan> getRatePlans(Long propertyId) {
        QPropertyEntity property = QPropertyEntity.propertyEntity;
        QPropertySettlementEntity propertySettlement = QPropertySettlementEntity.propertySettlementEntity;
        QPropertySettlementCommissionEntity propertySettlementCommission = QPropertySettlementCommissionEntity.propertySettlementCommissionEntity;
        QRoomEntity room = QRoomEntity.roomEntity;
        QRatePlanEntity ratePlan = QRatePlanEntity.ratePlanEntity;
        QMealPlanEntity mealPlan = QMealPlanEntity.mealPlanEntity;
        QRoomRatePlanEntity roomRatePlan = QRoomRatePlanEntity.roomRatePlanEntity;
        QRatePlanSettlementCommissionEntity ratePlanSettlementCommission = QRatePlanSettlementCommissionEntity.ratePlanSettlementCommissionEntity;

        return queryFactory.select(Projections.fields(HotelstoryRatePlan.class,
                        room.id
                        , ratePlan.id
                        , ratePlan.name
                        , mealPlan.isBreakfast.coalesce(Expressions.constant("N"))
                        , ratePlanSettlementCommission.commissionPriceType.coalesce(propertySettlementCommission.commissionPriceType)
                ))
                .from(roomRatePlan)
                .innerJoin(roomRatePlan.room, room)
                .innerJoin(roomRatePlan.ratePlan, ratePlan)
                .innerJoin(roomRatePlan.room.property, property)
                .leftJoin(ratePlan, mealPlan.ratePlan)
                .leftJoin(property, propertySettlement.property)
                .leftJoin(propertySettlement, propertySettlementCommission.propertySettlement)
                .leftJoin(ratePlan, ratePlanSettlementCommission.ratePlan)
                .where(property.id.eq(propertyId))
                .fetch();
    }





}
