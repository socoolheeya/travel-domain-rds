package com.socoolheeya.travel.domain.rds.main.room.domain;

public record RoomChildrenOccupancy(
        Long id,
        Integer standard,
        Integer min,
        Integer max,
        Long roomOccupancyId
) {
}
