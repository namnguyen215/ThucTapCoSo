package model;

public class topLocation {
    private String city;
    private int amount;

    public topLocation(String city, int amount) {
        this.city = city;
        this.amount = amount;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
