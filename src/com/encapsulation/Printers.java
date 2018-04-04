package com.encapsulation;

public class Printers {

    private int tonerLevel;
    private int pagesToBePrinted;
    private boolean isDuplexPrinter;

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesToBePrinted() {
        return pagesToBePrinted;
    }

    public boolean isDuplexPrinter() {
        return isDuplexPrinter;
    }

    public Printers(int tonerLevel, int pagesToBePrinted, boolean isDuplexPrinter) {
        if(tonerLevel<100) {
            this.tonerLevel = tonerLevel;
        }else
        {
            this.tonerLevel=0;
        }
        this.pagesToBePrinted = pagesToBePrinted;
        this.isDuplexPrinter = isDuplexPrinter;
    }

    public void fillUpToner(int tonerLevel)
    {
        if((tonerLevel>0&&tonerLevel<=100)&&(getTonerLevel()+tonerLevel)<=100) {
            this.tonerLevel += tonerLevel;
            System.out.println("Toner level is -----" + getTonerLevel());
        }
        else
            System.out.println("The toner level you want to fill is out of the range of the printer");
    }

    public void printingPage()
    {
      if(getTonerLevel()<50)
      {
          System.out.println("The toner level is below required value. Please refill the toner");
      }
      else
      {
          if(isDuplexPrinter()){

              for(int i =1;i<=getPagesToBePrinted()/2;i++)
              {
                  System.out.println("Page printing ----"+i);
                  }

                  if(getPagesToBePrinted()%2>0)
                  {
                      System.out.println("Page printing -------"+(getPagesToBePrinted()/2+1));
                  }


          }
          else
          {
              for(int i =1;i<=getPagesToBePrinted();i++)
              {
                  System.out.println("Page printing ----"+i);
              }
          }

        }
    }

}
