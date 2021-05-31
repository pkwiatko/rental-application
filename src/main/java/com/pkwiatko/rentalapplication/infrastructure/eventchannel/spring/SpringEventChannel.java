package com.pkwiatko.rentalapplication.infrastructure.eventchannel.spring;

import com.pkwiatko.rentalapplication.domain.apartment.ApartmentBooked;
import com.pkwiatko.rentalapplication.domain.eventchannel.EventChannel;
import com.pkwiatko.rentalapplication.domain.hotelroom.HotelRoomBooked;
import org.springframework.context.ApplicationEventPublisher;

class SpringEventChannel implements EventChannel {
    private final ApplicationEventPublisher publisher;

    SpringEventChannel(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public void publish(ApartmentBooked apartmentBooked) {
        publisher.publishEvent(apartmentBooked);
    }

    @Override
    public void publish(HotelRoomBooked hotelRoomBooked) {
        publisher.publishEvent(hotelRoomBooked);
    }
}
