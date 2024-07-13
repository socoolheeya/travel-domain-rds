package com.socoolheeya.travel.domain.rds.main.rateplan.entity;

import com.socoolheeya.travel.domain.rds.common.converter.BooleanToStringConverter;
import com.socoolheeya.travel.domain.rds.common.converter.CommissionPriceTypeConverter;
import com.socoolheeya.travel.domain.rds.common.entity.BaseEntity;
import com.socoolheeya.travel.system.core.enums.PropertyEnums;
import com.socoolheeya.travel.system.core.enums.RatePlanEnums;
import jakarta.persistence.Column;
import jakarta.persistence.ConstraintMode;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Comment;

import java.math.BigDecimal;

@Getter
@Entity
@Comment("요금제 정산 커미션 정보")
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "rate_plan_settlement_commission")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RatePlanSettlementCommissionEntity extends BaseEntity {
    @Id
    @Column(name = "rate_plan_settlement_id", columnDefinition = "bigint comment '숙소 정산 커미션 ID'")
    Long id;

    @Column(name ="commission_type", columnDefinition = "varchar(255) comment '수수료 타입'")
    String commissionType;

    @Enumerated(EnumType.STRING)
    @Column(name = "commission_mode", columnDefinition = "varchar(255) comment '수수료 모드'")
    RatePlanEnums.CommissionMode commissionMode;

    @Column(name = "commission", columnDefinition = "decimal(10,2) comment '수수료'")
    BigDecimal commission;

    @Column(name = "weekly_commission", columnDefinition = "decimal(10,2) comment '주중 커미션'")
    BigDecimal weeklyCommission;

    @Column(name = "weekend_commission", columnDefinition = "decimal(10,2) comment '주말 커미션'")
    BigDecimal weekendCommission;

    @Convert(converter = CommissionPriceTypeConverter.class)
    @Column(name = "commission_price_type", columnDefinition = "varchar(10) comment '커미션 요금 타입'")
    PropertyEnums.CommissionPriceType commissionPriceType;

    @Convert(converter = BooleanToStringConverter.class)
    @Column(name = "is_additional_charge", columnDefinition = "char(1) comment '추가 요금 여부'")
    Boolean isAdditionalCharge;

    @Convert(converter = BooleanToStringConverter.class)
    @Column(name = "sunday", columnDefinition = "char(1) comment '일요일 여부'")
    Boolean sunday;

    @Convert(converter = BooleanToStringConverter.class)
    @Column(name = "monday", columnDefinition = "char(1) comment '월요일 여부'")
    Boolean monday;

    @Convert(converter = BooleanToStringConverter.class)
    @Column(name = "tuesday", columnDefinition = "char(1) comment '화요일 여부'")
    Boolean tuesday;

    @Convert(converter = BooleanToStringConverter.class)
    @Column(name = "wednesday", columnDefinition = "char(1) comment '수요일 여부'")
    Boolean wednesday;

    @Convert(converter = BooleanToStringConverter.class)
    @Column(name = "thursday", columnDefinition = "char(1) comment '목요일 여부'")
    Boolean thursday;

    @Convert(converter = BooleanToStringConverter.class)
    @Column(name = "friday", columnDefinition = "char(1) comment '금요일 여부'")
    Boolean friday;

    @Convert(converter = BooleanToStringConverter.class)
    @Column(name = "saturday", columnDefinition = "char(1) comment '토요일 여부'")
    Boolean saturday;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rate_plan_id", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    RatePlanEntity ratePlan;

    @Builder
    public RatePlanSettlementCommissionEntity(Long id, String commissionType, RatePlanEnums.CommissionMode commissionMode, BigDecimal commission, BigDecimal weeklyCommission, BigDecimal weekendCommission, PropertyEnums.CommissionPriceType commissionPriceType, Boolean isAdditionalCharge, Boolean sunday, Boolean monday, Boolean tuesday, Boolean wednesday, Boolean thursday, Boolean friday, Boolean saturday) {
        super();
        this.id = id;
        this.commissionType = commissionType;
        this.commissionMode = commissionMode;
        this.commission = commission;
        this.weeklyCommission = weeklyCommission;
        this.weekendCommission = weekendCommission;
        this.commissionPriceType = commissionPriceType;
        this.isAdditionalCharge = isAdditionalCharge;
        this.sunday = sunday;
        this.monday = monday;
        this.tuesday = tuesday;
        this.wednesday = wednesday;
        this.thursday = thursday;
        this.friday = friday;
        this.saturday = saturday;
    }
}
