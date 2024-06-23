package com.socoolheeya.travel.domain.rds.main.rate.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QCurrencyEntity is a Querydsl query type for CurrencyEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCurrencyEntity extends EntityPathBase<CurrencyEntity> {

    private static final long serialVersionUID = 425147923L;

    public static final QCurrencyEntity currencyEntity = new QCurrencyEntity("currencyEntity");

    public final StringPath code = createString("code");

    public final StringPath symbol = createString("symbol");

    public QCurrencyEntity(String variable) {
        super(CurrencyEntity.class, forVariable(variable));
    }

    public QCurrencyEntity(Path<? extends CurrencyEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCurrencyEntity(PathMetadata metadata) {
        super(CurrencyEntity.class, metadata);
    }

}

