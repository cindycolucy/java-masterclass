package com.colucy;

class Car {
    private String name;
    private boolean engine;
    private int wheels;
    private int doors;
    private int cylinders;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine() {
        return getClass().getSimpleName() + ": Engine is starting";
    }

    public String accelerate() {
        return getClass().getSimpleName() + ": Accelerating";
    }

    public String brake() {
        return getClass().getSimpleName() + ": Braking";
    }
}

class Flex extends Car {

    public Flex(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + ": Starts well for an old car";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + ": Great acceleration because of " + getCylinders() + " cylinders";
    }

}

class Mini extends Car {

    public Mini(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + ": Starts like a lawn mower";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + ": The hamsters are going because of only " + getCylinders() + " cylinders";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + ": Brakes on a dime";
    }
}

class Jeep extends Car {

    public Jeep(String name, int cylinders) {
        super(name, cylinders);
    }
}

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Base car", 8);
        System.out.println(car.getName());
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Flex flex = new Flex("Box car", 8);
        System.out.println(flex.getName());
        System.out.println(flex.startEngine());
        System.out.println(flex.accelerate());
        System.out.println(flex.brake());

        Mini mini = new Mini("Cooper", 4);
        System.out.println(mini.getName());
        System.out.println(mini.startEngine());
        System.out.println(mini.accelerate());
        System.out.println(mini.brake());

        Jeep jeep = new Jeep("Cherokee", 4);
        System.out.println(jeep.getName());
        System.out.println(jeep.startEngine());
        System.out.println(jeep.accelerate());
        System.out.println(jeep.brake());
    }
}
