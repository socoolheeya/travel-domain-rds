package com.socoolheeya.travel.domain.rds.main.booking.entity.payment;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPaymentEntity is a Querydsl query type for PaymentEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPaymentEntity extends EntityPathBase<PaymentEntity> {

    private static final long serialVersionUID = -1518912915L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPaymentEntity paymentEntity = new QPaymentEntity("paymentEntity");

    public final com.socoolheeya.travel.domain.rds.main.booking.entity.QBookingEntity booking;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final EnumPath<com.socoolheeya.travel.domain.rds.main.booking.enums.BookingEnums.PaymentType> paymentType = createEnum("paymentType", com.socoolheeya.travel.domain.rds.main.booking.enums.BookingEnums.PaymentType.class);

    public QPaymentEntity(String variable) {
        this(PaymentEntity.class, forVariable(variable), INITS);
    }

    public QPaymentEntity(Path<? extends PaymentEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPaymentEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPaymentEntity(PathMetadata metadata, PathInits inits) {
        this(PaymentEntity.class, metadata, inits);
    }

    public QPaymentEntity(Class<? extends PaymentEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.booking = inits.isInitialized("booking") ? new com.socoolheeya.travel.domain.rds.main.booking.entity.QBookingEntity(forProperty("booking"), inits.get("booking")) : null;
    }

}

