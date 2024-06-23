package com.socoolheeya.travel.domain.rds.main.supplier.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSupplierOperationOptionEntity is a Querydsl query type for SupplierOperationOptionEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSupplierOperationOptionEntity extends EntityPathBase<SupplierOperationOptionEntity> {

    private static final long serialVersionUID = 1431807048L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSupplierOperationOptionEntity supplierOperationOptionEntity = new QSupplierOperationOptionEntity("supplierOperationOptionEntity");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final BooleanPath isBatch = createBoolean("isBatch");

    public final DateTimePath<java.time.LocalDateTime> shutdownEndedAt = createDateTime("shutdownEndedAt", java.time.LocalDateTime.class);

    public final DateTimePath<java.time.LocalDateTime> shutdownStartedAt = createDateTime("shutdownStartedAt", java.time.LocalDateTime.class);

    public final QSupplierEntity supplier;

    public QSupplierOperationOptionEntity(String variable) {
        this(SupplierOperationOptionEntity.class, forVariable(variable), INITS);
    }

    public QSupplierOperationOptionEntity(Path<? extends SupplierOperationOptionEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSupplierOperationOptionEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSupplierOperationOptionEntity(PathMetadata metadata, PathInits inits) {
        this(SupplierOperationOptionEntity.class, metadata, inits);
    }

    public QSupplierOperationOptionEntity(Class<? extends SupplierOperationOptionEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.supplier = inits.isInitialized("supplier") ? new QSupplierEntity(forProperty("supplier"), inits.get("supplier")) : null;
    }

}

