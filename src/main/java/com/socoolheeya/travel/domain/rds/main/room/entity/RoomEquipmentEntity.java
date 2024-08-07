package com.socoolheeya.travel.domain.rds.main.room.entity;

import com.socoolheeya.travel.system.core.enums.RoomEnums;
import jakarta.persistence.Column;
import jakarta.persistence.ConstraintMode;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
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
@Comment("객실 내 포함시설")
@Table(name = "room_equipment")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RoomEquipmentEntity {
    @Id
    @Column(name = "room_amenity_id", columnDefinition = "bigint comment '객실 내 포함시설 ID'")
    Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "equipment", columnDefinition = "varchar(20) comment '객실 내 포함시설'")
    RoomEnums.Equipment equipment;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "room_id", nullable = false, foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    RoomEntity room;

    @Builder
    public RoomEquipmentEntity(Long id, RoomEnums.Equipment equipment) {
        this.id = id;
        this.equipment = equipment;
        this.room = null;
    }
}
