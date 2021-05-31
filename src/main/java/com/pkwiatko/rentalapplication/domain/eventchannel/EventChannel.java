package com.pkwiatko.rentalapplication.domain.eventchannel;

import com.pkwiatko.rentalapplication.domain.apartment.ApartmentBooked;
import com.pkwiatko.rentalapplication.domain.hotelroom.HotelRoomBooked;

public interface EventChannel {
    void publish(ApartmentBooked apartmentBooked);

    void publish(HotelRoomBooked hotelRoomBooked);
}
