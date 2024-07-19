package com.socoolheeya.travel.domain.rds.configuration;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = {
        "com.socoolheeya.travel.domain.rds.main.booking.repository",
        "com.socoolheeya.travel.domain.rds.main.channel.repository",
        "com.socoolheeya.travel.domain.rds.main.property.repository",
        "com.socoolheeya.travel.domain.rds.main.room.repository",
        "com.socoolheeya.travel.domain.rds.main.rateplan.repository",
        "com.socoolheeya.travel.domain.rds.main.rate.repository",
        "com.socoolheeya.travel.domain.rds.main.supplier.repository"})
@EntityScan(basePackages = {
        "com.socoolheeya.travel.domain.rds.main.booking.entity",
        "com.socoolheeya.travel.domain.rds.main.channel.entity",
        "com.socoolheeya.travel.domain.rds.main.property.entity",
        "com.socoolheeya.travel.domain.rds.main.room.entity",
        "com.socoolheeya.travel.domain.rds.main.rateplan.entity",
        "com.socoolheeya.travel.domain.rds.main.rate.entity",
        "com.socoolheeya.travel.domain.rds.main.supplier.entity"})
public class JpaConfiguration {
}
