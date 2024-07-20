package com.socoolheeya.travel.domain.rds.main.property.repository;

import com.socoolheeya.travel.domain.rds.main.property.entity.PropertyContactEntity;
import lombok.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PropertyContactJpaRepository extends JpaRepository<PropertyContactEntity, Long> {

    @NonNull
    @Query("SELECT pc FROM PropertyContactEntity pc JOIN FETCH pc.property p WHERE p.id = :id")
    Optional<PropertyContactEntity> findById(@NonNull Long id);
}
