package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        /*Fish salmon = new Fish("salmon", 1000.2, 10);
        writeObject(salmon, "fish.txt");

        Fish newFish = (Fish) readObject("fish.txt");
        System.out.println(newFish);*/

        FishEX shark = new FishEX("Shark", 232.12, 83);
        writeObjectEX(shark, "fishEX.txt");

        FishEX newShark = (FishEX) readObjectEX("fishEX.txt");
        System.out.println(newShark);

    }

    public static Object readObject(String fileName) {
        Object obj = null;
        try(
                FileInputStream fis = new FileInputStream(fileName);
                ObjectInputStream ois = new ObjectInputStream(fis)
                ){
            obj = ois.readObject();
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
        return obj;
    }

    public static Object readObjectEX(String fileName) {
        FishEX obj = new FishEX();
        try(
                FileInputStream fis = new FileInputStream(fileName);
                ObjectInputStream ois = new ObjectInputStream(fis)
        ){
            obj.readExternal(ois);
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
        return obj;
    }

    public static void writeObjectEX(FishEX obj, String fileName) {
        try (
                FileOutputStream fos = new FileOutputStream(fileName);
                ObjectOutputStream oos = new ObjectOutputStream(fos)
        ){
            //new ObjectOutputStream(new FileOutputStream(fileName)).writeObject(obj);
            obj.writeExternal(oos);
        }catch (IOException e){

        }
    }

    public static void writeObject(Object obj, String fileName) {
        try (
                FileOutputStream fos = new FileOutputStream(fileName);
                ObjectOutputStream oos = new ObjectOutputStream(fos)
        ){
            //new ObjectOutputStream(new FileOutputStream(fileName)).writeObject(obj);
            oos.writeObject(obj);
        }catch (IOException e){

        }
    }
}
