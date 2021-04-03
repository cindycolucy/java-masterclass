package com.colucy;

public class Vehicle {

    private boolean engine;
    private int wheels;

    public Vehicle(boolean engine, int wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    public void move(int speed){
        System.out.println("Vehicle.move() called. Vehicle moved at " + speed + " speed");
    }

    public boolean isEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }
}
