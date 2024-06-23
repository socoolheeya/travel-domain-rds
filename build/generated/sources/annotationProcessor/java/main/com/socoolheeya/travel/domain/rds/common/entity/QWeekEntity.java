package com.socoolheeya.travel.domain.rds.common.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QWeekEntity is a Querydsl query type for WeekEntity
 */
@Generated("com.querydsl.codegen.DefaultSupertypeSerializer")
public class QWeekEntity extends EntityPathBase<WeekEntity> {

    private static final long serialVersionUID = 308078834L;

    public static final QWeekEntity weekEntity = new QWeekEntity("weekEntity");

    public final BooleanPath friday = createBoolean("friday");

    public final BooleanPath monday = createBoolean("monday");

    public final BooleanPath saturday = createBoolean("saturday");

    public final BooleanPath sunday = createBoolean("sunday");

    public final BooleanPath thursday = createBoolean("thursday");

    public final BooleanPath tuesday = createBoolean("tuesday");

    public final BooleanPath wednesday = createBoolean("wednesday");

    public QWeekEntity(String variable) {
        super(WeekEntity.class, forVariable(variable));
    }

    public QWeekEntity(Path<? extends WeekEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QWeekEntity(PathMetadata metadata) {
        super(WeekEntity.class, metadata);
    }

}

