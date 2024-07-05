package com.socoolheeya.travel.domain.rds.main.rateplan.entity;

import jakarta.persistence.Column;
import jakarta.persistence.ConstraintMode;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Comment;

import java.time.LocalDate;

@Getter
@Entity
@Comment("요금제 판매")
@Table(name = "rate_plan", uniqueConstraints = {
        @UniqueConstraint(name = "rate_plan_sold_uk", columnNames = {"sales_day", "rate_plan_id"})
})
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RatePlanSoldEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rate_plan_sold_id", columnDefinition = "bigint comment '요금제 판매 ID'")
    Long id;

    @Column(name = "sales_day", columnDefinition = "date comment '판매 일자'")
    LocalDate salesDay;

    @Column(name = "daily_sold", columnDefinition = "int comment '일일 판매량'")
    Integer dailySold;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rate_plan_id", nullable = false, foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    RatePlanEntity ratePlan;
}
