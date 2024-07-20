package com.socoolheeya.travel.domain.rds.main.room.service.query;

import com.socoolheeya.travel.domain.rds.main.room.domain.RoomImage;
import com.socoolheeya.travel.domain.rds.main.room.mapper.RoomImageMapper;
import com.socoolheeya.travel.domain.rds.main.room.repository.RoomImageJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class RoomImageQueryService {

    private final RoomImageJpaRepository roomImageJpaRepository;

    public List<RoomImage> searchRoomImagesByRoomId(Long roomId) {
        return roomImageJpaRepository.findByRoomId(roomId)
                .stream()
                .map(RoomImageMapper.INSTANCE::toDomain)
                .toList();
    }

    public Optional<RoomImage> searchRoomImageById(Long id) {
        return roomImageJpaRepository.findById(id)
                .map(RoomImageMapper.INSTANCE::toDomain);
    }
}
