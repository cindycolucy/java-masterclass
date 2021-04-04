package com.colucy;

public class Couch {

    private String material;
    private int seats;
    private String color;

    public Couch(String material, int seats, String color) {
        this.material = material;
        this.seats = seats;
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public int getSeats() {
        return seats;
    }

    public String getColor() {
        return color;
    }
}
