package com.socoolheeya.travel.domain.rds.main.property.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPropertyEntity is a Querydsl query type for PropertyEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPropertyEntity extends EntityPathBase<PropertyEntity> {

    private static final long serialVersionUID = -690924788L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPropertyEntity propertyEntity = new QPropertyEntity("propertyEntity");

    public final com.socoolheeya.travel.domain.rds.common.entity.QBaseEntity _super = new com.socoolheeya.travel.domain.rds.common.entity.QBaseEntity(this);

    public final QPropertyAddressEntity address;

    public final QPropertyContactEntity contact;

    //inherited
    public final DateTimePath<java.time.ZonedDateTime> createdAt = _super.createdAt;

    //inherited
    public final StringPath createdBy = _super.createdBy;

    public final StringPath description = createString("description");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<PropertyImageEntity, QPropertyImageEntity> images = this.<PropertyImageEntity, QPropertyImageEntity>createList("images", PropertyImageEntity.class, QPropertyImageEntity.class, PathInits.DIRECT2);

    public final BooleanPath isEnabled = createBoolean("isEnabled");

    public final QPropertyLocationEntity location;

    public final StringPath name = createString("name");

    public final ListPath<PropertyContractEntity, QPropertyContractEntity> propertyContracts = this.<PropertyContractEntity, QPropertyContractEntity>createList("propertyContracts", PropertyContractEntity.class, QPropertyContractEntity.class, PathInits.DIRECT2);

    public final QPropertySupplierEntity propertySupplier;

    public final SetPath<PropertyTranslationEntity, QPropertyTranslationEntity> translations = this.<PropertyTranslationEntity, QPropertyTranslationEntity>createSet("translations", PropertyTranslationEntity.class, QPropertyTranslationEntity.class, PathInits.DIRECT2);

    //inherited
    public final DateTimePath<java.time.ZonedDateTime> updatedAt = _super.updatedAt;

    //inherited
    public final StringPath updatedBy = _super.updatedBy;

    public QPropertyEntity(String variable) {
        this(PropertyEntity.class, forVariable(variable), INITS);
    }

    public QPropertyEntity(Path<? extends PropertyEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPropertyEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPropertyEntity(PathMetadata metadata, PathInits inits) {
        this(PropertyEntity.class, metadata, inits);
    }

    public QPropertyEntity(Class<? extends PropertyEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.address = inits.isInitialized("address") ? new QPropertyAddressEntity(forProperty("address"), inits.get("address")) : null;
        this.contact = inits.isInitialized("contact") ? new QPropertyContactEntity(forProperty("contact"), inits.get("contact")) : null;
        this.location = inits.isInitialized("location") ? new QPropertyLocationEntity(forProperty("location"), inits.get("location")) : null;
        this.propertySupplier = inits.isInitialized("propertySupplier") ? new QPropertySupplierEntity(forProperty("propertySupplier"), inits.get("propertySupplier")) : null;
    }

}

