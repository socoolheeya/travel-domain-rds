package com.socoolheeya.travel.domain.rds.main.property.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPropertyContractEntity is a Querydsl query type for PropertyContractEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPropertyContractEntity extends EntityPathBase<PropertyContractEntity> {

    private static final long serialVersionUID = -857636418L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPropertyContractEntity propertyContractEntity = new QPropertyContractEntity("propertyContractEntity");

    public final com.socoolheeya.travel.domain.rds.common.entity.QBaseEntity _super = new com.socoolheeya.travel.domain.rds.common.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.ZonedDateTime> createdAt = _super.createdAt;

    //inherited
    public final StringPath createdBy = _super.createdBy;

    public final StringPath fileName = createString("fileName");

    public final StringPath filePath = createString("filePath");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final BooleanPath isEnabled = createBoolean("isEnabled");

    public final QPropertyEntity property;

    //inherited
    public final DateTimePath<java.time.ZonedDateTime> updatedAt = _super.updatedAt;

    //inherited
    public final StringPath updatedBy = _super.updatedBy;

    public QPropertyContractEntity(String variable) {
        this(PropertyContractEntity.class, forVariable(variable), INITS);
    }

    public QPropertyContractEntity(Path<? extends PropertyContractEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPropertyContractEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPropertyContractEntity(PathMetadata metadata, PathInits inits) {
        this(PropertyContractEntity.class, metadata, inits);
    }

    public QPropertyContractEntity(Class<? extends PropertyContractEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.property = inits.isInitialized("property") ? new QPropertyEntity(forProperty("property"), inits.get("property")) : null;
    }

}

