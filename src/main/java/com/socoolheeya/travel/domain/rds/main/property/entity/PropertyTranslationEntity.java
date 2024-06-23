package com.socoolheeya.travel.domain.rds.main.property.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Comment;

@Getter
@Entity
@Table(name = "property_translation")
@Comment("시설 정보 번역")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PropertyTranslationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "property_translation_id", columnDefinition = "bigint comment '숙소 위치정보 ID'")
    Long id;

    @Column(name = "language", columnDefinition = "varchar(10) comment '언어'")
    String language;

    @Column(name = "name", columnDefinition = "varchar(500) comment '시설명'")
    String name;

    @Column(name = "description", columnDefinition = "text comment '시설 설명'")
    String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "property_id")
    PropertyEntity property;

    @Builder
    public PropertyTranslationEntity(String language, String name, String description) {
        this.language = language;
        this.name = name;
        this.description = description;
        this.property = null;
    }




}
