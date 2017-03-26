package com.company;

/**
 * Created by hp on 2/9/2017.
 */
public class Main
{
    public static void main(String args[])
    {
        System.out.println("Enter Your Factory:  ");
        java.util.Scanner scan = new java.util.Scanner(System.in);
        String input = scan.next();

        FactOfFact f = new FactOfFact();

        if (input.equals("Shape"))
        {
            f.getShape();
        }
        else if (input.equals("Color"))
        {
            f.getColor();
        }
        else
        {
            System.out.println("No Factory In Program");
        }
    }
}
