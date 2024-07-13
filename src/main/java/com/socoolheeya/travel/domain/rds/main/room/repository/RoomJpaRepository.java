package com.socoolheeya.travel.domain.rds.main.room.repository;

import com.socoolheeya.travel.domain.rds.main.room.entity.RoomEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RoomJpaRepository extends JpaRepository<RoomEntity, Long> {

    @Query("SELECT r FROM RoomEntity r LEFT JOIN FETCH r.roomOccupancy JOIN FETCH r.property WHERE r.id = :id")
    Optional<RoomEntity> findById(Long id);

    @Query("SELECT r FROM RoomEntity r JOIN FETCH r.property WHERE r.property.id = :propertyId")
    List<RoomEntity> findByPropertyId(Long propertyId);
}
