package com.socoolheeya.travel.domain.rds.main.room.entity;

import com.socoolheeya.travel.domain.rds.common.converter.BooleanToStringConverter;
import com.socoolheeya.travel.domain.rds.common.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.ConstraintMode;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Comment;

@Getter
@Entity
@Comment("객실 이미지")
@Table(name = "room_image")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RoomImageEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "room_image_id", columnDefinition = "bigint comment '객실 이미지 ID'")
    Long id;

    @Column(name = "name", columnDefinition = "varchar(500) comment '파일명'")
    String name;

    @Column(name = "path", columnDefinition = "varchar(1000) comment '이미지 경로'")
    String path;

    @Convert(converter = BooleanToStringConverter.class)
    @Column(name = "coverYn", columnDefinition = "char(1) comment '대표 이미지 여부'")
    Boolean isCover = false;

    @Convert(converter = BooleanToStringConverter.class)
    @Column(name = "useYn", columnDefinition = "char(1) comment '사용여부'")
    Boolean isActive = true;

    @Column(name = "sequence", columnDefinition = "smallint comment '순서'")
    Integer sequence = 1;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "room_id", nullable = false, foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    RoomEntity room;

    @Builder
    public RoomImageEntity(Long id, String name, String path, Boolean isCover, Boolean isActive, Integer sequence) {
        this.id = id;
        this.name = name;
        this.path = path;
        this.isCover = isCover;
        this.isActive = isActive;
        this.sequence = sequence;
        this.room = null;
    }

}
