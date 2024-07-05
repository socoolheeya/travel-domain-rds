package com.socoolheeya.travel.domain.rds.main.property.entity;

import com.socoolheeya.travel.domain.rds.common.converter.BooleanToStringConverter;
import jakarta.persistence.Column;
import jakarta.persistence.ConstraintMode;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Comment;

import java.math.BigDecimal;

@Getter
@Entity
@Comment("숙소 정산 커미션 정보")
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "property_settlement_commission")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PropertySettlementCommissionEntity {
    @Id
    @Column(name = "property_settlement_id", columnDefinition = "bigint comment '숙소 정산 커미션 ID'")
    Long id;

    @Column(name ="commission_type", columnDefinition = "varchar(255) comment '수수료 타입'")
    String commissionType;

    @Column(name = "commission_mode", columnDefinition = "varchar(255) comment '수수료 모드'")
    String commissionMode;

    @Column(name = "commission", columnDefinition = "decimal(10,2) comment '수수료'")
    BigDecimal commission;

    @Column(name = "weekly_commission", columnDefinition = "decimal(10,2) comment '주중 커미션'")
    BigDecimal weeklyCommission;

    @Column(name = "weekend_commission", columnDefinition = "decimal(10,2) comment '주말 커미션'")
    BigDecimal weekendCommission;

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

    @MapsId
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "property_settlement_id", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    PropertySettlementEntity propertySettlement;

}
