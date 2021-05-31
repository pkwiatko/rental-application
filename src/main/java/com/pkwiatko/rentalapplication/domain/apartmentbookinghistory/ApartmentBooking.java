package com.pkwiatko.rentalapplication.domain.apartmentbookinghistory;

public class ApartmentBooking {

    private final BookingStep start;
    private final String ownerId;
    private final String tenantId;
    private final BookingPeriod bookingPeriod;

    private ApartmentBooking(BookingStep start, String ownerId, String tenantId, BookingPeriod bookingPeriod) {
        this.start = start;
        this.ownerId = ownerId;
        this.tenantId = tenantId;
        this.bookingPeriod = bookingPeriod;
    }

    public static ApartmentBooking start(String ownerId, String tenantId, BookingPeriod bookingPeriod) {
        return new ApartmentBooking(BookingStep.START, ownerId, tenantId, bookingPeriod);
    }
}
