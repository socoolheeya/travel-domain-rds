package com.socoolheeya.travel.domain.rds.main.property.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPropertyAddressEntity is a Querydsl query type for PropertyAddressEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPropertyAddressEntity extends EntityPathBase<PropertyAddressEntity> {

    private static final long serialVersionUID = 1302103470L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPropertyAddressEntity propertyAddressEntity = new QPropertyAddressEntity("propertyAddressEntity");

    public final StringPath address = createString("address");

    public final StringPath addressDetail = createString("addressDetail");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QPropertyEntity property;

    public final StringPath zipCode = createString("zipCode");

    public QPropertyAddressEntity(String variable) {
        this(PropertyAddressEntity.class, forVariable(variable), INITS);
    }

    public QPropertyAddressEntity(Path<? extends PropertyAddressEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPropertyAddressEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPropertyAddressEntity(PathMetadata metadata, PathInits inits) {
        this(PropertyAddressEntity.class, metadata, inits);
    }

    public QPropertyAddressEntity(Class<? extends PropertyAddressEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.property = inits.isInitialized("property") ? new QPropertyEntity(forProperty("property"), inits.get("property")) : null;
    }

}

