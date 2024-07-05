package com.socoolheeya.travel.domain.rds.main.property.domain;

import com.socoolheeya.travel.system.core.enums.PropertyEnums;

import java.time.LocalDate;

public record PropertySettlement(
        Long id,
        PropertyEnums.SettlementType settlementType,
        String currency,
        String accountHolder,
        String accountNumber,
        String bankName,
        LocalDate settlementStartedAt,
        LocalDate settlementEndedAt,
        Boolean isTaxInvoice,
        Long propertyId,
        Long propertySettlementCommissionId
) {
}
