package com.socoolheeya.travel.domain.rds.main.rateplan.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRatePlanCouponEntity is a Querydsl query type for RatePlanCouponEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRatePlanCouponEntity extends EntityPathBase<RatePlanCouponEntity> {

    private static final long serialVersionUID = -627886950L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRatePlanCouponEntity ratePlanCouponEntity = new QRatePlanCouponEntity("ratePlanCouponEntity");

    public final StringPath description = createString("description");

    public final DateTimePath<java.time.LocalDateTime> endedAt = createDateTime("endedAt", java.time.LocalDateTime.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath image = createString("image");

    public final StringPath name = createString("name");

    public final QRatePlanEntity ratePlan;

    public final DateTimePath<java.time.LocalDateTime> startedAt = createDateTime("startedAt", java.time.LocalDateTime.class);

    public final EnumPath<com.socoolheeya.travel.system.core.enums.RatePlanEnums.CouponUnit> unit = createEnum("unit", com.socoolheeya.travel.system.core.enums.RatePlanEnums.CouponUnit.class);

    public final NumberPath<Integer> value = createNumber("value", Integer.class);

    public QRatePlanCouponEntity(String variable) {
        this(RatePlanCouponEntity.class, forVariable(variable), INITS);
    }

    public QRatePlanCouponEntity(Path<? extends RatePlanCouponEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRatePlanCouponEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRatePlanCouponEntity(PathMetadata metadata, PathInits inits) {
        this(RatePlanCouponEntity.class, metadata, inits);
    }

    public QRatePlanCouponEntity(Class<? extends RatePlanCouponEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.ratePlan = inits.isInitialized("ratePlan") ? new QRatePlanEntity(forProperty("ratePlan"), inits.get("ratePlan")) : null;
    }

}

