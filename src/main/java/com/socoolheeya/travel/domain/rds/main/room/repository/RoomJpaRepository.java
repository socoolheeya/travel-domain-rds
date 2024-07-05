package com.socoolheeya.travel.domain.rds.main.room.repository;

import com.socoolheeya.travel.domain.rds.main.room.entity.RoomEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoomJpaRepository extends JpaRepository<RoomEntity, Long> {

    @Query("SELECT r FROM RoomEntity r JOIN FETCH r.roomOccupancy WHERE r.id = :id")
    Optional<RoomEntity> findById(Long id);
}
