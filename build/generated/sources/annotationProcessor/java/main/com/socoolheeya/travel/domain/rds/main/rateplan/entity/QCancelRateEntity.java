package com.socoolheeya.travel.domain.rds.main.rateplan.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCancelRateEntity is a Querydsl query type for CancelRateEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCancelRateEntity extends EntityPathBase<CancelRateEntity> {

    private static final long serialVersionUID = 667912485L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCancelRateEntity cancelRateEntity = new QCancelRateEntity("cancelRateEntity");

    public final QCancelPolicyEntity cancelPolicy;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Integer> offset = createNumber("offset", Integer.class);

    public final NumberPath<Integer> rate = createNumber("rate", Integer.class);

    public QCancelRateEntity(String variable) {
        this(CancelRateEntity.class, forVariable(variable), INITS);
    }

    public QCancelRateEntity(Path<? extends CancelRateEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCancelRateEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCancelRateEntity(PathMetadata metadata, PathInits inits) {
        this(CancelRateEntity.class, metadata, inits);
    }

    public QCancelRateEntity(Class<? extends CancelRateEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.cancelPolicy = inits.isInitialized("cancelPolicy") ? new QCancelPolicyEntity(forProperty("cancelPolicy"), inits.get("cancelPolicy")) : null;
    }

}

