package com.socoolheeya.travel.domain.rds.main.rateplan.service.query;

import com.socoolheeya.travel.domain.rds.main.rateplan.repository.RatePlanJpaRepository;
import com.socoolheeya.travel.domain.rds.main.room.entity.RoomRatePlanEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class RatePlanQueryService {

    private final RatePlanJpaRepository ratePlanJpaRepository;

//    public List<RoomRatePlanEntity> findByRoomId(Long roomId) {
//        return ratePlanJpaRepository.findById(roomId).get().getRoomRatePlans();
//    }


}
