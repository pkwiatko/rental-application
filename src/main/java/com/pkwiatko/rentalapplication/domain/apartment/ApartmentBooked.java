package com.pkwiatko.rentalapplication.domain.apartment;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public class ApartmentBooked {
    private final String eventId;
    private final LocalDateTime eventCreationFateTime;
    private final String apartmentId;
    private final String ownerId;
    private final String tenantId;
    private final LocalDate periodStart;
    private final LocalDate periodEnd;

    private ApartmentBooked(String eventId, LocalDateTime eventCreationFateTime, String apartmentId, String ownerId, String tenantId, Period period) {
        this.eventId = eventId;
        this.eventCreationFateTime = eventCreationFateTime;
        this.apartmentId = apartmentId;
        this.ownerId = ownerId;
        this.tenantId = tenantId;
        periodStart = period.getStart();
        periodEnd = period.getEnd();
    }

    static ApartmentBooked create(String apartmentId, String ownerId, String tenantId, Period period) {
        String eventId = UUID.randomUUID().toString();
        LocalDateTime eventCreationFateTime = LocalDateTime.now();

        return new ApartmentBooked(eventId, eventCreationFateTime, apartmentId, ownerId, tenantId, period);
    }

    public String getEventId() {
        return eventId;
    }

    public LocalDateTime getEventCreationFateTime() {
        return eventCreationFateTime;
    }

    public String getApartmentId() {
        return apartmentId;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public String getTenantId() {
        return tenantId;
    }

    public LocalDate getPeriodStart() {
        return periodStart;
    }

    public LocalDate getPeriodEnd() {
        return periodEnd;
    }
}
