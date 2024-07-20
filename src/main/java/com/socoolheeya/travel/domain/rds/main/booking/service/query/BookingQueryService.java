package com.socoolheeya.travel.domain.rds.main.booking.service.query;

import com.socoolheeya.travel.domain.rds.main.booking.domain.Booking;
import com.socoolheeya.travel.domain.rds.main.booking.entity.BookingEntity;
import com.socoolheeya.travel.domain.rds.main.booking.mapper.BookingMapper;
import com.socoolheeya.travel.domain.rds.main.booking.repository.BookingJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class BookingQueryService {

    private final BookingJpaRepository bookingJpaRepository;

    public Optional<Booking> searchById(Long id) {
        return bookingJpaRepository.findById(id)
                .map(BookingMapper.INSTANCE::toDomain);
    }

    public Optional<BookingEntity> searchEntityById(Long id) {
        return bookingJpaRepository.findById(id);
    }
}
