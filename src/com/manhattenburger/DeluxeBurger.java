package com.manhattenburger;

public class DeluxeBurger extends Hamburger {

    private boolean isChips;
    private boolean isDrink;


    public DeluxeBurger(String breadRollType, String meatType, int basePrice) {
        super(breadRollType, meatType, basePrice);
        this.isChips=true;
        this.isDrink=true;
        System.out.println("The customer is opting for Deluxe Burger with Chips and Cold Drink");
        additionalItems(false,false,false, false);
    }

    public boolean isChips() {
        return isChips;
    }

    public boolean isDrink() {
        return isDrink;
    }

    @Override
    public void totalPrice() {

        setBasePrice(getBasePrice()+70);
        System.out.println("Total additons in the system is with following items "+"\n"
                +"1. Bread is of type - "+getBreadRollType()+"\n"+
                "2. Meat is of type - "+getMeatType()+"\n"+
                "3.Chips INR 30 per addition = "+isChips()+"\n"+
                "4.Drinks INR 40 per addition = "+isDrink()+"\n"+
                "Total price of the burger is now = "+  getBasePrice());
    }
}
