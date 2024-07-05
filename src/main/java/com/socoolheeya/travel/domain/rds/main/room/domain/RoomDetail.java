package com.socoolheeya.travel.domain.rds.main.room.domain;

public record RoomDetail(
        Long id,
        String description,
        String memo,
        Boolean isPendingReservation,
        Long roomId
) {

    public RoomDetail {
        isPendingReservation = false;
    }
}
