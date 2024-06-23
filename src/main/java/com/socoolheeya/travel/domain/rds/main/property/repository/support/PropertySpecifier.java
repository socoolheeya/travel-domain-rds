package com.socoolheeya.travel.domain.rds.main.property.repository.support;

import com.querydsl.core.types.OrderSpecifier;
import com.socoolheeya.travel.domain.rds.common.enums.CommonEnums;
import com.socoolheeya.travel.domain.rds.main.property.entity.QPropertyEntity;

public class PropertySpecifier {

    public static OrderSpecifier<?> getOrderSpecifier(CommonEnums.OrderBy order, QPropertyEntity property) {
        if(order == null) {
            return property.createdAt.desc();
        }

        switch (order) {
            case CREATED_AT_ASC:
                return property.createdAt.asc();
            case UPDATED_AT_ASC:
                return property.updatedAt.asc();
            case UPDATED_AT_DESC:
                return property.updatedAt.desc();
            case NAME_ASC:
                return property.name.asc();
            case NAME_DESC:
                return property.name.desc();
            default:
                return property.createdAt.desc();
        }
    }
}
