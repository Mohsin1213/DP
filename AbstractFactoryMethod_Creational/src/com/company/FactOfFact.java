package com.company;

/**
 * Created by hp on 2/9/2017.
 */
public class FactOfFact extends AbstractFactory
{
    public void getShape()
    {
        System.out.println("Enter Your Shape:  ");
        java.util.Scanner s = new java.util.Scanner(System.in);
        String input = s.next();

        ShapeFactory f = new ShapeFactory();
        f.getIShape(input);
    }
    public void getColor()
    {
        System.out.println("Enter Your Color:  ");
        java.util.Scanner s2 = new java.util.Scanner(System.in);
        String input2 = s2.next();

        ColorFactory fc = new ColorFactory();
        fc.getIColor(input2);
    }
}
