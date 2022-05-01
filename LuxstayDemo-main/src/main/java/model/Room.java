package model;

public class Room {
    private int id;
    private String name;
    private String position_district;
    private String position_city;
    private float area;
    private int numberOfBedrooms;
    private int numberOfBathrooms;
    private int numberOfFloors;
    private float rate;
    private String description;
    private float price;

    public Room() {
    }

    public Room(int id, String name, String position_district, String position_city, int area, int numberOfBedrooms, int numberOfBathrooms, int numberOfFloors, float rate, String description, float price) {
        this.id = id;
        this.name = name;
        this.position_district = position_district;
        this.position_city = position_city;
        this.area = area;
        this.numberOfBedrooms = numberOfBedrooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfFloors = numberOfFloors;
        this.rate = rate;
        this.description = description;
        this.price = price;
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

    public String getPosition_district() {
        return position_district;
    }

    public void setPosition_district(String position_district) {
        this.position_district = position_district;
    }

    public String getPosition_city() {
        return position_city;
    }

    public void setPosition_city(String position_city) {
        this.position_city = position_city;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public void setNumberOfBedrooms(int numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public void setNumberOfBathrooms(int numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
