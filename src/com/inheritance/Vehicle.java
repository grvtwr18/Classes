package com.inheritance;

public class Vehicle {

    private String gears;
    private int wheels;
    private String typeOfVehicle;
    private int speed;
    private String brakingSystem;

    public Vehicle(String gears, int wheels, String typeOfVehicle, int speed, String brakingSystem) {
        this.gears = gears;
        this.wheels = wheels;
        this.typeOfVehicle = typeOfVehicle;
        this.speed = speed;
        this.brakingSystem = brakingSystem;
    }

    public String getGears() {
        return gears;
    }

    public int getWheels() {
        return wheels;
    }

    public String getTypeOfVehicle() {
        return typeOfVehicle;
    }

    public int getSpeed() {
        return speed;
    }

    public String getBrakingSystem() {
        return brakingSystem;
    }

    public void speed()
    {
        System.out.println("Speed of the Vehicle is ----"+getSpeed());
    }

    public void gears()
    {
        System.out.println("Gears of the vehicle is ----"+getGears());
    }

    public void wheels()
    {
        System.out.println("Nummber of wheel of vehicle is ----"+getWheels());
    }

    public void typeOfVehicle()
    {
        System.out.println("Type of vehicle is ----"+getWheels());
    }

    public void brakingSystem()
    {
        System.out.println("Braking system of vehicle is ----"+getBrakingSystem());
    }



}
