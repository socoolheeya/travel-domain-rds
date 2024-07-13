package com.socoolheeya.travel.domain.rds.main.rateplan.repository.custom;


import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RatePlanCustomRepository {

    private final JPAQueryFactory queryFactory;


}
