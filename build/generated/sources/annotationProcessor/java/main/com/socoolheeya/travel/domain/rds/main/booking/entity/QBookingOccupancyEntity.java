package com.socoolheeya.travel.domain.rds.main.booking.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBookingOccupancyEntity is a Querydsl query type for BookingOccupancyEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBookingOccupancyEntity extends EntityPathBase<BookingOccupancyEntity> {

    private static final long serialVersionUID = 453915563L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBookingOccupancyEntity bookingOccupancyEntity = new QBookingOccupancyEntity("bookingOccupancyEntity");

    public final QBookingEntity booking;

    public final ListPath<BookingGuestEntity, QBookingGuestEntity> bookingGuests = this.<BookingGuestEntity, QBookingGuestEntity>createList("bookingGuests", BookingGuestEntity.class, QBookingGuestEntity.class, PathInits.DIRECT2);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Integer> totalAdults = createNumber("totalAdults", Integer.class);

    public final NumberPath<Integer> totalChildren = createNumber("totalChildren", Integer.class);

    public QBookingOccupancyEntity(String variable) {
        this(BookingOccupancyEntity.class, forVariable(variable), INITS);
    }

    public QBookingOccupancyEntity(Path<? extends BookingOccupancyEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBookingOccupancyEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBookingOccupancyEntity(PathMetadata metadata, PathInits inits) {
        this(BookingOccupancyEntity.class, metadata, inits);
    }

    public QBookingOccupancyEntity(Class<? extends BookingOccupancyEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.booking = inits.isInitialized("booking") ? new QBookingEntity(forProperty("booking"), inits.get("booking")) : null;
    }

}

