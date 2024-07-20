package com.socoolheeya.travel.domain.rds.main.room.repository;

import com.socoolheeya.travel.domain.rds.main.room.entity.RoomBlockEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomBlockJpaRepository extends JpaRepository<RoomBlockEntity, Long> {

    @Query("SELECT rb FROM RoomBlockEntity rb JOIN FETCH rb.room WHERE rb.room.id = :roomId")
    List<RoomBlockEntity> findByRoomId(Long roomId);
}
