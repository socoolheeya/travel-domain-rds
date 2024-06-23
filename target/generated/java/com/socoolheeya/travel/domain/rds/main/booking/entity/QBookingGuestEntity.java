package com.socoolheeya.travel.domain.rds.main.booking.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBookingGuestEntity is a Querydsl query type for BookingGuestEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBookingGuestEntity extends EntityPathBase<BookingGuestEntity> {

    private static final long serialVersionUID = -754769290L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBookingGuestEntity bookingGuestEntity = new QBookingGuestEntity("bookingGuestEntity");

    public final NumberPath<Integer> age = createNumber("age", Integer.class);

    public final QBookingOccupancyEntity bookingOccupancy;

    public final EnumPath<com.socoolheeya.travel.domain.rds.main.booking.enums.BookingEnums.Gender> gender = createEnum("gender", com.socoolheeya.travel.domain.rds.main.booking.enums.BookingEnums.Gender.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final BooleanPath isMainHolder = createBoolean("isMainHolder");

    public final StringPath name = createString("name");

    public final StringPath phone = createString("phone");

    public QBookingGuestEntity(String variable) {
        this(BookingGuestEntity.class, forVariable(variable), INITS);
    }

    public QBookingGuestEntity(Path<? extends BookingGuestEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBookingGuestEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBookingGuestEntity(PathMetadata metadata, PathInits inits) {
        this(BookingGuestEntity.class, metadata, inits);
    }

    public QBookingGuestEntity(Class<? extends BookingGuestEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.bookingOccupancy = inits.isInitialized("bookingOccupancy") ? new QBookingOccupancyEntity(forProperty("bookingOccupancy"), inits.get("bookingOccupancy")) : null;
    }

}

