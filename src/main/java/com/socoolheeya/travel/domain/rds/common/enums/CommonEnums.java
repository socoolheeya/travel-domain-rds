package com.socoolheeya.travel.domain.rds.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class CommonEnums {

    @Getter
    @AllArgsConstructor
    public enum OrderBy {
        CREATED_AT_ASC,
        CREATED_AT_DESC,
        UPDATED_AT_ASC,
        UPDATED_AT_DESC,
        NAME_ASC,
        NAME_DESC,
        PRICE_ASC,
        PRICE_DESC,
        RATING_ASC,
        RATING_DESC
    }

}
