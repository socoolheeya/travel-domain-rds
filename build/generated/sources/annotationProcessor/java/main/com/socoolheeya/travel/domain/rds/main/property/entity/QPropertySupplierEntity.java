package com.socoolheeya.travel.domain.rds.main.property.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPropertySupplierEntity is a Querydsl query type for PropertySupplierEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPropertySupplierEntity extends EntityPathBase<PropertySupplierEntity> {

    private static final long serialVersionUID = -1946061064L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPropertySupplierEntity propertySupplierEntity = new QPropertySupplierEntity("propertySupplierEntity");

    public final QPropertySupplierIds id;

    public final QPropertyEntity property;

    public final com.socoolheeya.travel.domain.rds.main.supplier.entity.QSupplierEntity supplier;

    public QPropertySupplierEntity(String variable) {
        this(PropertySupplierEntity.class, forVariable(variable), INITS);
    }

    public QPropertySupplierEntity(Path<? extends PropertySupplierEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPropertySupplierEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPropertySupplierEntity(PathMetadata metadata, PathInits inits) {
        this(PropertySupplierEntity.class, metadata, inits);
    }

    public QPropertySupplierEntity(Class<? extends PropertySupplierEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.id = inits.isInitialized("id") ? new QPropertySupplierIds(forProperty("id")) : null;
        this.property = inits.isInitialized("property") ? new QPropertyEntity(forProperty("property"), inits.get("property")) : null;
        this.supplier = inits.isInitialized("supplier") ? new com.socoolheeya.travel.domain.rds.main.supplier.entity.QSupplierEntity(forProperty("supplier"), inits.get("supplier")) : null;
    }

}

