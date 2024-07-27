package com.socoolheeya.travel.domain.rds.main.property.domain;

import com.socoolheeya.travel.system.core.enums.PropertyEnums;
import lombok.Builder;

import java.util.ArrayList;
import java.util.List;

@Builder
public record Property(
        Long id,
        String name,
        String description,
        PropertyEnums.Star star,
        Boolean isActive,
        String countryCode,
        List<PropertyImage> images,
        PropertyAddress address,
        PropertyContact contact,
        PropertyLocation location,
        List<PropertyContract> propertyContracts,
        PropertySupplier propertySupplier,
        List<PropertyTranslation> propertyTranslations,
        PropertySettlement propertySettlement,
        PropertySettlementCommission propertySettlementCommission
) {
    public Property {
        isActive = true;
        images = new ArrayList<>();
        propertyContracts = new ArrayList<>();
    }

}
