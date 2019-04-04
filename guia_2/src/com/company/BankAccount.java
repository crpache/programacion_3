package com.company;

public class BankAccount {
    private int id;
    private String name;
    private double balance;

    public BankAccount(String name){
        this.id = generateID();
        this.name = name;
        this.balance = 0;
    }

    public BankAccount(String name, double balance){
        this.id = generateID();
        this.name = name;
        this.balance = balance;
    }

    private int generateID(){
        return (int)(Math.random()*999999999 + 100000000);
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public double getBalance(){
        return balance;
    }

    /*public void setName(String name){
        this.name = name;
    }*/

    /*public void setBalance(double balance){
        this.balance = balance;
    }*/

    public void credit(double amount){
        this.balance += amount;
    }

    public void debit(double amount){
        if(this.balance < amount){
            System.out.println("Non-sufficient funds");
        } else {
            this.balance -= amount;
        }
    }

    public void info(){
        System.out.println("Bank Account [ID: " + this.id
                            + ", Name: " + this.name
                            + ", Balance: $" + this.balance + "]");
    }
}
