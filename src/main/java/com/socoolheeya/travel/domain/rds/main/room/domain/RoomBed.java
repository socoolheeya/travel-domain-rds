package com.socoolheeya.travel.domain.rds.main.room.domain;

public record RoomBed(
        Long id,
        Integer singleBed,
        Integer doubleBed,
        Integer doubleSofaBed,
        Integer queenBed,
        Integer kingBed,
        Integer twinBed,
        Integer bunkBed,
        Integer sofaBed,
        Integer futonBed,
        Integer murphyBed,
        Integer queenMurphyBed,
        Integer ondol,
        Integer doubleBedOrTwinBed,
        Long roomId
) {
}
