package model;

public class BookedRoom {
    private int id, bookingId,roomId;
    private float rate;

    public BookedRoom(int id, int bookingId, int roomId, float rate) {
        this.id = id;
        this.bookingId = bookingId;
        this.roomId = roomId;
        this.rate = rate;
    }

    public BookedRoom() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }
}
