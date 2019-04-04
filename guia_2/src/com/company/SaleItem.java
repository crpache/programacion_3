package com.company;

public class SaleItem {
    private int id;
    private String description;
    private int cant;
    private float unitPrice;

    public SaleItem(String description, int cant, float unitPrice){
        this.id = (int)(Math.random()*10000) + 1;
        this.description = description;
        this.cant = cant;
        this.unitPrice = unitPrice;
    }

    public int getId(){
        return id;
    }

    public float totalPrice(){
        return this.unitPrice * this.cant;
    }

    public void itemDescription(){
        System.out.println("SaleItem: [ID: " + id
                            + ", Description: " + this.description
                            + ", Cant: " + this.cant
                            + ", Unit Price: " + this.unitPrice
                            + ", Total Price: " + this.totalPrice() + "]");
    }
}
