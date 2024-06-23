package com.socoolheeya.travel.domain.rds.main.property.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QPropertySupplierIds is a Querydsl query type for PropertySupplierIds
 */
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QPropertySupplierIds extends BeanPath<PropertySupplierIds> {

    private static final long serialVersionUID = 375645123L;

    public static final QPropertySupplierIds propertySupplierIds = new QPropertySupplierIds("propertySupplierIds");

    public final NumberPath<Long> propertyId = createNumber("propertyId", Long.class);

    public final NumberPath<Integer> supplierId = createNumber("supplierId", Integer.class);

    public QPropertySupplierIds(String variable) {
        super(PropertySupplierIds.class, forVariable(variable));
    }

    public QPropertySupplierIds(Path<? extends PropertySupplierIds> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPropertySupplierIds(PathMetadata metadata) {
        super(PropertySupplierIds.class, metadata);
    }

}

