package com.socoolheeya.travel.domain.rds.main.rateplan.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCancelPolicyEntity is a Querydsl query type for CancelPolicyEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCancelPolicyEntity extends EntityPathBase<CancelPolicyEntity> {

    private static final long serialVersionUID = 1481692023L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCancelPolicyEntity cancelPolicyEntity = new QCancelPolicyEntity("cancelPolicyEntity");

    public final ListPath<CancelRateEntity, QCancelRateEntity> cancelRates = this.<CancelRateEntity, QCancelRateEntity>createList("cancelRates", CancelRateEntity.class, QCancelRateEntity.class, PathInits.DIRECT2);

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final BooleanPath isCancel = createBoolean("isCancel");

    public final QRatePlanEntity ratePlan;

    public QCancelPolicyEntity(String variable) {
        this(CancelPolicyEntity.class, forVariable(variable), INITS);
    }

    public QCancelPolicyEntity(Path<? extends CancelPolicyEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCancelPolicyEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCancelPolicyEntity(PathMetadata metadata, PathInits inits) {
        this(CancelPolicyEntity.class, metadata, inits);
    }

    public QCancelPolicyEntity(Class<? extends CancelPolicyEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.ratePlan = inits.isInitialized("ratePlan") ? new QRatePlanEntity(forProperty("ratePlan"), inits.get("ratePlan")) : null;
    }

}

