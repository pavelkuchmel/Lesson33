package com.company;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class FishEX implements Externalizable {
    //private static final long
    private String name;
    private int weight;
    private double price;

    public FishEX(){
        name = "";
        weight = 0;
        price = 0.0;
    }

    public FishEX(String name, double price, int weight) {
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
        return "FishEX{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                '}';
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeUTF(name);
        objectOutput.writeInt(weight);
        objectOutput.writeDouble(price);
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        name = objectInput.readUTF();
        weight = objectInput.readInt();
        price = objectInput.readDouble();
    }
}
