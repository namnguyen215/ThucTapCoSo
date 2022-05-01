package model;

public class listRoomByLocation {
    private int id;
    private String name;
    private int numberOfBedrooms;
    private float rate;
    private String room_images;

    public listRoomByLocation(int id, String name, int numberOfBedrooms, float rate, String room_images) {
        this.id = id;
        this.name = name;


        this.numberOfBedrooms = numberOfBedrooms;
        this.rate = rate;
        this.room_images = room_images;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public void setNumberOfBedrooms(int numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public String getRoom_images() {
        return room_images;
    }

    public void setRoom_images(String room_images) {
        this.room_images = room_images;
    }
}
