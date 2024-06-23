package com.socoolheeya.travel.domain.rds.main.room.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRoomRatePlanEntity is a Querydsl query type for RoomRatePlanEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRoomRatePlanEntity extends EntityPathBase<RoomRatePlanEntity> {

    private static final long serialVersionUID = -308784479L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRoomRatePlanEntity roomRatePlanEntity = new QRoomRatePlanEntity("roomRatePlanEntity");

    public final DateTimePath<java.time.LocalDateTime> createdAt = createDateTime("createdAt", java.time.LocalDateTime.class);

    public final com.socoolheeya.travel.domain.rds.main.room.entity.pk.QRoomRatePlanId id;

    public final BooleanPath isEnabled = createBoolean("isEnabled");

    public final com.socoolheeya.travel.domain.rds.main.rateplan.entity.QRatePlanEntity ratePlan;

    public final QRoomEntity room;

    public QRoomRatePlanEntity(String variable) {
        this(RoomRatePlanEntity.class, forVariable(variable), INITS);
    }

    public QRoomRatePlanEntity(Path<? extends RoomRatePlanEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRoomRatePlanEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRoomRatePlanEntity(PathMetadata metadata, PathInits inits) {
        this(RoomRatePlanEntity.class, metadata, inits);
    }

    public QRoomRatePlanEntity(Class<? extends RoomRatePlanEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.id = inits.isInitialized("id") ? new com.socoolheeya.travel.domain.rds.main.room.entity.pk.QRoomRatePlanId(forProperty("id")) : null;
        this.ratePlan = inits.isInitialized("ratePlan") ? new com.socoolheeya.travel.domain.rds.main.rateplan.entity.QRatePlanEntity(forProperty("ratePlan"), inits.get("ratePlan")) : null;
        this.room = inits.isInitialized("room") ? new QRoomEntity(forProperty("room"), inits.get("room")) : null;
    }

}

