package com.socoolheeya.travel.domain.rds.main.rateplan.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRatePlanCommissionOptionEntity is a Querydsl query type for RatePlanCommissionOptionEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRatePlanCommissionOptionEntity extends EntityPathBase<RatePlanCommissionOptionEntity> {

    private static final long serialVersionUID = -957793036L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRatePlanCommissionOptionEntity ratePlanCommissionOptionEntity = new QRatePlanCommissionOptionEntity("ratePlanCommissionOptionEntity");

    public final NumberPath<Integer> defaultCommission = createNumber("defaultCommission", Integer.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final EnumPath<com.socoolheeya.travel.system.core.enums.RatePlanEnums.CommissionPeriod> period = createEnum("period", com.socoolheeya.travel.system.core.enums.RatePlanEnums.CommissionPeriod.class);

    public final QRatePlanEntity ratePlan;

    public final EnumPath<com.socoolheeya.travel.system.core.enums.RatePlanEnums.CommissionStandard> standard = createEnum("standard", com.socoolheeya.travel.system.core.enums.RatePlanEnums.CommissionStandard.class);

    public final EnumPath<com.socoolheeya.travel.system.core.enums.RatePlanEnums.CommissionType> type = createEnum("type", com.socoolheeya.travel.system.core.enums.RatePlanEnums.CommissionType.class);

    public QRatePlanCommissionOptionEntity(String variable) {
        this(RatePlanCommissionOptionEntity.class, forVariable(variable), INITS);
    }

    public QRatePlanCommissionOptionEntity(Path<? extends RatePlanCommissionOptionEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRatePlanCommissionOptionEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRatePlanCommissionOptionEntity(PathMetadata metadata, PathInits inits) {
        this(RatePlanCommissionOptionEntity.class, metadata, inits);
    }

    public QRatePlanCommissionOptionEntity(Class<? extends RatePlanCommissionOptionEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.ratePlan = inits.isInitialized("ratePlan") ? new QRatePlanEntity(forProperty("ratePlan"), inits.get("ratePlan")) : null;
    }

}

