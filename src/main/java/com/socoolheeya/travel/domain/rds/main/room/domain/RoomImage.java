package com.socoolheeya.travel.domain.rds.main.room.domain;

import com.socoolheeya.travel.domain.rds.main.room.entity.RoomEntity;

public record RoomImage(
        Long id,
        String name,
        String path,
        boolean isCover,
        boolean isUsable,
        Integer sequence,
        RoomEntity room
) {
    public RoomImage {
        isCover = false;
        isUsable = true;
        sequence = 1;
    }
}
