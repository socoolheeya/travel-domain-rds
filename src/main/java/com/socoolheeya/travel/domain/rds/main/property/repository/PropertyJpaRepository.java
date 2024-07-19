package com.socoolheeya.travel.domain.rds.main.property.repository;

import com.socoolheeya.travel.domain.rds.main.property.entity.PropertyEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PropertyJpaRepository extends JpaRepository<PropertyEntity, Long>, PropertyCustomRepository {

    @Override
    @Query("SELECT p FROM PropertyEntity p LEFT JOIN FETCH p.propertySupplier WHERE p.id = :id")
    Optional<PropertyEntity> findById(@Param("id") Long id);

    @Query("SELECT p FROM PropertyEntity p JOIN FETCH p.propertySupplier ps WHERE ps.supplier.id = :supplierId")
    List<PropertyEntity> findPropertiesByPropertySupplierId(Long supplierId);

    Page<PropertyEntity> findAllByNameContaining(String koName, Pageable pageable);

    @Query("SELECT p FROM PropertyEntity p JOIN FETCH p.translations t WHERE t.language = :language")
    Page<PropertyEntity> findByLanguage(String language, Pageable pageable);


}
