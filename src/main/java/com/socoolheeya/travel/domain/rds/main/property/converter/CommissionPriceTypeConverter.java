package com.socoolheeya.travel.domain.rds.main.property.converter;

import com.socoolheeya.travel.system.core.enums.PropertyEnums;
import com.socoolheeya.travel.system.core.enums.PropertyEnums.CommissionPriceType;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import org.springframework.util.StringUtils;

import java.util.Optional;

@Converter
public class CommissionPriceTypeConverter implements AttributeConverter<PropertyEnums.CommissionPriceType, String> {

    @Override
    public String convertToDatabaseColumn(CommissionPriceType commissionPriceType) {
        return Optional.ofNullable(commissionPriceType)
                .map(CommissionPriceType::getCode)
                .orElse(null);
    }

    @Override
    public CommissionPriceType convertToEntityAttribute(String dbData) {
        return Optional.ofNullable(dbData)
                .filter(StringUtils::hasText)
                .map(CommissionPriceType::from)
                .orElse(CommissionPriceType.DEPOSIT_PRICE);
    }
}
