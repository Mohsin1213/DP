package com.company;

/**
 * Created by hp on 2/9/2017.
 */
public class ColorFactory
{
    private IColor color;

    public void getIColor(String color1)
    {
        if (color1.equals("Red"))
        {
            color = new Red();
            color.Fill();
        }
        else   if (color1.equals("Blue"))
        {
            color = new Blue();
            color.Fill();
        }
        else   if (color1.equals("Yellow"))
        {
            color = new Yellow();
            color.Fill();
        }
        else {
            System.out.println("No Color Match");
        }
    }
}
