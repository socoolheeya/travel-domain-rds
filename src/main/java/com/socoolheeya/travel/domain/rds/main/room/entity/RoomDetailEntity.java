package com.socoolheeya.travel.domain.rds.main.room.entity;

import com.socoolheeya.travel.domain.rds.common.converter.BooleanToStringConverter;
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
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Comment;

@Getter
@Entity
@Comment("객실 상세 정보")
@Table(name = "room_detail")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RoomDetailEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "room_detail_id", columnDefinition = "bigint comment '객실 상세 정보 ID'")
    Long id;

    @Column(name = "description", columnDefinition = "text comment '설명'")
    String description;

    @Column(name = "memo", columnDefinition = "text comment '메모'")
    String memo;

    @ColumnDefault("'N'")
    @Convert(converter = BooleanToStringConverter.class)
    @Column(name = "is_pending_reservation", columnDefinition = "char(1) comment '대기 예약 여부'")
    Boolean isPendingReservation = false;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "room_id", nullable = false, foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    RoomEntity room;

    @Builder
    public RoomDetailEntity(Long id, String description, String memo, Boolean isPendingReservation) {
        this.id = id;
        this.description = description;
        this.memo = memo;
        this.isPendingReservation = isPendingReservation;
        this.room = null;
    }


}
