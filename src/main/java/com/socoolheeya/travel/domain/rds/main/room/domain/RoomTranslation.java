package com.socoolheeya.travel.domain.rds.main.room.domain;

public record RoomTranslation(
Long id,
        String language,
        String name,
        String description,
        String memo,
        Long roomId
) {
}
