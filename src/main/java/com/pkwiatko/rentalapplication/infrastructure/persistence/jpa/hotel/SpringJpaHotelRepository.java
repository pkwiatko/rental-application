package com.pkwiatko.rentalapplication.infrastructure.persistence.jpa.hotel;

import com.pkwiatko.rentalapplication.domain.hotel.Hotel;
import org.springframework.data.repository.CrudRepository;

interface SpringJpaHotelRepository extends CrudRepository<Hotel, String> {
}
