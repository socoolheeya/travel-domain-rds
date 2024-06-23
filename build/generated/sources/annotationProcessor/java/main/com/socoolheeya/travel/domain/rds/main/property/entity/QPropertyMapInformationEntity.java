package com.socoolheeya.travel.domain.rds.main.property.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPropertyMapInformationEntity is a Querydsl query type for PropertyMapInformationEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPropertyMapInformationEntity extends EntityPathBase<PropertyMapInformationEntity> {

    private static final long serialVersionUID = -1212717668L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPropertyMapInformationEntity propertyMapInformationEntity = new QPropertyMapInformationEntity("propertyMapInformationEntity");

    public final com.socoolheeya.travel.domain.rds.common.entity.QCoordinateEntity _super = new com.socoolheeya.travel.domain.rds.common.entity.QCoordinateEntity(this);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Double> latitude = createNumber("latitude", Double.class);

    public final QPropertyLocationEntity location;

    public final NumberPath<Double> longitude = createNumber("longitude", Double.class);

    public final SimplePath<org.springframework.data.geo.Point> point = createSimple("point", org.springframework.data.geo.Point.class);

    public QPropertyMapInformationEntity(String variable) {
        this(PropertyMapInformationEntity.class, forVariable(variable), INITS);
    }

    public QPropertyMapInformationEntity(Path<? extends PropertyMapInformationEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPropertyMapInformationEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPropertyMapInformationEntity(PathMetadata metadata, PathInits inits) {
        this(PropertyMapInformationEntity.class, metadata, inits);
    }

    public QPropertyMapInformationEntity(Class<? extends PropertyMapInformationEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.location = inits.isInitialized("location") ? new QPropertyLocationEntity(forProperty("location"), inits.get("location")) : null;
    }

}

