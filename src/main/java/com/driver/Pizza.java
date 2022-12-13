package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean ischeeseadded = false;
    private boolean istoppingsadded = false;
    private boolean istakeaway = false;
    private int toppingsprice;
    private int cheeseprice = 80;
    private int paperbag = 20;
    private int veg = 300;
    private int nonveg = 400;
    private int initialprice;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg) {
            this.price += veg;
            initialprice = veg;
        }
        else{
            this.price += nonveg;
            initialprice = nonveg;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(ischeeseadded==false){
        this.price+=80;
        ischeeseadded=true;
        }
    }

    public void addExtraToppings(){
        if(istoppingsadded==false){
            if(isVeg){
                this.toppingsprice=70;
                this.price+=this.toppingsprice;
            }
            else{
                this.toppingsprice = 120;
                this.price+=this.toppingsprice;
            }
        }
        
    }

    public void addTakeaway(){
        if(istakeaway==false){
            this.price+=this.paperbag;
            istakeaway=true;
        }
       
    }
  private boolean isbill=false;
    public String getBill(){
        // your code goes here
        if(isbill==false){
         bill = "Base Price Of The Pizza: "+ this.initialprice+"\n";
         bill+="Extra Cheese Added: "+this.cheeseprice+"\n";
         bill+="Extra Toppings Added: "+this.toppingsprice+"\n";
         bill+="Paperbag Added: "+this.paperbag+"\n";
         bill+="Total Price: "+this.price+"\n";
          isbill = true;
        }
        return this.bill;
    }
}
