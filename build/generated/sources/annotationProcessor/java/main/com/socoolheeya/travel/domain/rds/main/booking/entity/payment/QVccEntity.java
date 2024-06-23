package com.socoolheeya.travel.domain.rds.main.booking.entity.payment;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QVccEntity is a Querydsl query type for VccEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QVccEntity extends EntityPathBase<VccEntity> {

    private static final long serialVersionUID = -568220227L;

    public static final QVccEntity vccEntity = new QVccEntity("vccEntity");

    public final StringPath cardHolder = createString("cardHolder");

    public final StringPath cardNo = createString("cardNo");

    public final DatePath<java.time.LocalDate> expirationDate = createDate("expirationDate", java.time.LocalDate.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public QVccEntity(String variable) {
        super(VccEntity.class, forVariable(variable));
    }

    public QVccEntity(Path<? extends VccEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QVccEntity(PathMetadata metadata) {
        super(VccEntity.class, metadata);
    }

}

