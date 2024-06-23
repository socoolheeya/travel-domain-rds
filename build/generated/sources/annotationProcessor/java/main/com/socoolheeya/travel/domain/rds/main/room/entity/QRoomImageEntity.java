package com.socoolheeya.travel.domain.rds.main.room.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRoomImageEntity is a Querydsl query type for RoomImageEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRoomImageEntity extends EntityPathBase<RoomImageEntity> {

    private static final long serialVersionUID = 537605129L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRoomImageEntity roomImageEntity = new QRoomImageEntity("roomImageEntity");

    public final com.socoolheeya.travel.domain.rds.common.entity.QBaseEntity _super = new com.socoolheeya.travel.domain.rds.common.entity.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.ZonedDateTime> createdAt = _super.createdAt;

    //inherited
    public final StringPath createdBy = _super.createdBy;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final BooleanPath isCover = createBoolean("isCover");

    public final BooleanPath isUsable = createBoolean("isUsable");

    public final StringPath name = createString("name");

    public final StringPath path = createString("path");

    public final QRoomEntity room;

    public final NumberPath<Integer> sequence = createNumber("sequence", Integer.class);

    //inherited
    public final DateTimePath<java.time.ZonedDateTime> updatedAt = _super.updatedAt;

    //inherited
    public final StringPath updatedBy = _super.updatedBy;

    public QRoomImageEntity(String variable) {
        this(RoomImageEntity.class, forVariable(variable), INITS);
    }

    public QRoomImageEntity(Path<? extends RoomImageEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRoomImageEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRoomImageEntity(PathMetadata metadata, PathInits inits) {
        this(RoomImageEntity.class, metadata, inits);
    }

    public QRoomImageEntity(Class<? extends RoomImageEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.room = inits.isInitialized("room") ? new QRoomEntity(forProperty("room"), inits.get("room")) : null;
    }

}

