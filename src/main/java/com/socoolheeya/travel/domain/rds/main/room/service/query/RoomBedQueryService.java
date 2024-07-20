package com.socoolheeya.travel.domain.rds.main.room.service.query;

import com.socoolheeya.travel.domain.rds.main.room.domain.RoomBed;
import com.socoolheeya.travel.domain.rds.main.room.mapper.RoomBedMapper;
import com.socoolheeya.travel.domain.rds.main.room.repository.RoomBedJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class RoomBedQueryService {

    private final RoomBedJpaRepository roomBedJpaRepository;

    public Optional<RoomBed> searchRoomBedByRoomId(Long roomId) {
        return roomBedJpaRepository.findByRoomId(roomId)
                .map(RoomBedMapper.INSTANCE::toDomain);    }
}
