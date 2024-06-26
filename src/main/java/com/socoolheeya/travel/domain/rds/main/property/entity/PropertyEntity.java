package com.socoolheeya.travel.domain.rds.main.property.entity;

import com.socoolheeya.travel.domain.rds.common.converter.BooleanToStringConverter;
import com.socoolheeya.travel.domain.rds.common.entity.BaseEntity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Comment;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Entity
@Table(name = "property")
@Comment("시설 정보")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PropertyEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "property_id", columnDefinition = "bigint comment '시설 ID'")
    Long id;

    @NotNull
    @Column(columnDefinition = "varchar(500) comment '시설명(KR)'")
    String name;

    @Column(columnDefinition = "text comment '시설 설명(KR)'")
    String description;

    @Convert(converter = BooleanToStringConverter.class)
    @Column(columnDefinition = "char(1) comment '사용 여부'")
    Boolean isEnabled = true;

    @OneToMany(mappedBy = "property", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    Set<PropertyTranslationEntity> translations = new HashSet<>();

    @OneToMany(mappedBy = "property", fetch = FetchType.LAZY)
    List<PropertyImageEntity> images = new ArrayList<>();

    @OneToOne(mappedBy = "property", fetch = FetchType.LAZY)
    PropertyAddressEntity address;

    @OneToOne(mappedBy = "property", fetch = FetchType.LAZY)
    PropertyContactEntity contact;

    @OneToOne(mappedBy = "property", fetch = FetchType.LAZY)
    PropertyLocationEntity location;

    @OneToMany(mappedBy = "property", orphanRemoval = true, fetch = FetchType.LAZY)
    List<PropertyContractEntity> propertyContracts = new ArrayList<>();

    @OneToOne(mappedBy = "property", orphanRemoval = true, fetch = FetchType.LAZY)
    PropertySupplierEntity propertySupplier;

    @Builder
    public PropertyEntity(Long id, String name, String description, Boolean isEnabled) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.isEnabled = isEnabled;
        this.images = null;
        this.address = null;
        this.contact = null;
        this.location = null;
    }

    @Transactional
    public void inActive() {
        this.isEnabled = false;
    }

}
