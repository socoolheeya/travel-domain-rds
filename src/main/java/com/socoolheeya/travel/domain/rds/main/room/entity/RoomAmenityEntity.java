package com.socoolheeya.travel.domain.rds.main.room.entity;


import com.socoolheeya.travel.system.core.enums.RoomEnums;
import jakarta.persistence.Column;
import jakarta.persistence.ConstraintMode;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
@Comment("객실 어메니티")
@Table(name = "room_amenity")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RoomAmenityEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "room_amenity_id", columnDefinition = "int(6) comment '객실 어메니티 ID'")
    Integer id;

    @Enumerated(EnumType.STRING)
    @Column(name = "amenity", columnDefinition = "varchar(20) comment '객실 어메니티'")
    RoomEnums.Amenity amenity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "room_id", nullable = false, foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    RoomEntity room;

    @Builder
    public RoomAmenityEntity(Integer id, RoomEnums.Amenity amenity) {
        this.id = id;
        this.amenity = amenity;
        this.room = null;
    }
}
