package com.pkwiatko.rentalapplication.infrastructure.persistence.jpa.hotelroom;

import com.pkwiatko.rentalapplication.domain.hotelroom.HotelRoom;
import com.pkwiatko.rentalapplication.domain.hotelroom.HotelRoomRepository;

class JpaHotelRoomRepository implements HotelRoomRepository {
    private final SpringJpaHotelRoomRepository hotelRoomRepository;

    JpaHotelRoomRepository(SpringJpaHotelRoomRepository hotelRoomRepository) {
        this.hotelRoomRepository = hotelRoomRepository;
    }

    @Override
    public void save(HotelRoom hotelRoom) {
        hotelRoomRepository.save(hotelRoom);
    }
}
