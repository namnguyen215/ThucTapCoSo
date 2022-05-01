package model;

public class myBooking {
    private int bookingId;
    private int roomId;

    public myBooking(int bookingId, int roomId) {
        this.bookingId = bookingId;
        this.roomId = roomId;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }
}
