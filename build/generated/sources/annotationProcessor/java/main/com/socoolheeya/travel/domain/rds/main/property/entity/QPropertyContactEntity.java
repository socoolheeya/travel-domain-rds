package com.socoolheeya.travel.domain.rds.main.property.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPropertyContactEntity is a Querydsl query type for PropertyContactEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPropertyContactEntity extends EntityPathBase<PropertyContactEntity> {

    private static final long serialVersionUID = -1635238694L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPropertyContactEntity propertyContactEntity = new QPropertyContactEntity("propertyContactEntity");

    public final StringPath email = createString("email");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QPropertyEntity property;

    public final StringPath secondTelephone = createString("secondTelephone");

    public final StringPath telephone = createString("telephone");

    public final StringPath website = createString("website");

    public QPropertyContactEntity(String variable) {
        this(PropertyContactEntity.class, forVariable(variable), INITS);
    }

    public QPropertyContactEntity(Path<? extends PropertyContactEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPropertyContactEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPropertyContactEntity(PathMetadata metadata, PathInits inits) {
        this(PropertyContactEntity.class, metadata, inits);
    }

    public QPropertyContactEntity(Class<? extends PropertyContactEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.property = inits.isInitialized("property") ? new QPropertyEntity(forProperty("property"), inits.get("property")) : null;
    }

}

