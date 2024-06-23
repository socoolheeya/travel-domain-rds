package com.socoolheeya.travel.domain.rds.main.supplier.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSupplierEntity is a Querydsl query type for SupplierEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSupplierEntity extends EntityPathBase<SupplierEntity> {

    private static final long serialVersionUID = 1230312058L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSupplierEntity supplierEntity = new QSupplierEntity("supplierEntity");

    public final com.socoolheeya.travel.domain.rds.common.entity.QBaseEntity _super = new com.socoolheeya.travel.domain.rds.common.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.ZonedDateTime> createdAt = _super.createdAt;

    //inherited
    public final StringPath createdBy = _super.createdBy;

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final BooleanPath isEnabled = createBoolean("isEnabled");

    public final StringPath name = createString("name");

    public final com.socoolheeya.travel.domain.rds.main.property.entity.QPropertySupplierEntity propertySupplier;

    public final StringPath shortName = createString("shortName");

    public final QSupplierOperationOptionEntity supplierOperationOption;

    public final EnumPath<com.socoolheeya.travel.system.core.enums.SupplierEnums.Type> type = createEnum("type", com.socoolheeya.travel.system.core.enums.SupplierEnums.Type.class);

    //inherited
    public final DateTimePath<java.time.ZonedDateTime> updatedAt = _super.updatedAt;

    //inherited
    public final StringPath updatedBy = _super.updatedBy;

    public QSupplierEntity(String variable) {
        this(SupplierEntity.class, forVariable(variable), INITS);
    }

    public QSupplierEntity(Path<? extends SupplierEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSupplierEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSupplierEntity(PathMetadata metadata, PathInits inits) {
        this(SupplierEntity.class, metadata, inits);
    }

    public QSupplierEntity(Class<? extends SupplierEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.propertySupplier = inits.isInitialized("propertySupplier") ? new com.socoolheeya.travel.domain.rds.main.property.entity.QPropertySupplierEntity(forProperty("propertySupplier"), inits.get("propertySupplier")) : null;
        this.supplierOperationOption = inits.isInitialized("supplierOperationOption") ? new QSupplierOperationOptionEntity(forProperty("supplierOperationOption"), inits.get("supplierOperationOption")) : null;
    }

}

