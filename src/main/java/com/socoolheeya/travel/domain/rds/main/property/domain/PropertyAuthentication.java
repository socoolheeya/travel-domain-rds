package com.socoolheeya.travel.domain.rds.main.property.domain;

public record PropertyAuthentication(
        Long id,
        String hotelId,
        String hotelPassword,
        Property property
) {
}
