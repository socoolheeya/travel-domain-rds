package com.socoolheeya.travel.domain.rds.main.room.entity.pk;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QRoomRatePlanId is a Querydsl query type for RoomRatePlanId
 */
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QRoomRatePlanId extends BeanPath<RoomRatePlanId> {

    private static final long serialVersionUID = -1543669704L;

    public static final QRoomRatePlanId roomRatePlanId = new QRoomRatePlanId("roomRatePlanId");

    public final NumberPath<Long> ratePlanId = createNumber("ratePlanId", Long.class);

    public final NumberPath<Long> roomId = createNumber("roomId", Long.class);

    public QRoomRatePlanId(String variable) {
        super(RoomRatePlanId.class, forVariable(variable));
    }

    public QRoomRatePlanId(Path<? extends RoomRatePlanId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QRoomRatePlanId(PathMetadata metadata) {
        super(RoomRatePlanId.class, metadata);
    }

}

