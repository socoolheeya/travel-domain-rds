package com.socoolheeya.travel.domain.rds.main.booking.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QVoucherEntity is a Querydsl query type for VoucherEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QVoucherEntity extends EntityPathBase<VoucherEntity> {

    private static final long serialVersionUID = -1413891331L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QVoucherEntity voucherEntity = new QVoucherEntity("voucherEntity");

    public final NumberPath<Integer> adult = createNumber("adult", Integer.class);

    public final QBookingEntity booking;

    public final NumberPath<Integer> children = createNumber("children", Integer.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Integer> numberOfRoom = createNumber("numberOfRoom", Integer.class);

    public final EnumPath<com.socoolheeya.travel.system.core.enums.RoomEnums.RoomType> roomType = createEnum("roomType", com.socoolheeya.travel.system.core.enums.RoomEnums.RoomType.class);

    public QVoucherEntity(String variable) {
        this(VoucherEntity.class, forVariable(variable), INITS);
    }

    public QVoucherEntity(Path<? extends VoucherEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QVoucherEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QVoucherEntity(PathMetadata metadata, PathInits inits) {
        this(VoucherEntity.class, metadata, inits);
    }

    public QVoucherEntity(Class<? extends VoucherEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.booking = inits.isInitialized("booking") ? new QBookingEntity(forProperty("booking"), inits.get("booking")) : null;
    }

}

