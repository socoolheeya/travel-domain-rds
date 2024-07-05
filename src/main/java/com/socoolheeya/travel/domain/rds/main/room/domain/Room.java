package com.socoolheeya.travel.domain.rds.main.room.domain;

import com.socoolheeya.travel.system.core.enums.RoomEnums;

import java.util.List;

public record Room(
        Long id,
        String name,
        Double roomSize,
        RoomEnums.RoomSizeUnit roomSizeUnit,
        RoomEnums.View view,
        Boolean isSmoking,
        Boolean isSameDayBooking,
        Boolean isActive,
        String cmsRoomId,
        RoomOccupancy roomOccupancy,
        List<RoomAmenity> roomAmenities,
        List<RoomEquipment> roomEquipments,
        List<RoomService> roomServices,
        List<RoomImage> roomImages,
        List<RoomRatePlan> roomRatePlans,
        List<RoomBlock> roomBlocks
) {
    public Room {
        isSmoking = false;
        isSameDayBooking = false;
        isActive = true;
    }
}
