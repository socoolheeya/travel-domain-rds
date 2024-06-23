package com.socoolheeya.travel.domain.rds.main.property.repository;

import com.socoolheeya.travel.domain.rds.main.property.entity.PropertyEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PropertyJpaRepository extends JpaRepository<PropertyEntity, Long>, PropertyCustomRepository {
    Page<PropertyEntity> findAllByNameContaining(String koName, Pageable pageable);

    @Query("SELECT p FROM PropertyEntity p JOIN FETCH p.translations t WHERE t.language = :language")
    Page<PropertyEntity> findByLanguage(String language, Pageable pageable);
}
