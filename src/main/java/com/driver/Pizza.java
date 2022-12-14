package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int cheeseprice;
    private int toppingsprice;
    private int takeawayprice;
    boolean ischeeseadded;
    boolean istoppingsadded;
    boolean istakeawayadded;
    boolean isbillgenerated;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.cheeseprice = 80;
        this.takeawayprice = 20;
        if(isVeg == true) {
            this.price = 300;
            this.toppingsprice = 70;
        }
        else{
           this.price = 400;
           toppingsprice = 120;
        }

        this.ischeeseadded = false;
        this.istoppingsadded = false;
        this.istakeawayadded = false;
        this.bill = "Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(ischeeseadded==false){
        this.price=this.price+this.cheeseprice;
        ischeeseadded=true;
        } 
    }

    public void addExtraToppings(){
        if(istoppingsadded==false){
            this.price = this.price+this.toppingsprice;
            istoppingsadded = true;
        }
        
    }

    public void addTakeaway(){
        if(istakeawayadded==false){
            this.price=this.price+this.takeawayprice;
            istakeawayadded=true;
        }
       
    }
  private boolean isbill=false;
    public String getBill(){
        // your code goes here
        if(isbillgenerated==false){
          if(ischeeseadded==true){
            this.bill = this.bill+"Extra Cheese Added: "+this.cheeseprice+"\n";
          
            }  
        if(istoppingsadded==true){
            this.bill = this.bill+"Extra Toppings Added: "+this.toppingsprice+"\n";
        }  
        if(istakeawayadded==true){
            this.bill = this.bill+"Paperbag Added: "+this.takeawayprice+"\n";

        }
       this.bill = this.bill+"Total Price: "+this.price+"\n";
       isbillgenerated = true;
     }
     return this.bill;
  }
}
