package com.company;

/**
 * Created by hp on 2/9/2017.
 */
public class Main
{
    public static void main(String args[])
    {
        System.out.println("Enter Your Shape:   ");
        java.util.Scanner scan = new java.util.Scanner(System.in);
        String input = scan.next();

        ShapeFactory f = new ShapeFactory();
        f.getIShape(input);
    }
}
