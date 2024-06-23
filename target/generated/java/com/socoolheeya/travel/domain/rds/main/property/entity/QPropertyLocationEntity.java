package com.socoolheeya.travel.domain.rds.main.property.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPropertyLocationEntity is a Querydsl query type for PropertyLocationEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPropertyLocationEntity extends EntityPathBase<PropertyLocationEntity> {

    private static final long serialVersionUID = -2014229983L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPropertyLocationEntity propertyLocationEntity = new QPropertyLocationEntity("propertyLocationEntity");

    public final StringPath city = createString("city");

    public final StringPath country = createString("country");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QPropertyMapInformationEntity mapInformation;

    public final QPropertyEntity property;

    public final StringPath region = createString("region");

    public QPropertyLocationEntity(String variable) {
        this(PropertyLocationEntity.class, forVariable(variable), INITS);
    }

    public QPropertyLocationEntity(Path<? extends PropertyLocationEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPropertyLocationEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPropertyLocationEntity(PathMetadata metadata, PathInits inits) {
        this(PropertyLocationEntity.class, metadata, inits);
    }

    public QPropertyLocationEntity(Class<? extends PropertyLocationEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.mapInformation = inits.isInitialized("mapInformation") ? new QPropertyMapInformationEntity(forProperty("mapInformation"), inits.get("mapInformation")) : null;
        this.property = inits.isInitialized("property") ? new QPropertyEntity(forProperty("property"), inits.get("property")) : null;
    }

}

