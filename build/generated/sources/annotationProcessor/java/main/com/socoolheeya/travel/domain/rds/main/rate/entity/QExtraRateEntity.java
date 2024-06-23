package com.socoolheeya.travel.domain.rds.main.rate.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QExtraRateEntity is a Querydsl query type for ExtraRateEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QExtraRateEntity extends EntityPathBase<ExtraRateEntity> {

    private static final long serialVersionUID = 1658706484L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QExtraRateEntity extraRateEntity = new QExtraRateEntity("extraRateEntity");

    public final NumberPath<java.math.BigDecimal> adultPrice = createNumber("adultPrice", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> childPrice = createNumber("childPrice", java.math.BigDecimal.class);

    public final NumberPath<java.math.BigDecimal> excessAmount = createNumber("excessAmount", java.math.BigDecimal.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final QRateEntity rate;

    public QExtraRateEntity(String variable) {
        this(ExtraRateEntity.class, forVariable(variable), INITS);
    }

    public QExtraRateEntity(Path<? extends ExtraRateEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QExtraRateEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QExtraRateEntity(PathMetadata metadata, PathInits inits) {
        this(ExtraRateEntity.class, metadata, inits);
    }

    public QExtraRateEntity(Class<? extends ExtraRateEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.rate = inits.isInitialized("rate") ? new QRateEntity(forProperty("rate"), inits.get("rate")) : null;
    }

}

