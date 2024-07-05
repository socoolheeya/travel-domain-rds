package com.socoolheeya.travel.domain.rds.main.room.entity;

import jakarta.persistence.Column;
import jakarta.persistence.ConstraintMode;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Comment;

@Getter
@Entity
@Comment("객실 침대")
@Table(name = "room_bed")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RoomBedEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "room_bed_id", columnDefinition = "int(6) comment '객실 침대 ID'")
    Long id;

    @Column(name = "single_bed", columnDefinition = "tinyint(6) comment '싱글 침대'")
    Integer singleBed;

    @Column(name = "double_bed", columnDefinition = "tinyint(6) comment '더블 침대'")
    Integer doubleBed;

    @Column(name = "double_sofa_bed", columnDefinition = "tinyint(6) comment '더블 소파 베드'")
    Integer doubleSofaBed;

    @Column(name = "queen_bed", columnDefinition = "tinyint(6) comment '퀸 침대'")
    Integer queenBed;

    @Column(name = "king_bed", columnDefinition = "tinyint(6) comment '킹 침대'")
    Integer kingBed;

    @Column(name = "twin_bed", columnDefinition = "tinyint(6) comment '트윈 침대'")
    Integer twinBed;

    @Column(name = "bunk_bed", columnDefinition = "tinyint(6) comment '이층 침대'")
    Integer bunkBed;

    @Column(name = "sofa_bed", columnDefinition = "tinyint(6) comment '소파 베드'")
    Integer sofaBed;

    @Column(name = "futon_bed", columnDefinition = "tinyint(6) comment '후톤 베드'")
    Integer futonBed;

    @Column(name = "murphy_bed", columnDefinition = "tinyint(6) comment '머피 베드'")
    Integer murphyBed;

    @Column(name = "queen_murphy_bed", columnDefinition = "tinyint(6) comment '퀸 머피 베드'")
    Integer queenMurphyBed;

    @Column(name = "ondol", columnDefinition = "tinyint(6) comment '온돌'")
    Integer ondol;

    @Column(name = "double_bed_or_twin_bed", columnDefinition = "tinyint(6) comment '더블 침대 또는 트윈 침대'")
    Integer doubleBedOrTwinBed;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "room_id", nullable = false, foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    RoomEntity room;

    @Builder
    public RoomBedEntity(Long id, Integer singleBed, Integer doubleBed, Integer doubleSofaBed, Integer queenBed, Integer kingBed, Integer twinBed, Integer bunkBed, Integer sofaBed, Integer futonBed, Integer murphyBed, Integer queenMurphyBed, Integer ondol, Integer doubleBedOrTwinBed) {
        this.id = id;
        this.singleBed = singleBed;
        this.doubleBed = doubleBed;
        this.doubleSofaBed = doubleSofaBed;
        this.queenBed = queenBed;
        this.kingBed = kingBed;
        this.twinBed = twinBed;
        this.bunkBed = bunkBed;
        this.sofaBed = sofaBed;
        this.futonBed = futonBed;
        this.murphyBed = murphyBed;
        this.queenMurphyBed = queenMurphyBed;
        this.ondol = ondol;
        this.doubleBedOrTwinBed = doubleBedOrTwinBed;
        this.room = null;
    }
}
