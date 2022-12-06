package com.company;

import java.io.Serializable;

public class Fish implements Serializable {
    //private static final long
    private String name;
    private int weight;
    transient private double price;

    public Fish(){
        name = "Карась";
        weight = 10;
        price = 66.6;
    }

    public Fish(String name, double price, int weight) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getWeight(){
        return weight;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
