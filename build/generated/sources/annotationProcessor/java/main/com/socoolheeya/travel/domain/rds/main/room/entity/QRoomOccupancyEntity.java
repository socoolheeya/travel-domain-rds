package com.socoolheeya.travel.domain.rds.main.room.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRoomOccupancyEntity is a Querydsl query type for RoomOccupancyEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRoomOccupancyEntity extends EntityPathBase<RoomOccupancyEntity> {

    private static final long serialVersionUID = -960819205L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRoomOccupancyEntity roomOccupancyEntity = new QRoomOccupancyEntity("roomOccupancyEntity");

    public final NumberPath<Integer> adults = createNumber("adults", Integer.class);

    public final NumberPath<Integer> children = createNumber("children", Integer.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Integer> max = createNumber("max", Integer.class);

    public final NumberPath<Integer> min = createNumber("min", Integer.class);

    public final QRoomEntity room;

    public QRoomOccupancyEntity(String variable) {
        this(RoomOccupancyEntity.class, forVariable(variable), INITS);
    }

    public QRoomOccupancyEntity(Path<? extends RoomOccupancyEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRoomOccupancyEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRoomOccupancyEntity(PathMetadata metadata, PathInits inits) {
        this(RoomOccupancyEntity.class, metadata, inits);
    }

    public QRoomOccupancyEntity(Class<? extends RoomOccupancyEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.room = inits.isInitialized("room") ? new QRoomEntity(forProperty("room"), inits.get("room")) : null;
    }

}

