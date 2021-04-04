package com.colucy;

public class Door {

    private String swing;
    private int height;
    private int width;

    public Door(String swing, int height, int width) {
        this.swing = swing;
        this.height = height;
        this.width = width;
    }

    public void openDoor(){
        System.out.println("Door opens to the " + swing);
    }

    public String getSwing() {
        return swing;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
