package com.socoolheeya.travel.domain.rds.main.property.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPropertyTranslationEntity is a Querydsl query type for PropertyTranslationEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPropertyTranslationEntity extends EntityPathBase<PropertyTranslationEntity> {

    private static final long serialVersionUID = 986900267L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPropertyTranslationEntity propertyTranslationEntity = new QPropertyTranslationEntity("propertyTranslationEntity");

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath language = createString("language");

    public final StringPath name = createString("name");

    public final QPropertyEntity property;

    public QPropertyTranslationEntity(String variable) {
        this(PropertyTranslationEntity.class, forVariable(variable), INITS);
    }

    public QPropertyTranslationEntity(Path<? extends PropertyTranslationEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPropertyTranslationEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPropertyTranslationEntity(PathMetadata metadata, PathInits inits) {
        this(PropertyTranslationEntity.class, metadata, inits);
    }

    public QPropertyTranslationEntity(Class<? extends PropertyTranslationEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.property = inits.isInitialized("property") ? new QPropertyEntity(forProperty("property"), inits.get("property")) : null;
    }

}

