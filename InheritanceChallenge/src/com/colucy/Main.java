package com.colucy;

public class Main {

    public static void main(String[] args) {
	    Vehicle vehicle = new Vehicle(true, 4);
	    Car car = new Car("red", 4);
	    Mini mini = new Mini("blue", 2,"hatchback", 5);

//	    car.move(65);
//	    mini.move(35);

	    if(vehicle.isEngine()) {
			mini.move(65);
		}
    }
}
