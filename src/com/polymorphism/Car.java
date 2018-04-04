package com.polymorphism;

public class Car {

    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public String getName() {
        return name;
    }

    public void isStartEngine() {
        if (isEngine() == true) {
            System.out.println("The car has started in the gear 1");
        } else
            System.out.println("Cannot start car the engine is off");
    }

    public void accelerate() {
        if (getSpeed() >= 50) {
            System.out.println("The car is accelerating");
        } else
            System.out.println("The car is on constant speed");
    }

    public void brake() {
        if (getSpeed() == 0) {
            System.out.println("Warning : Apply brakes");
        } else
            System.out.println("Keep on accelerating");
    }

}

    class Tesla extends Car {


        public Tesla(int cylinders, String name) {
            super(cylinders, name);

        }

        @Override
        public void accelerate() {

            if (getSpeed() >= 50) {
                System.out.println("The " + getClass().getSimpleName() + " is accelerating");
            } else
                System.out.println("The " + getClass().getSimpleName() + "is on constant speed");
        }

        public void isStartEngine() {
            if (isEngine() == true) {
                System.out.println("The " + getClass().getSimpleName() + " has " + getCylinders() + " drive started ");
            } else
                System.out.println("Cannot start car the engine is off");
        }

    }

    class Viper extends Car {


        public Viper(int cylinders, String name) {
            super(cylinders, name);

        }

        @Override
        public void accelerate() {

            if (getSpeed() >= 100) {
                System.out.println("The " + getClass().getSimpleName() + " is accelerating");
            } else
                System.out.println("The " + getClass().getSimpleName() + "is on constant speed");
        }

        public void isStartEngine() {
            if (isEngine() == true) {
                System.out.println("The " + getClass().getSimpleName() + " has " + getCylinders() + " drive started ");
            } else
                System.out.println("Cannot start car the engine is off");
        }


        }

class GM extends Car {


    public GM(int cylinders, String name) {
        super(cylinders, name);

    }

    @Override
    public void accelerate() {

        if (getSpeed() >= 100) {
            System.out.println("The " + getClass().getSimpleName() + " is accelerating");
        } else
            System.out.println("The " + getClass().getSimpleName() + "is on constant speed");

    }

    public void isStartEngine() {
        if (isEngine() == true) {
            System.out.println("The " + getClass().getSimpleName() + " has " + getCylinders() + " drive started ");
        } else
            System.out.println("Cannot start car the engine is off");
    }


    public static void main(String args[])
    {
        Tesla tsl = new Tesla(6,"Tesla");
        tsl.isStartEngine();
        tsl.accelerate();

        Viper vpr = new Viper(8,"Viper");
        vpr.isStartEngine();
        vpr.accelerate();

        GM motors = new GM(10,"GMMotors");
        motors.isStartEngine();
        motors.accelerate();
    }
}

