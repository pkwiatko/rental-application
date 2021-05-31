package com.pkwiatko.rentalapplication.domain.apartmentbookinghistory;

public interface ApartmentBookingHistoryRepository {
    boolean existsFor(String apartmentId);

    ApartmentBookingHistory findFor(String apartmentId);

    void save(ApartmentBookingHistory apartmentBookingHistory);
}
