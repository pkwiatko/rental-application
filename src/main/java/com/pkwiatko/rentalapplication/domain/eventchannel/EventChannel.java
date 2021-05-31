package com.pkwiatko.rentalapplication.domain.eventchannel;

import com.pkwiatko.rentalapplication.domain.apartment.ApartmentBooked;

public interface EventChannel {
    void publish(ApartmentBooked apartmentBooked);
}
