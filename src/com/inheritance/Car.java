package com.inheritance;

public class Car extends Vehicle {

    private int cubicCentimetre;
    private String safety;
    private String engineTransmission;
    private String carManufacturer;

    public Car(String gears, int speed, String brakingSystem, int cubicCentimetre, String safety, String engineTransmission, String carManufacturer) {
        super(gears,4, "Car", speed, brakingSystem);
        this.cubicCentimetre = cubicCentimetre;
        this.safety = safety;
        this.engineTransmission = engineTransmission;
        this.carManufacturer = carManufacturer;
    }

    public int getCubicCentimetre() {
        return cubicCentimetre;
    }

    public String getSafety() {
        return safety;
    }

    public String getEngineTransmission() {
        return engineTransmission;
    }

    public String getCarManufacturer() {
        return carManufacturer;
    }


    public void carManufacturer()
    {
        System.out.println("Car Manufacturer is --------"+getCarManufacturer());
    }

    public void engineTransmission()

    {
        System.out.println("Engine Transmission of the car is -----"+getEngineTransmission());
    }

    public void safety()
    {
        System.out.println("Safety of the car includes -------"+getSafety());
    }

    public void cubicCentimetre()
    {
        System.out.println("CC of the car is ---------"+getCubicCentimetre());
    }

    public void infoOfTheCar()
    {
        typeOfVehicle();
        gears();
        brakingSystem();
        wheels();
        carManufacturer();
        engineTransmission();
        safety();
        cubicCentimetre();
    }

}
