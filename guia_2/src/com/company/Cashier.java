package com.company;

public class Cashier {
    private int bankCode;
    private int officeCode;
    private float availableMoney;

    public Cashier(){

    }

    public void agregate(float cash){
        this.availableMoney += cash;
    }

    public void exctract(float cash){
        if(this.availableMoney >= cash){
            this.availableMoney -= cash;
        }
    }

    public float getBalance(){
        return this.availableMoney;
    }


}
