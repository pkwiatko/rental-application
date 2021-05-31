package com.pkwiatko.rentalapplication.infrastructure.rest.api.hotelroom;

import java.util.Map;

public class HotelRoomDto {
    private final String hotelId;
    private final int number;
    private final Map<String , Double> spacesDefinition;
    private final String description;

    public HotelRoomDto(String hotelId, int number, Map<String, Double> spacesDefinition, String descriptio) {
        this.hotelId = hotelId;
        this.number = number;
        this.spacesDefinition = spacesDefinition;
        this.description = descriptio;
    }

    String getHotelId() {
        return hotelId;
    }

    int getNumber() {
        return number;
    }

    Map<String, Double> getSpacesDefinition() {
        return spacesDefinition;
    }

    String getDescription() {
        return description;
    }
}
