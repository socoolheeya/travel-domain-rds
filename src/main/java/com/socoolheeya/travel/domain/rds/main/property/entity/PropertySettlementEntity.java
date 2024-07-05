package com.socoolheeya.travel.domain.rds.main.property.entity;

import com.socoolheeya.travel.domain.rds.common.converter.BooleanToStringConverter;
import com.socoolheeya.travel.system.core.enums.PropertyEnums;
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
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Comment;

import java.time.LocalDate;

@Getter
@Entity
@AllArgsConstructor
@Comment("숙소 정산 정보")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "property_settlement")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PropertySettlementEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "property_settlement_id", columnDefinition = "bigint comment '숙소 정산 정보 ID'")
    Long id;

    @Column(name = "settlement_type", columnDefinition = "varchar(255) comment '정산 타입'")
    PropertyEnums.SettlementType settlementType;

    @Column(name = "currency", columnDefinition = "varchar(5) comment '통화'")
    String currency;

    @Column(name ="account_holder", columnDefinition = "varchar(500) comment '예금주'")
    String accountHolder;

    @Column(name = "account_number", columnDefinition = "varchar(500) comment '계좌번호'")
    String accountNumber;

    @Column(name = "bank_name", columnDefinition = "varchar(255) comment '은행명'")
    String bankName;

    @Column(name = "settlement_started_at", columnDefinition = "date comment '정산 시작일'")
    LocalDate settlementStartedAt;

    @Column(name = "settlement_ended_at", columnDefinition = "date comment '정산 종료일'")
    LocalDate settlementEndedAt;

    @Convert(converter = BooleanToStringConverter.class)
    @Column(name = "is_tax_invoice", columnDefinition = "char(1) comment '세금계산서 발행 여부'")
    Boolean isTaxInvoice;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "property_id", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    PropertyEntity property;

    @OneToOne(mappedBy = "propertySettlement", fetch = FetchType.LAZY)
    PropertySettlementCommissionEntity propertySettlementCommission;


}
