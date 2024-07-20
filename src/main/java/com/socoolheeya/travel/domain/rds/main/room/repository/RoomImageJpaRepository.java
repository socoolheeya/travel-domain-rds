package com.socoolheeya.travel.domain.rds.main.room.repository;

import com.socoolheeya.travel.domain.rds.main.room.entity.RoomImageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomImageJpaRepository extends JpaRepository<RoomImageEntity, Long> {

    @Query("SELECT ri FROM RoomImageEntity ri JOIN FETCH ri.room WHERE ri.room.id = :roomId")
    List<RoomImageEntity> findByRoomId(Long roomId);
}
