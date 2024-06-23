package com.socoolheeya.travel.domain.rds.main.room.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRoomAmenityEntity is a Querydsl query type for RoomAmenityEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRoomAmenityEntity extends EntityPathBase<RoomAmenityEntity> {

    private static final long serialVersionUID = 820710439L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRoomAmenityEntity roomAmenityEntity = new QRoomAmenityEntity("roomAmenityEntity");

    public final EnumPath<com.socoolheeya.travel.system.core.enums.RoomEnums.Amenity> amenity = createEnum("amenity", com.socoolheeya.travel.system.core.enums.RoomEnums.Amenity.class);

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final QRoomEntity room;

    public QRoomAmenityEntity(String variable) {
        this(RoomAmenityEntity.class, forVariable(variable), INITS);
    }

    public QRoomAmenityEntity(Path<? extends RoomAmenityEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRoomAmenityEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRoomAmenityEntity(PathMetadata metadata, PathInits inits) {
        this(RoomAmenityEntity.class, metadata, inits);
    }

    public QRoomAmenityEntity(Class<? extends RoomAmenityEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.room = inits.isInitialized("room") ? new QRoomEntity(forProperty("room"), inits.get("room")) : null;
    }

}

