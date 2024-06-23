package com.socoolheeya.travel.domain.rds.main.rate.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QDiscountEntity is a Querydsl query type for DiscountEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QDiscountEntity extends EntityPathBase<DiscountEntity> {

    private static final long serialVersionUID = 575086403L;

    public static final QDiscountEntity discountEntity = new QDiscountEntity("discountEntity");

    public final StringPath description = createString("description");

    public final StringPath discountLabel = createString("discountLabel");

    public final EnumPath<com.socoolheeya.travel.system.core.enums.DiscountEnums.DiscountUnit> discountUnit = createEnum("discountUnit", com.socoolheeya.travel.system.core.enums.DiscountEnums.DiscountUnit.class);

    public final NumberPath<java.math.BigDecimal> discountValue = createNumber("discountValue", java.math.BigDecimal.class);

    public final DateTimePath<java.time.LocalDateTime> expiredAt = createDateTime("expiredAt", java.time.LocalDateTime.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final DateTimePath<java.time.LocalDateTime> statedAt = createDateTime("statedAt", java.time.LocalDateTime.class);

    public QDiscountEntity(String variable) {
        super(DiscountEntity.class, forVariable(variable));
    }

    public QDiscountEntity(Path<? extends DiscountEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QDiscountEntity(PathMetadata metadata) {
        super(DiscountEntity.class, metadata);
    }

}

