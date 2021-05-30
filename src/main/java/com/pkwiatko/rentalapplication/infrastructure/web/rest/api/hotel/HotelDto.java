package com.pkwiatko.rentalapplication.infrastructure.web.rest.api.hotel;

public class HotelDto {
    private final String name;
    private final String street;
    private final String postalCode;
    private final String buildingNumber;
    private final String city;
    private final String country;

    public HotelDto(String name, String street, String postalCode, String buildingNumber, String city, String countr) {
        this.name = name;
        this.street = street;
        this.postalCode = postalCode;
        this.buildingNumber = buildingNumber;
        this.city = city;
        this.country = countr;
    }

    String getName() {
        return name;
    }

    String getStreet() {
        return street;
    }

    String getPostalCode() {
        return postalCode;
    }

    String getBuildingNumber() {
        return buildingNumber;
    }

    String getCity() {
        return city;
    }

    String getCountry() {
        return country;
    }
}
