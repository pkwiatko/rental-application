package com.pkwiatko.rentalapplication.application.apartment;

import com.pkwiatko.rentalapplication.domain.apartment.Apartment;
import com.pkwiatko.rentalapplication.domain.apartment.ApartmentFactory;
import com.pkwiatko.rentalapplication.domain.apartment.ApartmentRepository;
import com.pkwiatko.rentalapplication.domain.apartment.Period;
import com.pkwiatko.rentalapplication.domain.eventchannel.EventChannel;

import java.time.LocalDate;
import java.util.Map;

public class ApartmentApplicationService {
    private final ApartmentRepository apartmentRepository;
    private final EventChannel eventChannel;

    public ApartmentApplicationService(ApartmentRepository apartmentRepository, EventChannel eventChannel) {
        this.apartmentRepository = apartmentRepository;
        this.eventChannel = eventChannel;
    }

    public void add(String ownerId, String street, String postalCode, String houseNumber, String apartmentNumber,
                    String city, String country, String description, Map<String, Double> roomsDefinition)   {

        Apartment apartment = new ApartmentFactory().create(ownerId, street, postalCode, houseNumber, apartmentNumber, city, country, description, roomsDefinition);

        apartmentRepository.save(apartment);
    }

    public void book(String id, String tenantId, LocalDate start, LocalDate end) {
        Apartment apartment = apartmentRepository.findById(id);
        Period period = new Period(start, end);

        apartment.book(tenantId, period, eventChannel);

    }
}
