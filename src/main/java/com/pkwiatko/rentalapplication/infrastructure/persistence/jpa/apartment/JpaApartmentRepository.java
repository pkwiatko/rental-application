package com.pkwiatko.rentalapplication.infrastructure.persistence.jpa.apartment;

import com.pkwiatko.rentalapplication.domain.apartment.Apartment;
import com.pkwiatko.rentalapplication.domain.apartment.ApartmentRepository;

public class JpaApartmentRepository implements ApartmentRepository {
    private final SpringJpaApartmentRepository springJpaApartmentRepository;

    public JpaApartmentRepository(SpringJpaApartmentRepository springJpaApartmentRepository) {
        this.springJpaApartmentRepository = springJpaApartmentRepository;
    }

    @Override
    public void save(Apartment apartment) {
        springJpaApartmentRepository.save(apartment);
    }

    @Override
    public Apartment findById(String id) {
        return springJpaApartmentRepository.findById(id).get();
    }
}
