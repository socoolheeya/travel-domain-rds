package com.socoolheeya.travel.domain.rds.main.channel.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QChannelEntity is a Querydsl query type for ChannelEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QChannelEntity extends EntityPathBase<ChannelEntity> {

    private static final long serialVersionUID = -1630417112L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QChannelEntity channelEntity = new QChannelEntity("channelEntity");

    public final QChannelGroupEntity channelGroup;

    public final QChannelManagerEntity channelManager;

    public final NumberPath<java.math.BigDecimal> commission = createNumber("commission", java.math.BigDecimal.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final BooleanPath isEnabled = createBoolean("isEnabled");

    public final StringPath name = createString("name");

    public QChannelEntity(String variable) {
        this(ChannelEntity.class, forVariable(variable), INITS);
    }

    public QChannelEntity(Path<? extends ChannelEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QChannelEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QChannelEntity(PathMetadata metadata, PathInits inits) {
        this(ChannelEntity.class, metadata, inits);
    }

    public QChannelEntity(Class<? extends ChannelEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.channelGroup = inits.isInitialized("channelGroup") ? new QChannelGroupEntity(forProperty("channelGroup")) : null;
        this.channelManager = inits.isInitialized("channelManager") ? new QChannelManagerEntity(forProperty("channelManager"), inits.get("channelManager")) : null;
    }

}

