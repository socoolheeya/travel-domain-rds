package com.socoolheeya.travel.domain.rds.main.room.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRoomEntity is a Querydsl query type for RoomEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRoomEntity extends EntityPathBase<RoomEntity> {

    private static final long serialVersionUID = 2145522200L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRoomEntity roomEntity = new QRoomEntity("roomEntity");

    public final com.socoolheeya.travel.domain.rds.common.entity.QBaseEntity _super = new com.socoolheeya.travel.domain.rds.common.entity.QBaseEntity(this);

    public final ListPath<RoomAmenityEntity, QRoomAmenityEntity> amenities = this.<RoomAmenityEntity, QRoomAmenityEntity>createList("amenities", RoomAmenityEntity.class, QRoomAmenityEntity.class, PathInits.DIRECT2);

    public final ListPath<RoomBlockEntity, QRoomBlockEntity> blocks = this.<RoomBlockEntity, QRoomBlockEntity>createList("blocks", RoomBlockEntity.class, QRoomBlockEntity.class, PathInits.DIRECT2);

    //inherited
    public final DateTimePath<java.time.ZonedDateTime> createdAt = _super.createdAt;

    //inherited
    public final StringPath createdBy = _super.createdBy;

    public final StringPath description = createString("description");

    public final ListPath<RoomEquipmentEntity, QRoomEquipmentEntity> equipments = this.<RoomEquipmentEntity, QRoomEquipmentEntity>createList("equipments", RoomEquipmentEntity.class, QRoomEquipmentEntity.class, PathInits.DIRECT2);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<RoomImageEntity, QRoomImageEntity> images = this.<RoomImageEntity, QRoomImageEntity>createList("images", RoomImageEntity.class, QRoomImageEntity.class, PathInits.DIRECT2);

    public final BooleanPath isEnabled = createBoolean("isEnabled");

    public final BooleanPath isSameDayBooking = createBoolean("isSameDayBooking");

    public final StringPath name = createString("name");

    public final QRoomOccupancyEntity roomOccupancy;

    public final ListPath<RoomRatePlanEntity, QRoomRatePlanEntity> roomRatePlans = this.<RoomRatePlanEntity, QRoomRatePlanEntity>createList("roomRatePlans", RoomRatePlanEntity.class, QRoomRatePlanEntity.class, PathInits.DIRECT2);

    public final ListPath<RoomServiceEntity, QRoomServiceEntity> roomServices = this.<RoomServiceEntity, QRoomServiceEntity>createList("roomServices", RoomServiceEntity.class, QRoomServiceEntity.class, PathInits.DIRECT2);

    public final NumberPath<Double> roomSize = createNumber("roomSize", Double.class);

    public final EnumPath<com.socoolheeya.travel.system.core.enums.RoomEnums.RoomSizeUnit> roomSizeUnit = createEnum("roomSizeUnit", com.socoolheeya.travel.system.core.enums.RoomEnums.RoomSizeUnit.class);

    //inherited
    public final DateTimePath<java.time.ZonedDateTime> updatedAt = _super.updatedAt;

    //inherited
    public final StringPath updatedBy = _super.updatedBy;

    public final EnumPath<com.socoolheeya.travel.system.core.enums.RoomEnums.View> view = createEnum("view", com.socoolheeya.travel.system.core.enums.RoomEnums.View.class);

    public QRoomEntity(String variable) {
        this(RoomEntity.class, forVariable(variable), INITS);
    }

    public QRoomEntity(Path<? extends RoomEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRoomEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRoomEntity(PathMetadata metadata, PathInits inits) {
        this(RoomEntity.class, metadata, inits);
    }

    public QRoomEntity(Class<? extends RoomEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.roomOccupancy = inits.isInitialized("roomOccupancy") ? new QRoomOccupancyEntity(forProperty("roomOccupancy"), inits.get("roomOccupancy")) : null;
    }

}

