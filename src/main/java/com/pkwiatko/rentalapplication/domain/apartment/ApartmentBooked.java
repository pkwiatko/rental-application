package com.pkwiatko.rentalapplication.domain.apartment;

import java.time.LocalDateTime;
import java.util.UUID;

public class ApartmentBooked {
    private final String eventId;
    private final LocalDateTime eventCreationFateTime;
    private final String apartmentId;
    private final String ownerId;
    private final String tenantId;
    private final Period period;

    private ApartmentBooked(String eventId, LocalDateTime eventCreationFateTime, String apartmentId, String ownerId, String tenantId, Period period) {
        this.eventId = eventId;
        this.eventCreationFateTime = eventCreationFateTime;
        this.apartmentId = apartmentId;
        this.ownerId = ownerId;
        this.tenantId = tenantId;
        this.period = period;
    }

    static ApartmentBooked create(String apartmentId, String ownerId, String tenantId, Period period) {
        String eventId = UUID.randomUUID().toString();
        LocalDateTime eventCreationFateTime = LocalDateTime.now();

        return new ApartmentBooked(eventId, eventCreationFateTime, apartmentId, ownerId, tenantId, period);
    }
}
