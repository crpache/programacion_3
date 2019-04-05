package com.company;

public class Book {
    private String title;
    private float price;
    private int stock;
    private Author author;

    public Book(String title, float price, int stock, Author author){
        setTitle(title);
        setPrice(price);
        setStock(stock);
        setAuthor(author);
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setPrice(float price){
        this.price = price;
    }

    public void setStock(int stock){
        this.stock = stock;
    }

    public void setAuthor(Author author){
        this.author = author;
    }

    public String getTitle(){
        return this.title;
    }

    public float getPrice(){
        return this.price;
    }

    public int getStock(){
        return this.stock;
    }

    public String getAuthor(){ return this.author.getFullName(); }

    public String info(){
        return ("El libro " + getTitle() + " de " + getAuthor() + " se vende a $" + getPrice());
    }

}
