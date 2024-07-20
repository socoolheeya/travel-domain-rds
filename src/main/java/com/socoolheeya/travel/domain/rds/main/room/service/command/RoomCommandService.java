package com.socoolheeya.travel.domain.rds.main.room.service.command;

import com.socoolheeya.travel.domain.rds.main.room.repository.RoomJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RoomCommandService {

    private final RoomJpaRepository roomJpaRepository;

}
