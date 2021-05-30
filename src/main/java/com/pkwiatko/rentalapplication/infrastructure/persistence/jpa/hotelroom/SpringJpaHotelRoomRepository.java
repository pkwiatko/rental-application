package com.pkwiatko.rentalapplication.infrastructure.persistence.jpa.hotelroom;

import com.pkwiatko.rentalapplication.domain.hotelroom.HotelRoom;
import org.springframework.data.repository.CrudRepository;

interface SpringJpaHotelRoomRepository extends CrudRepository<HotelRoom, String> {
}
