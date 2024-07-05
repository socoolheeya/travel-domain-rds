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
@Comment("객실 서비스")
@Table(name = "room_service")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RoomServiceEntity {
    @Id
    @Column(name = "room_service_id", columnDefinition = "bigint comment '객실 서비스 ID'")
    Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "service", columnDefinition = "varchar(20) comment '객실 서비스'")
    RoomEnums.Service service;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "room_id", nullable = false, foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    RoomEntity room;

    @Builder
    public RoomServiceEntity(Long id, RoomEnums.Service service) {
        this.id = id;
        this.service = service;
        this.room = null;
    }

}
