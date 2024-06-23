package com.socoolheeya.travel.domain.rds.main.booking.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBookingChildPlanEntity is a Querydsl query type for BookingChildPlanEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBookingChildPlanEntity extends EntityPathBase<BookingChildPlanEntity> {

    private static final long serialVersionUID = 774166467L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBookingChildPlanEntity bookingChildPlanEntity = new QBookingChildPlanEntity("bookingChildPlanEntity");

    public final NumberPath<Integer> age = createNumber("age", Integer.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final QBookingOccupancyEntity occupancy;

    public QBookingChildPlanEntity(String variable) {
        this(BookingChildPlanEntity.class, forVariable(variable), INITS);
    }

    public QBookingChildPlanEntity(Path<? extends BookingChildPlanEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBookingChildPlanEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBookingChildPlanEntity(PathMetadata metadata, PathInits inits) {
        this(BookingChildPlanEntity.class, metadata, inits);
    }

    public QBookingChildPlanEntity(Class<? extends BookingChildPlanEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.occupancy = inits.isInitialized("occupancy") ? new QBookingOccupancyEntity(forProperty("occupancy"), inits.get("occupancy")) : null;
    }

}

