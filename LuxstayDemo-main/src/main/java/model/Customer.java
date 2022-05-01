package model;

public class Customer {
    private int id, age;
    private String name,address, phoneNumber;

    public Customer() {
    }
    public Customer( String name,int age,  String address, String phoneNumber) {
        this.age = age;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    public Customer(int id, String name, int age, String address, String phoneNumber) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
