package com.pkwiatko.rentalapplication.infrastructure.rest.api.apartment;

import java.time.LocalDate;

public class ApartmentBookingDto {
    private final String tenantId;
    private final LocalDate start;
    private final LocalDate end;

    public ApartmentBookingDto(String tenantId, LocalDate start, LocalDate end) {
        this.tenantId = tenantId;
        this.start = start;
        this.end = end;
    }

    String getTenantId() {
        return tenantId;
    }

    LocalDate getStart() {
        return start;
    }

    LocalDate getEnd() {
        return end;
    }
}
