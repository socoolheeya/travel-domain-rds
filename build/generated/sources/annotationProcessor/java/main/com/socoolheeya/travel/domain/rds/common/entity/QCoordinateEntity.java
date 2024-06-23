package com.socoolheeya.travel.domain.rds.common.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QCoordinateEntity is a Querydsl query type for CoordinateEntity
 */
@Generated("com.querydsl.codegen.DefaultSupertypeSerializer")
public class QCoordinateEntity extends EntityPathBase<CoordinateEntity> {

    private static final long serialVersionUID = -1001102538L;

    public static final QCoordinateEntity coordinateEntity = new QCoordinateEntity("coordinateEntity");

    public final NumberPath<Double> latitude = createNumber("latitude", Double.class);

    public final NumberPath<Double> longitude = createNumber("longitude", Double.class);

    public final SimplePath<org.springframework.data.geo.Point> point = createSimple("point", org.springframework.data.geo.Point.class);

    public QCoordinateEntity(String variable) {
        super(CoordinateEntity.class, forVariable(variable));
    }

    public QCoordinateEntity(Path<? extends CoordinateEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCoordinateEntity(PathMetadata metadata) {
        super(CoordinateEntity.class, metadata);
    }

}

