package com.socoolheeya.travel.domain.rds.main.room.domain;

import com.socoolheeya.travel.domain.rds.main.room.entity.pk.RoomRatePlanId;

import java.time.LocalDateTime;

public record RoomRatePlan(
        RoomRatePlanId id,
        Boolean isActive,
        LocalDateTime createdAt
) {
    public RoomRatePlan {
        isActive = true;
    }
}
