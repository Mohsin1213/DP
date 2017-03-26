package com.company;

/**
 * Created by hp on 2/20/2017.
 */
public class Main {
    public static void main(String args[])
    {
        Pizza obj = new Mozzarella(
                new Mozzarella(
                new Mozzarella(
                        new PlainPizza())));
        System.out.println("Pizza Ingredients " + obj.getDescription());
        System.out.println("Price"+ obj.getCost());
    }

}
