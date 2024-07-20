package com.socoolheeya.travel.domain.rds.main.room.repository;

import com.socoolheeya.travel.domain.rds.main.room.entity.RoomTranslationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomTranslationJpaRepository extends JpaRepository<RoomTranslationEntity, Long> {

    @Query("SELECT rt FROM RoomTranslationEntity rt JOIN FETCH rt.room WHERE rt.room.id = :roomId")
    List<RoomTranslationEntity> findByRoomId(Long roomId);
}
