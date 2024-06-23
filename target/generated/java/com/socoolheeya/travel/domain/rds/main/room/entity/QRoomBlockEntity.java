package com.socoolheeya.travel.domain.rds.main.room.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRoomBlockEntity is a Querydsl query type for RoomBlockEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRoomBlockEntity extends EntityPathBase<RoomBlockEntity> {

    private static final long serialVersionUID = -752901701L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRoomBlockEntity roomBlockEntity = new QRoomBlockEntity("roomBlockEntity");

    public final com.socoolheeya.travel.domain.rds.common.entity.QBaseEntity _super = new com.socoolheeya.travel.domain.rds.common.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.ZonedDateTime> createdAt = _super.createdAt;

    //inherited
    public final StringPath createdBy = _super.createdBy;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final BooleanPath isEnabled = createBoolean("isEnabled");

    public final QRoomEntity room;

    public final DatePath<java.time.LocalDate> salesDay = createDate("salesDay", java.time.LocalDate.class);

    public final NumberPath<Integer> stock = createNumber("stock", Integer.class);

    //inherited
    public final DateTimePath<java.time.ZonedDateTime> updatedAt = _super.updatedAt;

    //inherited
    public final StringPath updatedBy = _super.updatedBy;

    public QRoomBlockEntity(String variable) {
        this(RoomBlockEntity.class, forVariable(variable), INITS);
    }

    public QRoomBlockEntity(Path<? extends RoomBlockEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRoomBlockEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRoomBlockEntity(PathMetadata metadata, PathInits inits) {
        this(RoomBlockEntity.class, metadata, inits);
    }

    public QRoomBlockEntity(Class<? extends RoomBlockEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.room = inits.isInitialized("room") ? new QRoomEntity(forProperty("room"), inits.get("room")) : null;
    }

}

