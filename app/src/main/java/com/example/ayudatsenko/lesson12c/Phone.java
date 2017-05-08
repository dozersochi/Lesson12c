package com.example.ayudatsenko.lesson12c;

public class Phone {

    private String name;
    private int price;

    Phone(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(){
        this.price = price;
    }

    @Override
    public String toString(){
        return name + " " + String.valueOf(price);
    }

}
