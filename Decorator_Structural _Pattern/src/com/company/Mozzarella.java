package com.company;

/**
 * Created by hp on 2/20/2017.
 */
public class Mozzarella extends ToppingDecorator
{
    public Mozzarella(Pizza newPizza)
    {
        super(newPizza);
        System.out.println("Adding dough");
        System.out.println("Adding Mozz");
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription() + "Mozzarella";
    }

    @Override
    public double getCost() {
        System.out.println("Cost of Mozz" + 5.00);
        return tempPizza.getCost() + 5.00;
    }
}
