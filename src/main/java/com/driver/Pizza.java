package com.driver;

public class Pizza {

    protected int price;
    private Boolean isVeg;
    private String bill;
    private int bagPrice=20;
    private int toppingsPrice;
    private int cheesePrice=80;
    private boolean isExtraCheeseAdded;
    private boolean isExtraToppingsAdded;
    private boolean hasTakenAway;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg){
            price=300;
            toppingsPrice=70;
        }
        else {
            price = 400;
            toppingsPrice = 120;
        }
        bill="Base Price Of The Pizza: "+price+"\n";
        hasTakenAway=false;
        isExtraCheeseAdded=false;
        isExtraToppingsAdded=false;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if (isExtraCheeseAdded){
            //we  dont need to add again
        }
        else{
            price+=cheesePrice;
            bill+="Extra Cheese Added: "+cheesePrice+"\n";
            isExtraCheeseAdded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if (isExtraToppingsAdded){
            //we  dont need to add again
        }
        else{
            price+=toppingsPrice;
            bill+="Extra Toppings Added: "+toppingsPrice+"\n";
            isExtraToppingsAdded=true;
        }
    }

    public void addTakeaway(){
        if (hasTakenAway){
            //if already taken away no need to do anything
        }
        else {
            this.price+=bagPrice;
            bill+="Paperbag Added: "+bagPrice+"\n";
            hasTakenAway=true;
        }
    }

    public String getBill(){
        // your code goes here
        return this.bill+"Total Price: "+price+"\n";
    }
}
