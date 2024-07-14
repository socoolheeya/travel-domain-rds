package com.socoolheeya.travel.domain.rds.main.rateplan.service.query;

import com.socoolheeya.travel.domain.rds.main.rateplan.repository.RatePlanJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class RatePlanQueryService {

    private final RatePlanJpaRepository ratePlanJpaRepository;


}
