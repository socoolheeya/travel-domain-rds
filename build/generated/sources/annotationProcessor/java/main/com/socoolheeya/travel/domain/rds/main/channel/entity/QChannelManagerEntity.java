package com.socoolheeya.travel.domain.rds.main.channel.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QChannelManagerEntity is a Querydsl query type for ChannelManagerEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QChannelManagerEntity extends EntityPathBase<ChannelManagerEntity> {

    private static final long serialVersionUID = -395741429L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QChannelManagerEntity channelManagerEntity = new QChannelManagerEntity("channelManagerEntity");

    public final StringPath accountKey = createString("accountKey");

    public final QChannelEntity channel;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final BooleanPath isEnabled = createBoolean("isEnabled");

    public final StringPath password = createString("password");

    public QChannelManagerEntity(String variable) {
        this(ChannelManagerEntity.class, forVariable(variable), INITS);
    }

    public QChannelManagerEntity(Path<? extends ChannelManagerEntity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QChannelManagerEntity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QChannelManagerEntity(PathMetadata metadata, PathInits inits) {
        this(ChannelManagerEntity.class, metadata, inits);
    }

    public QChannelManagerEntity(Class<? extends ChannelManagerEntity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.channel = inits.isInitialized("channel") ? new QChannelEntity(forProperty("channel"), inits.get("channel")) : null;
    }

}

