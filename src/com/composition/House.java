package com.composition;


public class House {

    private Dimension theSize;
    private Furniture theFurniture;

    public House(Dimension theSize, Furniture theFurniture) {
        this.theSize = theSize;
        this.theFurniture = theFurniture;
    }

    public Dimension getTheSize() {
        return theSize;
    }

    public Furniture getTheFurniture() {
        return theFurniture;
    }

    public void getTheFurnitureDetails() {
       theFurniture.getEa();
    }

}
