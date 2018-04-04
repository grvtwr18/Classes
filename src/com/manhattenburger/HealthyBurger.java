package com.manhattenburger;

public class HealthyBurger extends Hamburger{

    private boolean isOlive;
    private boolean isSpinach;

    public HealthyBurger(String meatType, int basePrice, boolean isOlive, boolean isSpinach) {
        super("Brown Bread Rye Roll", meatType, basePrice);
        this.isOlive = isOlive;
        this.isSpinach = isSpinach;
    }

    public boolean isOlive() {
        return isOlive;
    }

    public boolean isSpinach() {
        return isSpinach;
    }

    @Override
    public void additionalItems(boolean isCarrot, boolean isCheese, boolean isLettuce, boolean isTomato) {
        super.additionalItems(isCarrot, isCheese, isLettuce, isTomato);
        if(isOlive==true)
        {
            System.out.println("The customer wish to add Olive. It will cost INR = 30");
            setBasePrice(getBasePrice()+30);
        }
        if(isSpinach==true)
        {
            System.out.println("The customer wish to add spinach. It will cost INR = 10");
            setBasePrice(getBasePrice()+20);
        }

    }

    @Override
    public void totalPrice() {
        System.out.println("Total additons in the system is with following items "+"\n"
                +"1. Bread is of type - "+getBreadRollType()+"\n"+
                "2. Meat is of type - "+getMeatType()+
                "\n"+"3.Tomato INR 10 per addition = "+isTomato()+"\n"+
                "4.Lettuce INR 20 per addition = "+isLettuce()+"\n"+
                "5.Carrot INR 10 per addition= "+isCarrot()+"\n"+
                "6.Cheese INR 50 per addition = "+isCheese()+"\n"+
                "7.Olive INR 30 per addition = "+isOlive()+"\n"+
                "8.Spinach INR 20 per addition = "+isSpinach()+"\n"+
                "Total price of the burger is now = "+  getBasePrice() );
    }


    }

