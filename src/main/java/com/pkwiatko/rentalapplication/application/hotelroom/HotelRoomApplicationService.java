package com.pkwiatko.rentalapplication.application.hotelroom;

import com.pkwiatko.rentalapplication.domain.eventchannel.EventChannel;
import com.pkwiatko.rentalapplication.domain.hotelroom.HotelRoom;
import com.pkwiatko.rentalapplication.domain.hotelroom.HotelRoomFactory;
import com.pkwiatko.rentalapplication.domain.hotelroom.HotelRoomRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class HotelRoomApplicationService {
    private final HotelRoomRepository hotelRoomRepository;
    private final EventChannel eventChannel;

    public HotelRoomApplicationService(HotelRoomRepository hotelRoomRepository, EventChannel eventChannel) {
        this.hotelRoomRepository = hotelRoomRepository;
        this.eventChannel = eventChannel;
    }

    public void add(String hotelId, int number, Map<String , Double> spacesDefinition, String description)    {
        HotelRoom hotelRoom = new HotelRoomFactory().create(hotelId, number, spacesDefinition, description);

        hotelRoomRepository.save(hotelRoom);
    }

    public void book(String id, String tenantId, List<LocalDate> days) {
        HotelRoom hotelRoom = hotelRoomRepository.findById(id);

        hotelRoom.book(tenantId, days, eventChannel);
    }
}
