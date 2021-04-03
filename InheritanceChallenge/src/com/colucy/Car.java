package com.colucy;

public class Car extends Vehicle {

    private String color;
    private int doors;

    public Car(String color, int doors) {
        super(true, 4);
        this.color = color;
        this.doors = doors;
    }
}
