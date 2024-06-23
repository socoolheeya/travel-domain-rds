package com.socoolheeya.travel.domain.rds.main.rateplan.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRatePlanCheckinEntity is a Querydsl query type for RatePlanCheckinEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRatePlanCheckinEntity extends EntityPathBase<RatePlanCheckinEntity> {

    private static final long serialVersionUID = 1712547743L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRatePlanCheckinEntity ratePlanCheckinEntity = new QRatePlanCheckinEntity("ratePlanCheckinEntity");

    public final com.socoolheeya.travel.domain.rds.common.entity.QWeekEntity _super = new com.socoolheeya.travel.domain.rds.common.entity.QWeekEntity(this);

    public final DateTimePath<java.time.LocalDateTime> checkinEndedAt = createDateTime("checkinEndedAt", java.time.LocalDateTime.class);

    public final DateTimePath<java.time.LocalDateTime> checkinStartedAt = createDateTime("checkinStartedAt", java.time.LocalDateTime.class);

    //inherited
    public final BooleanPath friday = _super.friday;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final BooleanPath monday = _super.monday;

    public final QRatePlanEntity ratePlan;

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

    public QRatePlanCheckinEntity(String variable) {
        this(RatePlanCheckinEntity.class, forVariable(variable), INITS);
    }

    public QRatePlanCheckinEntity(Path<? extends RatePlanCheckinEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRatePlanCheckinEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRatePlanCheckinEntity(PathMetadata metadata, PathInits inits) {
        this(RatePlanCheckinEntity.class, metadata, inits);
    }

    public QRatePlanCheckinEntity(Class<? extends RatePlanCheckinEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.ratePlan = inits.isInitialized("ratePlan") ? new QRatePlanEntity(forProperty("ratePlan"), inits.get("ratePlan")) : null;
    }

}

