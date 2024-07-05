package com.socoolheeya.travel.domain.rds.main.room.entity;

import jakarta.persistence.Column;
import jakarta.persistence.ConstraintMode;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
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
@Comment("객실 다국어")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "room_translation")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RoomTranslationEntity {

    @Id
    @Column(name = "room_translation_id", columnDefinition = "bigint comment '객실 다국어 ID'")
    Long id;

    @Column(name = "language", columnDefinition = "varchar(10) comment '언어'")
    String language;

    @Column(name = "name", columnDefinition = "varchar(100) comment '이름'")
    String name;

    @Column(name = "description", columnDefinition = "text comment '설명'")
    String description;

    @Column(name = "memo", columnDefinition = "text comment '메모'")
    String memo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "room_id", nullable = false, foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    RoomEntity room;

    @Builder
    public RoomTranslationEntity(Long id, String language, String name, String description, String memo) {
        this.id = id;
        this.language = language;
        this.name = name;
        this.description = description;
        this.memo = memo;
    }


}
