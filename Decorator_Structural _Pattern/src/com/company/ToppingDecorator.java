package com.company;

/**
 * Created by hp on 2/20/2017.
 */
public abstract class ToppingDecorator implements Pizza
{
    protected Pizza tempPizza;

    public ToppingDecorator(Pizza newPizza)
    {
        tempPizza = newPizza;
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription();
    }

    @Override
    public double getCost() {
        return tempPizza.getCost();
    }
}
