package com.socoolheeya.travel.domain.rds.main.booking.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBookingEntity is a Querydsl query type for BookingEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBookingEntity extends EntityPathBase<BookingEntity> {

    private static final long serialVersionUID = 599197800L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBookingEntity bookingEntity = new QBookingEntity("bookingEntity");

    public final com.socoolheeya.travel.domain.rds.common.entity.QBaseEntity _super = new com.socoolheeya.travel.domain.rds.common.entity.QBaseEntity(this);

    public final ListPath<BookingOccupancyEntity, QBookingOccupancyEntity> bookingOccupancies = this.<BookingOccupancyEntity, QBookingOccupancyEntity>createList("bookingOccupancies", BookingOccupancyEntity.class, QBookingOccupancyEntity.class, PathInits.DIRECT2);

    public final EnumPath<com.socoolheeya.travel.domain.rds.main.booking.enums.BookingEnums.Status> bookingStatus = createEnum("bookingStatus", com.socoolheeya.travel.domain.rds.main.booking.enums.BookingEnums.Status.class);

    //inherited
    public final DateTimePath<java.time.ZonedDateTime> createdAt = _super.createdAt;

    //inherited
    public final StringPath createdBy = _super.createdBy;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final com.socoolheeya.travel.domain.rds.main.booking.entity.payment.QPaymentEntity payment;

    public final com.socoolheeya.travel.domain.rds.main.rateplan.entity.QRatePlanEntity ratePlan;

    public final StringPath refBookingNo = createString("refBookingNo");

    //inherited
    public final DateTimePath<java.time.ZonedDateTime> updatedAt = _super.updatedAt;

    //inherited
    public final StringPath updatedBy = _super.updatedBy;

    public final QVoucherEntity voucher;

    public QBookingEntity(String variable) {
        this(BookingEntity.class, forVariable(variable), INITS);
    }

    public QBookingEntity(Path<? extends BookingEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBookingEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBookingEntity(PathMetadata metadata, PathInits inits) {
        this(BookingEntity.class, metadata, inits);
    }

    public QBookingEntity(Class<? extends BookingEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.payment = inits.isInitialized("payment") ? new com.socoolheeya.travel.domain.rds.main.booking.entity.payment.QPaymentEntity(forProperty("payment"), inits.get("payment")) : null;
        this.ratePlan = inits.isInitialized("ratePlan") ? new com.socoolheeya.travel.domain.rds.main.rateplan.entity.QRatePlanEntity(forProperty("ratePlan"), inits.get("ratePlan")) : null;
        this.voucher = inits.isInitialized("voucher") ? new QVoucherEntity(forProperty("voucher"), inits.get("voucher")) : null;
    }

}

