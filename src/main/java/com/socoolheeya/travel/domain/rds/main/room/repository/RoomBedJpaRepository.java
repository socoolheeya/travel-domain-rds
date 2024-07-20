package com.socoolheeya.travel.domain.rds.main.room.repository;

import com.socoolheeya.travel.domain.rds.main.room.entity.RoomBedEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoomBedJpaRepository extends JpaRepository<RoomBedEntity, Long> {

    @Query("SELECT rb FROM RoomBedEntity rb JOIN FETCH rb.room WHERE rb.room.id = :roomId")
    Optional<RoomBedEntity> findByRoomId(Long roomId);
}
