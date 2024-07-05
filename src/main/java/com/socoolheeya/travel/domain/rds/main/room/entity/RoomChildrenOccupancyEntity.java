package com.socoolheeya.travel.domain.rds.main.room.entity;

import jakarta.persistence.Column;
import jakarta.persistence.ConstraintMode;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Comment;

@Getter
@Entity
@Comment("객실 어린이 수용정보")
@Table(name = "room_children_occupancy")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RoomChildrenOccupancyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "room_children_occupancy_id", columnDefinition = "bigint comment '객실 어린이 수용정보 ID'")
    Long id;

    @Column(columnDefinition = "smallint comment '아동 기준 인원 수'")
    Integer standard;

    @Column(name = "min", columnDefinition = "smallint comment '아동 최소 인원 수'")
    Integer min;

    @Column(name = "max", columnDefinition = "smallint comment '아동 최대 인원 수'")
    Integer max;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "room_occupancy_id", nullable = false, foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    RoomOccupancyEntity roomOccupancy;

    public RoomChildrenOccupancyEntity(Long id, Integer standard, Integer min, Integer max) {
        this.id = id;
        this.standard = standard;
        this.min = min;
        this.max = max;
        this.roomOccupancy = null;
    }
}
