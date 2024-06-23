package com.socoolheeya.travel.domain.rds.main.channel.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QChannelGroupEntity is a Querydsl query type for ChannelGroupEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QChannelGroupEntity extends EntityPathBase<ChannelGroupEntity> {

    private static final long serialVersionUID = 1229980445L;

    public static final QChannelGroupEntity channelGroupEntity = new QChannelGroupEntity("channelGroupEntity");

    public final ListPath<ChannelEntity, QChannelEntity> channels = this.<ChannelEntity, QChannelEntity>createList("channels", ChannelEntity.class, QChannelEntity.class, PathInits.DIRECT2);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public QChannelGroupEntity(String variable) {
        super(ChannelGroupEntity.class, forVariable(variable));
    }

    public QChannelGroupEntity(Path<? extends ChannelGroupEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QChannelGroupEntity(PathMetadata metadata) {
        super(ChannelGroupEntity.class, metadata);
    }

}

