package com.socoolheeya.travel.domain.rds.main.property.mapper;

import com.socoolheeya.travel.domain.rds.main.property.domain.Property;
import com.socoolheeya.travel.domain.rds.main.property.domain.PropertyAddress;
import com.socoolheeya.travel.domain.rds.main.property.domain.PropertyContact;
import com.socoolheeya.travel.domain.rds.main.property.domain.PropertyImage;
import com.socoolheeya.travel.domain.rds.main.property.entity.PropertyAddressEntity;
import com.socoolheeya.travel.domain.rds.main.property.entity.PropertyContactEntity;
import com.socoolheeya.travel.domain.rds.main.property.entity.PropertyContractEntity;
import com.socoolheeya.travel.domain.rds.main.property.entity.PropertyEntity;
import com.socoolheeya.travel.domain.rds.main.property.entity.PropertyImageEntity;
import com.socoolheeya.travel.system.core.enums.PropertyEnums;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor"
)
@Component
public class PropertyMapperImpl implements PropertyMapper {

    @Override
    public Property toDomain(PropertyEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Property.PropertyBuilder property = Property.builder();

        property.id( entity.getId() );
        property.isEnabled( entity.getIsEnabled() );
        property.images( propertyImageEntityListToPropertyImageList( entity.getImages() ) );
        property.address( propertyAddressEntityToPropertyAddress( entity.getAddress() ) );
        property.contact( propertyContactEntityToPropertyContact( entity.getContact() ) );
        property.location( entity.getLocation() );
        List<PropertyContractEntity> list1 = entity.getPropertyContracts();
        if ( list1 != null ) {
            property.propertyContracts( new ArrayList<PropertyContractEntity>( list1 ) );
        }
        property.propertySupplier( entity.getPropertySupplier() );

        return property.build();
    }

    @Override
    public PropertyEntity toEntity(Property domain) {
        if ( domain == null ) {
            return null;
        }

        PropertyEntity.PropertyEntityBuilder propertyEntity = PropertyEntity.builder();

        propertyEntity.id( domain.id() );
        propertyEntity.isEnabled( domain.isEnabled() );

        return propertyEntity.build();
    }

    protected PropertyImage propertyImageEntityToPropertyImage(PropertyImageEntity propertyImageEntity) {
        if ( propertyImageEntity == null ) {
            return null;
        }

        Long id = null;
        String name = null;
        PropertyEnums.ImageType type = null;
        String path = null;
        Integer sequence = null;

        id = propertyImageEntity.getId();
        name = propertyImageEntity.getName();
        type = propertyImageEntity.getType();
        path = propertyImageEntity.getPath();
        sequence = propertyImageEntity.getSequence();

        PropertyImage propertyImage = new PropertyImage( id, name, type, path, sequence );

        return propertyImage;
    }

    protected List<PropertyImage> propertyImageEntityListToPropertyImageList(List<PropertyImageEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<PropertyImage> list1 = new ArrayList<PropertyImage>( list.size() );
        for ( PropertyImageEntity propertyImageEntity : list ) {
            list1.add( propertyImageEntityToPropertyImage( propertyImageEntity ) );
        }

        return list1;
    }

    protected PropertyAddress propertyAddressEntityToPropertyAddress(PropertyAddressEntity propertyAddressEntity) {
        if ( propertyAddressEntity == null ) {
            return null;
        }

        Long id = null;
        String address = null;
        String addressDetail = null;
        String zipCode = null;
        Property property = null;

        id = propertyAddressEntity.getId();
        address = propertyAddressEntity.getAddress();
        addressDetail = propertyAddressEntity.getAddressDetail();
        zipCode = propertyAddressEntity.getZipCode();
        property = toDomain( propertyAddressEntity.getProperty() );

        PropertyAddress propertyAddress = new PropertyAddress( id, address, addressDetail, zipCode, property );

        return propertyAddress;
    }

    protected PropertyContact propertyContactEntityToPropertyContact(PropertyContactEntity propertyContactEntity) {
        if ( propertyContactEntity == null ) {
            return null;
        }

        Long id = null;
        String email = null;
        String telephone = null;
        String secondTelephone = null;
        String website = null;

        id = propertyContactEntity.getId();
        email = propertyContactEntity.getEmail();
        telephone = propertyContactEntity.getTelephone();
        secondTelephone = propertyContactEntity.getSecondTelephone();
        website = propertyContactEntity.getWebsite();

        PropertyContact propertyContact = new PropertyContact( id, email, telephone, secondTelephone, website );

        return propertyContact;
    }
}
