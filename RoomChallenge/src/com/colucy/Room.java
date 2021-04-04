package com.colucy;

public class Room {

    private Window window;
    private Door door;
    private Couch couch;
    private TV tv;

    public Room(Window window, Door door, Couch couch, TV tv) {
        this.window = window;
        this.door = door;
        this.couch = couch;
        this.tv = tv;
    }

    public void relax(){
        window.openWindow();
        door.openDoor();
        tv.turnOff();
        sit();
    }

    private void sit(){
        System.out.println("Sitting on one of " + couch.getSeats() + " seats");
    }
}
