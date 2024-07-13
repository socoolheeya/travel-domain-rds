package com.socoolheeya.travel.domain.rds.main.room.entity;


import com.socoolheeya.travel.domain.rds.common.converter.BooleanToStringConverter;
import com.socoolheeya.travel.domain.rds.common.entity.BaseEntity;
import com.socoolheeya.travel.domain.rds.main.property.entity.PropertyEntity;
import com.socoolheeya.travel.system.core.enums.RoomEnums;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.ConstraintMode;
import jakarta.persistence.Convert;
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
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Comment;

import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
@Comment("객실")
@Table(name = "room")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RoomEntity extends BaseEntity {
    @Id
    @Column(name = "room_id", columnDefinition = "bigint comment '객실 ID'")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @NotNull
    @Column(name = "name", columnDefinition = "varchar(500) comment '객실명'")
    String name;

    @Column(name = "room_size", columnDefinition = "double comment '객실 사이즈'")
    Double roomSize;

    @Column(name = "room_size_unit", columnDefinition = "varchar(25) comment '객실 사이즈 단위'")
    RoomEnums.RoomSizeUnit roomSizeUnit;

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "varchar(50) comment '전망'")
    RoomEnums.View view;

    @ColumnDefault("'N'")
    @Convert(converter = BooleanToStringConverter.class)
    @Column(name = "smoking_yn", columnDefinition = "char(1) comment '흡연 가능 여부'")
    Boolean isSmoking = false;

    @ColumnDefault("'N'")
    @Column(name = "same_day_booking_yn", columnDefinition = "char(1) comment '당일 예약 가능 여부'")
    Boolean isSameDayBooking = false;

    @ColumnDefault("'N'")
    @Convert(converter = BooleanToStringConverter.class)
    @Column(name = "use_yn", columnDefinition = "char(1) comment '사용 여부'")
    Boolean isActive = true;

    @Column(name = "cms_room_id", columnDefinition = "varchar(255) comment 'CMS 객실 ID'")
    String cmsRoomId;

    @OneToOne(mappedBy = "room", fetch = FetchType.LAZY)
    RoomOccupancyEntity roomOccupancy;

    @OneToMany(mappedBy = "room")
    List<RoomAmenityEntity> amenities = new ArrayList<>();

    @OneToMany(mappedBy = "room")
    List<RoomEquipmentEntity> equipments = new ArrayList<>();

    @OneToMany(mappedBy = "room")
    List<RoomServiceEntity> roomServices = new ArrayList<>();

    @OneToMany(mappedBy = "room")
    List<RoomImageEntity> images = new ArrayList<>();

    @OneToMany(mappedBy = "room")
    List<RoomTranslationEntity> roomTranslations = new ArrayList<>();

    @OneToMany(mappedBy = "room", orphanRemoval = true, cascade = CascadeType.ALL)
    List<RoomRatePlanEntity> roomRatePlans = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "property_id", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    PropertyEntity property;

    @Builder
    public RoomEntity(String name, Double roomSize, RoomEnums.RoomSizeUnit roomSizeUnit, RoomEnums.View view, Boolean isSmoking, Boolean isSameDayBooking, Boolean isActive, String cmsRoomId, RoomOccupancyEntity roomOccupancy) {
        this.name = name;
        this.roomSize = roomSize;
        this.roomSizeUnit = roomSizeUnit;
        this.view = view;
        this.isSmoking = isSmoking;
        this.isSameDayBooking = isSameDayBooking;
        this.isActive = isActive;
        this.cmsRoomId = cmsRoomId;
        this.roomOccupancy = roomOccupancy;
    }
}
