package com.socoolheeya.travel.domain.rds.main.rateplan.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRatePlanBookingPeriodEntity is a Querydsl query type for RatePlanBookingPeriodEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRatePlanBookingPeriodEntity extends EntityPathBase<RatePlanBookingPeriodEntity> {

    private static final long serialVersionUID = 200625644L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRatePlanBookingPeriodEntity ratePlanBookingPeriodEntity = new QRatePlanBookingPeriodEntity("ratePlanBookingPeriodEntity");

    public final com.socoolheeya.travel.domain.rds.common.entity.QWeekEntity _super = new com.socoolheeya.travel.domain.rds.common.entity.QWeekEntity(this);

    //inherited
    public final BooleanPath friday = _super.friday;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final BooleanPath monday = _super.monday;

    public final QRatePlanEntity ratePlan;

    public final DateTimePath<java.time.LocalDateTime> salesEndedAt = createDateTime("salesEndedAt", java.time.LocalDateTime.class);

    public final DateTimePath<java.time.LocalDateTime> salesStartedAt = createDateTime("salesStartedAt", java.time.LocalDateTime.class);

    //inherited
    public final BooleanPath saturday = _super.saturday;

    //inherited
    public final BooleanPath sunday = _super.sunday;

    //inherited
    public final BooleanPath thursday = _super.thursday;

    //inherited
    public final BooleanPath tuesday = _super.tuesday;

    //inherited
    public final BooleanPath wednesday = _super.wednesday;

    public QRatePlanBookingPeriodEntity(String variable) {
        this(RatePlanBookingPeriodEntity.class, forVariable(variable), INITS);
    }

    public QRatePlanBookingPeriodEntity(Path<? extends RatePlanBookingPeriodEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRatePlanBookingPeriodEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRatePlanBookingPeriodEntity(PathMetadata metadata, PathInits inits) {
        this(RatePlanBookingPeriodEntity.class, metadata, inits);
    }

    public QRatePlanBookingPeriodEntity(Class<? extends RatePlanBookingPeriodEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.ratePlan = inits.isInitialized("ratePlan") ? new QRatePlanEntity(forProperty("ratePlan"), inits.get("ratePlan")) : null;
    }

}

