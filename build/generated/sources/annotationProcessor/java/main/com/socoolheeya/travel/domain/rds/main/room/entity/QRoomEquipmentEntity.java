package com.socoolheeya.travel.domain.rds.main.room.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRoomEquipmentEntity is a Querydsl query type for RoomEquipmentEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRoomEquipmentEntity extends EntityPathBase<RoomEquipmentEntity> {

    private static final long serialVersionUID = -1302081412L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRoomEquipmentEntity roomEquipmentEntity = new QRoomEquipmentEntity("roomEquipmentEntity");

    public final EnumPath<com.socoolheeya.travel.system.core.enums.RoomEnums.Equipment> equipment = createEnum("equipment", com.socoolheeya.travel.system.core.enums.RoomEnums.Equipment.class);

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final QRoomEntity room;

    public QRoomEquipmentEntity(String variable) {
        this(RoomEquipmentEntity.class, forVariable(variable), INITS);
    }

    public QRoomEquipmentEntity(Path<? extends RoomEquipmentEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRoomEquipmentEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRoomEquipmentEntity(PathMetadata metadata, PathInits inits) {
        this(RoomEquipmentEntity.class, metadata, inits);
    }

    public QRoomEquipmentEntity(Class<? extends RoomEquipmentEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.room = inits.isInitialized("room") ? new QRoomEntity(forProperty("room"), inits.get("room")) : null;
    }

}

