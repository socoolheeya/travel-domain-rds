package com.socoolheeya.travel.domain.rds.main.property.domain;

public record PropertyTranslation(
        Long id,
        String language,
        String name,
        String description
) {
}
