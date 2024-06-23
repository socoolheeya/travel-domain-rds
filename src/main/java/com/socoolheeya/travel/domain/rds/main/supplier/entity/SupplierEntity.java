package com.socoolheeya.travel.domain.rds.main.supplier.entity;

import com.socoolheeya.travel.domain.rds.common.entity.BaseEntity;
import com.socoolheeya.travel.domain.rds.main.property.entity.PropertySupplierEntity;
import com.socoolheeya.travel.domain.rds.main.supplier.domain.Supplier;
import com.socoolheeya.travel.system.core.enums.SupplierEnums;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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

import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
@Table(name = "supplier")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@FieldDefaults(level = AccessLevel.PACKAGE)
public class SupplierEntity extends BaseEntity {

    @Id
    @Column(name = "supplier_id", columnDefinition = "int comment '공급사 ID'")
    Integer id;

    @NotNull
    @Column(name = "short_name", columnDefinition = "varchar(20) comment '공급사명 별칭'")
    String shortName;

    @NotNull
    @Column(columnDefinition = "varchar(20) comment '공급사명'")
    String name;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "varchar(20) comment '타입'")
    SupplierEnums.Type type = SupplierEnums.Type.DC;

    @NotNull
    @Column(name = "is_enabled", columnDefinition = "bool comment '사용 여부'")
    Boolean isEnabled = true;

    @OneToOne(mappedBy = "supplier")
    SupplierOperationOptionEntity supplierOperationOption;

    @OneToOne(mappedBy = "supplier")
    PropertySupplierEntity propertySupplier;

    @Builder
    public SupplierEntity(Integer id, String shortName, String name, SupplierEnums.Type type, Boolean isEnabled, SupplierOperationOptionEntity supplierOperationOption, PropertySupplierEntity propertySupplier) {
        this.id = id;
        this.shortName = shortName;
        this.name = name;
        this.type = type;
        this.isEnabled = isEnabled;
        this.supplierOperationOption = null;
        this.propertySupplier = null;
    }

}
