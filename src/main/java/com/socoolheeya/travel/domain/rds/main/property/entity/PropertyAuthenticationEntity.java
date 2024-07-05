package com.socoolheeya.travel.domain.rds.main.property.entity;

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
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Comment;

@Getter
@Entity
@AllArgsConstructor
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "property_authentication")
@Comment("숙소 인증 정보")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PropertyAuthenticationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "property_authentication_id", columnDefinition = "bigint comment '숙소 ID'")
    Long id;

    @NotNull
    @Column(name = "hotel_id", columnDefinition = "varchar(1000) comment '호텔 ID'")
    String hotelId;

    @Column(name = "hotel_password", columnDefinition = "varchar(1000) comment '호텔 비밀번호'")
    String hotelPassword;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "property_id", nullable = false, foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    PropertyEntity property;
}
