package com.socoolheeya.travel.domain.rds.main.booking.entity;

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
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Getter
@Entity
@Table(name = "booking_rate")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BookingRateEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "booking_rate_id", columnDefinition = "bigint comment '예약 요금 정보 ID'")
    Long id;

    @Column(name = "sales_day", columnDefinition = "date comment '판매 날짜(yyyy-MM-dd)'")
    LocalDate salesDay;

    @Column(name = "sales_limit", columnDefinition = "int(5) comment '판매 제한 수량'")
    Integer salesLimit;

    @Column(name = "checkin_date_available_yn", columnDefinition = "char(1) comment '체크인 날짜 판매 여부'")
    Boolean isCheckinDateAvailable;

    @Column(name = "checkout_date_available_yn", columnDefinition = "char(1) comment '체크아웃 날짜 판매 여부'")
    Boolean isCheckoutDateAvailable;

    @NotNull
    @Convert(converter = BooleanToStringConverter.class)
    @Column(name = "close_yn", columnDefinition = "char(1) comment '마감 여부'")
    Boolean isClosed;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "booking_id", nullable = false, foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    BookingEntity booking;
}
