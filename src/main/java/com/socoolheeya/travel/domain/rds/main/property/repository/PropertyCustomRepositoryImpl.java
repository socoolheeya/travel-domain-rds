package com.socoolheeya.travel.domain.rds.main.property.repository;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.OrderSpecifier;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.socoolheeya.travel.domain.rds.common.enums.CommonEnums;
import com.socoolheeya.travel.domain.rds.common.enums.CommonEnums.OrderBy;
import com.socoolheeya.travel.domain.rds.main.property.entity.PropertyEntity;
import com.socoolheeya.travel.domain.rds.main.property.entity.QPropertyEntity;
import com.socoolheeya.travel.domain.rds.main.property.entity.QPropertySupplierEntity;
import com.socoolheeya.travel.domain.rds.main.property.entity.QPropertyTranslationEntity;
import com.socoolheeya.travel.domain.rds.main.property.repository.support.PropertyQueryHelper;
import com.socoolheeya.travel.domain.rds.main.property.repository.support.PropertySpecifier;
import com.socoolheeya.travel.system.core.model.param.PropertySearchCriteria;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class PropertyCustomRepositoryImpl implements PropertyCustomRepository {

    private final JPAQueryFactory jpaQueryFactory;


    @Override
    public List<PropertyEntity> getFilteredAndSortedProperties(PropertySearchCriteria searchCriteria, Pageable pageable) {
        QPropertyEntity property = QPropertyEntity.propertyEntity;
        QPropertyTranslationEntity propertyTranslation = QPropertyTranslationEntity.propertyTranslationEntity;
        QPropertySupplierEntity propertySupplier = QPropertySupplierEntity.propertySupplierEntity;
        BooleanBuilder filterBuilder = PropertyQueryHelper.createFilterBuilder(searchCriteria, property);
        CommonEnums.OrderBy orderBy = OrderBy.CREATED_AT_DESC;
        OrderSpecifier<?> orderSpecifier = PropertySpecifier.getOrderSpecifier(orderBy, property);

        return jpaQueryFactory.select(property)
                .from(property)
                .innerJoin(property.propertySupplier, propertySupplier)
                .leftJoin(property.translations, propertyTranslation)
                .where(filterBuilder)
                .orderBy(orderSpecifier)
                .offset((long) pageable.getPageNumber() * pageable.getPageSize())
                .limit(pageable.getPageSize())
                .fetch();
    }

}
