package com.socoolheeya.travel.domain.rds.main.rateplan.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMealPlanEntity is a Querydsl query type for MealPlanEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMealPlanEntity extends EntityPathBase<MealPlanEntity> {

    private static final long serialVersionUID = 1839543479L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMealPlanEntity mealPlanEntity = new QMealPlanEntity("mealPlanEntity");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final BooleanPath isBreakfast = createBoolean("isBreakfast");

    public final BooleanPath isDinner = createBoolean("isDinner");

    public final BooleanPath isLunch = createBoolean("isLunch");

    public final QRatePlanEntity ratePlan;

    public QMealPlanEntity(String variable) {
        this(MealPlanEntity.class, forVariable(variable), INITS);
    }

    public QMealPlanEntity(Path<? extends MealPlanEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMealPlanEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMealPlanEntity(PathMetadata metadata, PathInits inits) {
        this(MealPlanEntity.class, metadata, inits);
    }

    public QMealPlanEntity(Class<? extends MealPlanEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.ratePlan = inits.isInitialized("ratePlan") ? new QRatePlanEntity(forProperty("ratePlan"), inits.get("ratePlan")) : null;
    }

}

