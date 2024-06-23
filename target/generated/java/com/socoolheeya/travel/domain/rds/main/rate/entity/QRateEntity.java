package com.socoolheeya.travel.domain.rds.main.rate.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRateEntity is a Querydsl query type for RateEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRateEntity extends EntityPathBase<RateEntity> {

    private static final long serialVersionUID = 751876898L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRateEntity rateEntity = new QRateEntity("rateEntity");

    public final ListPath<DailyRateEntity, QDailyRateEntity> dailyRates = this.<DailyRateEntity, QDailyRateEntity>createList("dailyRates", DailyRateEntity.class, QDailyRateEntity.class, PathInits.DIRECT2);

    public final ListPath<ExtraRateEntity, QExtraRateEntity> extraRates = this.<ExtraRateEntity, QExtraRateEntity>createList("extraRates", ExtraRateEntity.class, QExtraRateEntity.class, PathInits.DIRECT2);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<java.math.BigDecimal> netPrice = createNumber("netPrice", java.math.BigDecimal.class);

    public final com.socoolheeya.travel.domain.rds.main.rateplan.entity.QRatePlanEntity ratePlan;

    public final NumberPath<java.math.BigDecimal> totalPrice = createNumber("totalPrice", java.math.BigDecimal.class);

    public QRateEntity(String variable) {
        this(RateEntity.class, forVariable(variable), INITS);
    }

    public QRateEntity(Path<? extends RateEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRateEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRateEntity(PathMetadata metadata, PathInits inits) {
        this(RateEntity.class, metadata, inits);
    }

    public QRateEntity(Class<? extends RateEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.ratePlan = inits.isInitialized("ratePlan") ? new com.socoolheeya.travel.domain.rds.main.rateplan.entity.QRatePlanEntity(forProperty("ratePlan"), inits.get("ratePlan")) : null;
    }

}

