package com.socoolheeya.travel.domain.rds.main.room.service.query;

import com.socoolheeya.travel.domain.rds.main.room.domain.RoomBlock;
import com.socoolheeya.travel.domain.rds.main.room.mapper.RoomBlockMapper;
import com.socoolheeya.travel.domain.rds.main.room.repository.RoomBlockJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class RoomBlockQueryService {

    private final RoomBlockJpaRepository roomBlockJpaRepository;

    public List<RoomBlock> searchRoomBlockByRoomId(Long roomId) {
        return roomBlockJpaRepository.findByRoomId(roomId)
                .stream()
                .map(RoomBlockMapper.INSTANCE::toDomain)
                .toList();
    }
}
