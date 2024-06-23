package com.socoolheeya.travel.domain.rds.common.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRegionEntity is a Querydsl query type for RegionEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRegionEntity extends EntityPathBase<RegionEntity> {

    private static final long serialVersionUID = 1130110258L;

    public static final QRegionEntity regionEntity = new QRegionEntity("regionEntity");

    public final StringPath code = createString("code");

    public final ListPath<CountryEntity, QCountryEntity> countries = this.<CountryEntity, QCountryEntity>createList("countries", CountryEntity.class, QCountryEntity.class, PathInits.DIRECT2);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public QRegionEntity(String variable) {
        super(RegionEntity.class, forVariable(variable));
    }

    public QRegionEntity(Path<? extends RegionEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QRegionEntity(PathMetadata metadata) {
        super(RegionEntity.class, metadata);
    }

}

