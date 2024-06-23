package com.socoolheeya.travel.domain.rds.main.booking.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBookingBasicInformationEntity is a Querydsl query type for BookingBasicInformationEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBookingBasicInformationEntity extends EntityPathBase<BookingBasicInformationEntity> {

    private static final long serialVersionUID = -251937754L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBookingBasicInformationEntity bookingBasicInformationEntity = new QBookingBasicInformationEntity("bookingBasicInformationEntity");

    public final QBookingEntity booking;

    public final DatePath<java.time.LocalDate> checkin = createDate("checkin", java.time.LocalDate.class);

    public final DatePath<java.time.LocalDate> checkout = createDate("checkout", java.time.LocalDate.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Integer> nights = createNumber("nights", Integer.class);

    public QBookingBasicInformationEntity(String variable) {
        this(BookingBasicInformationEntity.class, forVariable(variable), INITS);
    }

    public QBookingBasicInformationEntity(Path<? extends BookingBasicInformationEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBookingBasicInformationEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBookingBasicInformationEntity(PathMetadata metadata, PathInits inits) {
        this(BookingBasicInformationEntity.class, metadata, inits);
    }

    public QBookingBasicInformationEntity(Class<? extends BookingBasicInformationEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.booking = inits.isInitialized("booking") ? new QBookingEntity(forProperty("booking"), inits.get("booking")) : null;
    }

}

