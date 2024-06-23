package com.socoolheeya.travel.domain.rds.main.rateplan.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRatePlanEntity is a Querydsl query type for RatePlanEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRatePlanEntity extends EntityPathBase<RatePlanEntity> {

    private static final long serialVersionUID = -1663275628L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRatePlanEntity ratePlanEntity = new QRatePlanEntity("ratePlanEntity");

    public final com.socoolheeya.travel.domain.rds.common.entity.QBaseEntity _super = new com.socoolheeya.travel.domain.rds.common.entity.QBaseEntity(this);

    public final com.socoolheeya.travel.domain.rds.main.booking.entity.QBookingEntity booking;

    public final QCancelPolicyEntity cancelPolicy;

    public final TimePath<java.time.LocalTime> checkinTime = createTime("checkinTime", java.time.LocalTime.class);

    public final TimePath<java.time.LocalTime> checkoutTime = createTime("checkoutTime", java.time.LocalTime.class);

    //inherited
    public final DateTimePath<java.time.ZonedDateTime> createdAt = _super.createdAt;

    //inherited
    public final StringPath createdBy = _super.createdBy;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final BooleanPath isEarlyCheckin = createBoolean("isEarlyCheckin");

    public final BooleanPath isSmoking = createBoolean("isSmoking");

    public final BooleanPath isStaticRate = createBoolean("isStaticRate");

    public final NumberPath<Integer> maxStay = createNumber("maxStay", Integer.class);

    public final QMealPlanEntity mealPlan;

    public final NumberPath<Integer> minStay = createNumber("minStay", Integer.class);

    public final StringPath name = createString("name");

    public final EnumPath<com.socoolheeya.travel.system.core.enums.RatePlanEnums.RateClassification> rateClassification = createEnum("rateClassification", com.socoolheeya.travel.system.core.enums.RatePlanEnums.RateClassification.class);

    public final ListPath<RatePlanCouponEntity, QRatePlanCouponEntity> ratePlanCoupons = this.<RatePlanCouponEntity, QRatePlanCouponEntity>createList("ratePlanCoupons", RatePlanCouponEntity.class, QRatePlanCouponEntity.class, PathInits.DIRECT2);

    public final ListPath<com.socoolheeya.travel.domain.rds.main.rate.entity.RateEntity, com.socoolheeya.travel.domain.rds.main.rate.entity.QRateEntity> rates = this.<com.socoolheeya.travel.domain.rds.main.rate.entity.RateEntity, com.socoolheeya.travel.domain.rds.main.rate.entity.QRateEntity>createList("rates", com.socoolheeya.travel.domain.rds.main.rate.entity.RateEntity.class, com.socoolheeya.travel.domain.rds.main.rate.entity.QRateEntity.class, PathInits.DIRECT2);

    public final ListPath<com.socoolheeya.travel.domain.rds.main.room.entity.RoomRatePlanEntity, com.socoolheeya.travel.domain.rds.main.room.entity.QRoomRatePlanEntity> roomRatePlans = this.<com.socoolheeya.travel.domain.rds.main.room.entity.RoomRatePlanEntity, com.socoolheeya.travel.domain.rds.main.room.entity.QRoomRatePlanEntity>createList("roomRatePlans", com.socoolheeya.travel.domain.rds.main.room.entity.RoomRatePlanEntity.class, com.socoolheeya.travel.domain.rds.main.room.entity.QRoomRatePlanEntity.class, PathInits.DIRECT2);

    public final EnumPath<com.socoolheeya.travel.system.core.enums.RatePlanEnums.Status> status = createEnum("status", com.socoolheeya.travel.system.core.enums.RatePlanEnums.Status.class);

    //inherited
    public final DateTimePath<java.time.ZonedDateTime> updatedAt = _super.updatedAt;

    //inherited
    public final StringPath updatedBy = _super.updatedBy;

    public QRatePlanEntity(String variable) {
        this(RatePlanEntity.class, forVariable(variable), INITS);
    }

    public QRatePlanEntity(Path<? extends RatePlanEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRatePlanEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRatePlanEntity(PathMetadata metadata, PathInits inits) {
        this(RatePlanEntity.class, metadata, inits);
    }

    public QRatePlanEntity(Class<? extends RatePlanEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.booking = inits.isInitialized("booking") ? new com.socoolheeya.travel.domain.rds.main.booking.entity.QBookingEntity(forProperty("booking"), inits.get("booking")) : null;
        this.cancelPolicy = inits.isInitialized("cancelPolicy") ? new QCancelPolicyEntity(forProperty("cancelPolicy"), inits.get("cancelPolicy")) : null;
        this.mealPlan = inits.isInitialized("mealPlan") ? new QMealPlanEntity(forProperty("mealPlan"), inits.get("mealPlan")) : null;
    }

}

