package com.colucy;

public class Window {

    private int width;
    private int height;
    private String manufacturer;

    public Window(int width, int height, String manufacturer) {
        this.width = width;
        this.height = height;
        this.manufacturer = manufacturer;
    }

    public void openWindow(){
        System.out.println("Window is opening " + height/2 + " inches");
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
