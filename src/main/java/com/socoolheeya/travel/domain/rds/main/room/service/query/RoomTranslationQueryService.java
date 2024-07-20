package com.socoolheeya.travel.domain.rds.main.room.service.query;

import com.socoolheeya.travel.domain.rds.main.room.domain.RoomTranslation;
import com.socoolheeya.travel.domain.rds.main.room.mapper.RoomTranslationMapper;
import com.socoolheeya.travel.domain.rds.main.room.repository.RoomTranslationJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class RoomTranslationQueryService {

    private final RoomTranslationJpaRepository roomTranslationJpaRepository;

//    public List<RoomTranslation> searchRoomTranslationsByRoomId(Long roomId) {
//        return roomTranslationJpaRepository.findByRoomId(roomId)
//                .stream()
//                .map(RoomTranslationMapper.INSTANCE::to)
//                .toList();
//    }
}
