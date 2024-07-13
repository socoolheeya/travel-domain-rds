package com.socoolheeya.travel.domain.rds.main.room.repository;

import com.socoolheeya.travel.domain.rds.main.room.entity.RoomRatePlanEntity;
import com.socoolheeya.travel.domain.rds.main.room.entity.pk.RoomRatePlanId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomRatePlanJpaRepository extends JpaRepository<RoomRatePlanEntity, RoomRatePlanId> {

    @Query("SELECT r FROM RoomRatePlanEntity r JOIN FETCH r.ratePlan JOIN FETCH r.room WHERE r.room.id = :roomId")
    List<RoomRatePlanEntity> findByRoomId(Long roomId);
}
