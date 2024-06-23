package com.socoolheeya.travel.domain.rds.common.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCityEntity is a Querydsl query type for CityEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCityEntity extends EntityPathBase<CityEntity> {

    private static final long serialVersionUID = 1215999273L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCityEntity cityEntity = new QCityEntity("cityEntity");

    public final QCoordinateEntity _super = new QCoordinateEntity(this);

    public final QCountryEntity country;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final BooleanPath isEnabled = createBoolean("isEnabled");

    //inherited
    public final NumberPath<Double> latitude = _super.latitude;

    //inherited
    public final NumberPath<Double> longitude = _super.longitude;

    public final StringPath name = createString("name");

    //inherited
    public final SimplePath<org.springframework.data.geo.Point> point = _super.point;

    public QCityEntity(String variable) {
        this(CityEntity.class, forVariable(variable), INITS);
    }

    public QCityEntity(Path<? extends CityEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCityEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCityEntity(PathMetadata metadata, PathInits inits) {
        this(CityEntity.class, metadata, inits);
    }

    public QCityEntity(Class<? extends CityEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.country = inits.isInitialized("country") ? new QCountryEntity(forProperty("country"), inits.get("country")) : null;
    }

}

