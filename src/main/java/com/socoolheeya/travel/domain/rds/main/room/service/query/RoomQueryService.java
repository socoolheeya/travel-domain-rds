package com.socoolheeya.travel.domain.rds.main.room.service.query;

import com.socoolheeya.travel.domain.rds.main.room.domain.Room;
import com.socoolheeya.travel.domain.rds.main.room.entity.RoomEntity;
import com.socoolheeya.travel.domain.rds.main.room.mapper.RoomMapper;
import com.socoolheeya.travel.domain.rds.main.room.repository.RoomJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class RoomQueryService {

    private final RoomJpaRepository roomJpaRepository;

    public List<RoomEntity> searchRoomEntityByPropertyId(Long propertyId) {
        return roomJpaRepository.findByPropertyId(propertyId);
    }

    public List<Room> searchRoomByPropertyId(Long propertyId) {
        return roomJpaRepository.findByPropertyId(propertyId)
                .stream()
                .map(RoomMapper.INSTANCE::toDomain)
                .toList();
    }



}
