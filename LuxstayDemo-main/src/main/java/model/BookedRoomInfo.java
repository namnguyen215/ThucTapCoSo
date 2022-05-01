package model;

import java.util.Date;

public class BookedRoomInfo {
    private Room room;
    private Booking booking;
    private BookedRoom bookedRoom;

    public BookedRoomInfo() {
    }

    public BookedRoomInfo(Room room, Booking booking, BookedRoom bookedRoom) {
        this.room = room;
        this.booking = booking;
        this.bookedRoom = bookedRoom;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public BookedRoom getBookedRoom() {
        return bookedRoom;
    }

    public void setBookedRoom(BookedRoom bookedRoom) {
        this.bookedRoom = bookedRoom;
    }
}
