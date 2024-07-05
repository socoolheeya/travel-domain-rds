package com.socoolheeya.travel.domain.rds.main.property.repository.support;

import com.querydsl.core.BooleanBuilder;
import com.socoolheeya.travel.domain.rds.main.property.entity.QPropertyEntity;
import com.socoolheeya.travel.system.core.enums.CommonSupplierEnums;
import com.socoolheeya.travel.system.core.model.param.PropertySearchCriteria;

import java.util.Set;

public class PropertyQueryHelper {

    public static BooleanBuilder createFilterBuilder(PropertySearchCriteria propertySearchCriteria, QPropertyEntity property) {
        BooleanBuilder filterBuilder = new BooleanBuilder();

        addLanguageFilters(propertySearchCriteria.getLanguage(), property, filterBuilder);
        addIsActiveFilters(propertySearchCriteria.getIsActive(), property, filterBuilder);
        addSupplierFilters(propertySearchCriteria.getSuppliers(), property, filterBuilder);

        return filterBuilder;
    }

    private static void addLanguageFilters(String language, QPropertyEntity property, BooleanBuilder filterBuilder) {
        if ("KR".equalsIgnoreCase(language)) {
            filterBuilder.and(
                    property.translations.any().language.eq("KR"));
        } else if ("EN".equalsIgnoreCase(language)) {
            filterBuilder.and(
                    property.translations.any().language.eq("EN"));
        }
    }

    private static void addIsActiveFilters(boolean isActive, QPropertyEntity property, BooleanBuilder filterBuilder) {
        if (isActive) {
            filterBuilder.and(property.isActive.eq(true));
        } else {
            filterBuilder.and(property.isActive.eq(false));
        }
    }

    private static void addSupplierFilters(Set<CommonSupplierEnums> suppliers, QPropertyEntity property, BooleanBuilder filterBuilder) {
        if (suppliers != null) {
            filterBuilder.and(
                    property.propertySupplier.id.supplierId.in(suppliers.stream()
                            .map(CommonSupplierEnums::getCode)
                            .toList())
            );
        }
    }
}
