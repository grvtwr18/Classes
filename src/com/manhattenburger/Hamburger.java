package com.manhattenburger;

public class Hamburger {

    private String breadRollType;
    private String meatType;
    private int basePrice;
    private boolean isLettuce;
    private boolean isTomato;
    private boolean isCarrot;
    private boolean isCheese;

    public Hamburger(String breadRollType, String meatType, int basePrice) {
        this.breadRollType = breadRollType;
        this.meatType = meatType;
        this.basePrice = basePrice;
        this.isLettuce = false;
        this.isTomato = false;
        this.isCarrot = false;
        this.isCheese = false;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeatType() {
        return meatType;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    public boolean isLettuce() {
        return isLettuce;
    }

    public boolean isTomato() {
        return isTomato;
    }

    public boolean isCarrot() {
        return isCarrot;
    }

    public boolean isCheese() {
        return isCheese;
    }

    public void additionalItems(boolean isCarrot,boolean isCheese, boolean isLettuce, boolean isTomato)
    {
        this.isLettuce = isLettuce;
        this.isTomato = isTomato;
        this.isCarrot = isCarrot;
        this.isCheese = isCheese;

        if(isCarrot==true)
        {
            System.out.println("The customer wish to add carrot. It will cost INR = 10");
            this.basePrice=getBasePrice()+10;

        }
        if(isTomato==true)
        {
            System.out.println("The customer wish to add tomato. It will cost INR = 10");
            this.basePrice=getBasePrice()+10;

        }
        if(isLettuce==true)
        {
            System.out.println("The customer wish to add Lettuce. It will cost INR = 20");
            this.basePrice=getBasePrice()+20;

        }
        if(isCheese==true)
        {
            System.out.println("The customer wish to add tomato. It will cost INR = 10");
            this.basePrice=getBasePrice()+50;

        }

    }

    public void totalPrice()
    {
        System.out.println("Total additons in the system is with following items "+"\n"
                +"1. Bread is of type - "+getBreadRollType()+"\n"+
                "2. Meat is of type - "+getMeatType()+
                "\n"+"3.Tomato INR 10 per addition = "+isTomato()+"\n"+
                "4.Lettuce INR 20 per addition = "+isLettuce()+"\n"+
                "5.Carrot INR 10 per addition= "+isCarrot()+"\n"+
                "6.Cheese INR 50 per addition = "+isCheese()+"\n"+
                "Total price of the burger is now = "+  getBasePrice() );
    }



}
