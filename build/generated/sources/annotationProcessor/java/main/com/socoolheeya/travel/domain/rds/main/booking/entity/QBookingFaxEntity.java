package com.socoolheeya.travel.domain.rds.main.booking.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBookingFaxEntity is a Querydsl query type for BookingFaxEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBookingFaxEntity extends EntityPathBase<BookingFaxEntity> {

    private static final long serialVersionUID = 342205115L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBookingFaxEntity bookingFaxEntity = new QBookingFaxEntity("bookingFaxEntity");

    public final QBookingEntity booking;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final EnumPath<com.socoolheeya.travel.domain.rds.main.booking.enums.BookingEnums.FaxStatus> status = createEnum("status", com.socoolheeya.travel.domain.rds.main.booking.enums.BookingEnums.FaxStatus.class);

    public QBookingFaxEntity(String variable) {
        this(BookingFaxEntity.class, forVariable(variable), INITS);
    }

    public QBookingFaxEntity(Path<? extends BookingFaxEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBookingFaxEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBookingFaxEntity(PathMetadata metadata, PathInits inits) {
        this(BookingFaxEntity.class, metadata, inits);
    }

    public QBookingFaxEntity(Class<? extends BookingFaxEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.booking = inits.isInitialized("booking") ? new QBookingEntity(forProperty("booking"), inits.get("booking")) : null;
    }

}

