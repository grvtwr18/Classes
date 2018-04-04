package com.composition;

public class Furniture {

    private String bedType;
    private int numOfChairs;
    private boolean isCarpet;
    private ElectricalAppliances ea;

    public Furniture(String bedType, int numOfChairs, boolean isCarpet, ElectricalAppliances ea) {
        this.bedType = bedType;
        this.numOfChairs = numOfChairs;
        this.isCarpet = isCarpet;
        this.ea = ea;
    }

    public String getBedType() {
        return bedType;
    }

    public int getNumOfChairs() {
        return numOfChairs;
    }

    public boolean isCarpet() {
        return isCarpet;
    }

    public void  getEa() {
        ea.isFurnished();
    }


}
