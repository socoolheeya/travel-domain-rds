package com.socoolheeya.travel.domain.rds.main.property.domain;

import java.math.BigDecimal;

public record PropertySettlementCommission(
        Long id,
        String commissionType,
        String commissionMode,
        BigDecimal commission,
        BigDecimal weeklyCommission,
        BigDecimal weekendCommission,
        Boolean sunday,
        Boolean monday,
        Boolean tuesday,
        Boolean wednesday,
        Boolean thursday,
        Boolean friday,
        Boolean saturday,
        Long propertySettlementId
) {
}
