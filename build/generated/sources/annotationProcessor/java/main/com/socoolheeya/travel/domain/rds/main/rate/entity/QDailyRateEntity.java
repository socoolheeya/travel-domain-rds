package com.socoolheeya.travel.domain.rds.main.rate.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDailyRateEntity is a Querydsl query type for DailyRateEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QDailyRateEntity extends EntityPathBase<DailyRateEntity> {

    private static final long serialVersionUID = 1169878269L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDailyRateEntity dailyRateEntity = new QDailyRateEntity("dailyRateEntity");

    public final NumberPath<java.math.BigDecimal> commission = createNumber("commission", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> commissionFee = createNumber("commissionFee", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> depositPrice = createNumber("depositPrice", java.math.BigDecimal.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<java.math.BigDecimal> originPrice = createNumber("originPrice", java.math.BigDecimal.class);

    public final QRateEntity rate;

    public final DatePath<java.time.LocalDate> salesDay = createDate("salesDay", java.time.LocalDate.class);

    public final NumberPath<java.math.BigDecimal> sellingPrice = createNumber("sellingPrice", java.math.BigDecimal.class);

    public QDailyRateEntity(String variable) {
        this(DailyRateEntity.class, forVariable(variable), INITS);
    }

    public QDailyRateEntity(Path<? extends DailyRateEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QDailyRateEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QDailyRateEntity(PathMetadata metadata, PathInits inits) {
        this(DailyRateEntity.class, metadata, inits);
    }

    public QDailyRateEntity(Class<? extends DailyRateEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.rate = inits.isInitialized("rate") ? new QRateEntity(forProperty("rate"), inits.get("rate")) : null;
    }

}

