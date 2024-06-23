package com.socoolheeya.travel.domain.rds.main.room.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRoomServiceEntity is a Querydsl query type for RoomServiceEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRoomServiceEntity extends EntityPathBase<RoomServiceEntity> {

    private static final long serialVersionUID = -494119133L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRoomServiceEntity roomServiceEntity = new QRoomServiceEntity("roomServiceEntity");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final QRoomEntity room;

    public final EnumPath<com.socoolheeya.travel.system.core.enums.RoomEnums.Service> service = createEnum("service", com.socoolheeya.travel.system.core.enums.RoomEnums.Service.class);

    public QRoomServiceEntity(String variable) {
        this(RoomServiceEntity.class, forVariable(variable), INITS);
    }

    public QRoomServiceEntity(Path<? extends RoomServiceEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRoomServiceEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRoomServiceEntity(PathMetadata metadata, PathInits inits) {
        this(RoomServiceEntity.class, metadata, inits);
    }

    public QRoomServiceEntity(Class<? extends RoomServiceEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.room = inits.isInitialized("room") ? new QRoomEntity(forProperty("room"), inits.get("room")) : null;
    }

}

