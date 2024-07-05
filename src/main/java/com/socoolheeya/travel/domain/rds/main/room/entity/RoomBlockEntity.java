package com.socoolheeya.travel.domain.rds.main.room.entity;

import com.socoolheeya.travel.domain.rds.common.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.ConstraintMode;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Comment;

import java.time.LocalDate;

@Getter
@Entity
@Comment("객실 블럭")
@Table(name = "room_block")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RoomBlockEntity extends BaseEntity {
    @Id
    @Column(name = "room_block_id", columnDefinition = "bigint comment '블록 ID'")
    Long id;

    @NotNull
    @Column(name = "sales_day", columnDefinition = "date comment '판매일(yyyy-MM-dd)'")
    LocalDate salesDay;

    @NotNull
    @Column(name = "stock", columnDefinition = "int(5) comment '블럭 수량'")
    Integer stock = 0;

    @Column(name = "is_active", columnDefinition = "bool default 0 comment '사용 여부'")
    Boolean isActive = false;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "room_id", nullable = false, foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    RoomEntity room;

    @Builder
    public RoomBlockEntity(LocalDate salesDay, Integer stock, Boolean isActive) {
        this.salesDay = salesDay;
        this.stock = stock;
        this.isActive = isActive;
    }

}
