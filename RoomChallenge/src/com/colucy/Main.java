package com.colucy;

public class Main {

    public static void main(String[] args) {
	    Window window = new Window(18, 24, "Andersen");
	    Door door = new Door("left", 72, 36);
	    Couch couch = new Couch("cotton", 3, "gray");
	    TV tv = new TV(33, "Sony", "Bravia");

	    Room room = new Room(window, door, couch, tv);
        room.relax();
    }
}
