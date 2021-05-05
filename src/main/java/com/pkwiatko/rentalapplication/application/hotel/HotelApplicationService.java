package com.pkwiatko.rentalapplication.application.hotel;

import com.pkwiatko.rentalapplication.domain.hotel.Hotel;
import com.pkwiatko.rentalapplication.domain.hotel.HotelFactory;

public class HotelApplicationService {

    public void add(String name, String street, String postalCode, String buildingNumber, String city, String country)   {
        Hotel hotel = new HotelFactory().create(name, street, postalCode, buildingNumber, city, country);
    }
}
