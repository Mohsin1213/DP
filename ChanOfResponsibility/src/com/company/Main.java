package com.company;

/**
 * Created by hp on 2/2/2017.
 */
public class Main
{
    public static void main(String args[])
    {
        Chain c1 = new AddNumber();
        Chain c2 = new SubNumber();
        Chain c3 = new MulNumber();
        Chain c4 = new DivNumber();
        Chain c5 = new Power();

        c1.setNextChain(c2);
        c2.setNextChain(c3);
        c3.setNextChain(c4);
        c4.setNextChain(c5);
       Numbers obj = new Numbers(2,8, "Power");

       c1.calculate(obj);
    }
}
