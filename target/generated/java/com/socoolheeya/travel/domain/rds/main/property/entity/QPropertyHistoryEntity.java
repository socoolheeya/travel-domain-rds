package com.socoolheeya.travel.domain.rds.main.property.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QPropertyHistoryEntity is a Querydsl query type for PropertyHistoryEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPropertyHistoryEntity extends EntityPathBase<PropertyHistoryEntity> {

    private static final long serialVersionUID = 1003738702L;

    public static final QPropertyHistoryEntity propertyHistoryEntity = new QPropertyHistoryEntity("propertyHistoryEntity");

    public final com.socoolheeya.travel.domain.rds.common.entity.QBaseEntity _super = new com.socoolheeya.travel.domain.rds.common.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.ZonedDateTime> createdAt = _super.createdAt;

    //inherited
    public final StringPath createdBy = _super.createdBy;

    public final StringPath enName = createString("enName");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final BooleanPath isEnabled = createBoolean("isEnabled");

    public final StringPath koName = createString("koName");

    public final NumberPath<Long> propertyId = createNumber("propertyId", Long.class);

    //inherited
    public final DateTimePath<java.time.ZonedDateTime> updatedAt = _super.updatedAt;

    //inherited
    public final StringPath updatedBy = _super.updatedBy;

    public QPropertyHistoryEntity(String variable) {
        super(PropertyHistoryEntity.class, forVariable(variable));
    }

    public QPropertyHistoryEntity(Path<? extends PropertyHistoryEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPropertyHistoryEntity(PathMetadata metadata) {
        super(PropertyHistoryEntity.class, metadata);
    }

}

