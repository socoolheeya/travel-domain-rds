package com.socoolheeya.travel.domain.rds.main.property.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPropertyImageEntity is a Querydsl query type for PropertyImageEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPropertyImageEntity extends EntityPathBase<PropertyImageEntity> {

    private static final long serialVersionUID = -1660785771L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPropertyImageEntity propertyImageEntity = new QPropertyImageEntity("propertyImageEntity");

    public final com.socoolheeya.travel.domain.rds.common.entity.QBaseEntity _super = new com.socoolheeya.travel.domain.rds.common.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.ZonedDateTime> createdAt = _super.createdAt;

    //inherited
    public final StringPath createdBy = _super.createdBy;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final StringPath path = createString("path");

    public final QPropertyEntity property;

    public final NumberPath<Integer> sequence = createNumber("sequence", Integer.class);

    public final EnumPath<com.socoolheeya.travel.system.core.enums.PropertyEnums.ImageType> type = createEnum("type", com.socoolheeya.travel.system.core.enums.PropertyEnums.ImageType.class);

    //inherited
    public final DateTimePath<java.time.ZonedDateTime> updatedAt = _super.updatedAt;

    //inherited
    public final StringPath updatedBy = _super.updatedBy;

    public QPropertyImageEntity(String variable) {
        this(PropertyImageEntity.class, forVariable(variable), INITS);
    }

    public QPropertyImageEntity(Path<? extends PropertyImageEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPropertyImageEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPropertyImageEntity(PathMetadata metadata, PathInits inits) {
        this(PropertyImageEntity.class, metadata, inits);
    }

    public QPropertyImageEntity(Class<? extends PropertyImageEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.property = inits.isInitialized("property") ? new QPropertyEntity(forProperty("property"), inits.get("property")) : null;
    }

}

