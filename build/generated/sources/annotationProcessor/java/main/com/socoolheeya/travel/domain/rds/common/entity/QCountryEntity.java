package com.socoolheeya.travel.domain.rds.common.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCountryEntity is a Querydsl query type for CountryEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCountryEntity extends EntityPathBase<CountryEntity> {

    private static final long serialVersionUID = 1655970110L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCountryEntity countryEntity = new QCountryEntity("countryEntity");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final ListPath<CityEntity, QCityEntity> cities = this.<CityEntity, QCityEntity>createList("cities", CityEntity.class, QCityEntity.class, PathInits.DIRECT2);

    public final StringPath code = createString("code");

    //inherited
    public final DateTimePath<java.time.ZonedDateTime> createdAt = _super.createdAt;

    //inherited
    public final StringPath createdBy = _super.createdBy;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final BooleanPath isEnabled = createBoolean("isEnabled");

    public final StringPath name = createString("name");

    public final QRegionEntity region;

    //inherited
    public final DateTimePath<java.time.ZonedDateTime> updatedAt = _super.updatedAt;

    //inherited
    public final StringPath updatedBy = _super.updatedBy;

    public QCountryEntity(String variable) {
        this(CountryEntity.class, forVariable(variable), INITS);
    }

    public QCountryEntity(Path<? extends CountryEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCountryEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCountryEntity(PathMetadata metadata, PathInits inits) {
        this(CountryEntity.class, metadata, inits);
    }

    public QCountryEntity(Class<? extends CountryEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.region = inits.isInitialized("region") ? new QRegionEntity(forProperty("region")) : null;
    }

}

