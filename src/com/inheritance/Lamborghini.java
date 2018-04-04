package com.inheritance;

public class Lamborghini extends Car {

    private String modelOfTheCar;
    private int topSpeed;
    private String interiorOfTheCar;

    public Lamborghini(String gears, int speed, String brakingSystem, int cubicCentimetre, String safety, String engineTransmission, String modelOfTheCar, String interiorOfTheCar) {
        super(gears, speed, brakingSystem, cubicCentimetre, safety, engineTransmission, "Lamborghini");
        this.modelOfTheCar = modelOfTheCar;
        this.interiorOfTheCar = interiorOfTheCar;
    }


    public String getModelOfTheCar() {
        return modelOfTheCar;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public String getInteriorOfTheCar() {
        return interiorOfTheCar;

    }

    @Override
    public void speed() {
        super.speed();
        System.out.println("top speed of the car is "+ 10*getSpeed());
    }

    @Override
    public void infoOfTheCar() {
        super.infoOfTheCar();
        System.out.println("Model of the car is -----"+getModelOfTheCar());
        speed();
        System.out.println("Model of the car is -----"+getInteriorOfTheCar());
    }
}
