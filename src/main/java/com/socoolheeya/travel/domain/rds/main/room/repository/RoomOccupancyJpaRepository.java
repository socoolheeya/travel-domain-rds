package com.socoolheeya.travel.domain.rds.main.room.repository;

import com.socoolheeya.travel.domain.rds.main.room.entity.RoomOccupancyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoomOccupancyJpaRepository extends JpaRepository<RoomOccupancyEntity, Long> {

    @Query("SELECT r FROM RoomOccupancyEntity r JOIN FETCH r.roomChildrenOccupancy WHERE r.id = :id")
    Optional<RoomOccupancyEntity> findById(Long id);
}
