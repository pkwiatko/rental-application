package com.pkwiatko.rentalapplication.infrastructure.persistence.jpa.apartment;

import com.pkwiatko.rentalapplication.domain.apartment.Apartment;
import org.springframework.data.repository.CrudRepository;

public interface SpringJpaApartmentRepository extends CrudRepository<Apartment, String> {
}
