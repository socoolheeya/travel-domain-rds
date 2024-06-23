package com.socoolheeya.travel.domain.rds.main.property.mapper;

import com.socoolheeya.travel.domain.rds.main.property.domain.PropertySupplier;
import com.socoolheeya.travel.domain.rds.main.property.entity.PropertySupplierEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class PropertySupplierMapperImpl implements PropertySupplierMapper {

    @Override
    public PropertySupplier toDomain(PropertySupplierEntity entity) {
        if ( entity == null ) {
            return null;
        }

        PropertySupplier.PropertySupplierBuilder propertySupplier = PropertySupplier.builder();

        return propertySupplier.build();
    }

    @Override
    public PropertySupplierEntity toEntity(PropertySupplier domain) {
        if ( domain == null ) {
            return null;
        }

        PropertySupplierEntity.PropertySupplierEntityBuilder propertySupplierEntity = PropertySupplierEntity.builder();

        return propertySupplierEntity.build();
    }
}
