package com.socoolheeya.travel.domain.rds.common.domain;

import java.math.BigDecimal;

public record Commission(
    BigDecimal sun,
    BigDecimal mon,
    BigDecimal tue,
    BigDecimal wed,
    BigDecimal thu,
    BigDecimal fri,
    BigDecimal sat,
    String countryCode,
    String currency,
    String priceType
) {
}
