package com.composition;

public class ElectricalAppliances {

    private boolean isFan;
    private boolean isAC;
    private boolean isWashingMachine;
    private boolean isFridge;

    public ElectricalAppliances(boolean isFan, boolean isAC, boolean isWashingMachine, boolean isFridge) {
        this.isFan = isFan;
        this.isAC = isAC;
        this.isWashingMachine = isWashingMachine;
        this.isFridge = isFridge;
    }

    public boolean isFan() {
        return isFan;
    }

    public boolean isAC() {
        return isAC;
    }

    public boolean isWashingMachine() {
        return isWashingMachine;
    }

    public boolean isFridge() {
        return isFridge;
    }

    public boolean isFurnished()
    {
        if(isAC==true&&isFan==true&&isFridge==true&&isWashingMachine==true)
        {
            System.out.println("The Room is well furnished------");
            return true;
        }
        else
            System.out.println("The Room is not furnished");
        return false;
    }
}
