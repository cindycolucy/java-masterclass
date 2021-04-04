package com.colucy;

public class TV {

    private int size;
    private String manufacturer;
    private String model;

    public TV(int size, String manufacturer, String model) {
        this.size = size;
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public void turnOff(){
        System.out.println("The TV is turned off");
    }

    public int getSize() {
        return size;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }
}
