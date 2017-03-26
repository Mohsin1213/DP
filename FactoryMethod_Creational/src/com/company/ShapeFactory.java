package com.company;

/**
 * Created by hp on 2/9/2017.
 */
public class ShapeFactory
{
    private IShape shape;

    public void getIShape(String shape1)
    {
        if (shape1.equals("Circle"))
        {
            shape = new Circle();
            shape.draw();
        }
        else  if (shape1.equals("Square"))
        {
            shape = new Square();
            shape.draw();
        }
        else  if (shape1.equals("Triangle"))
        {
            shape = new Triangle();
            shape.draw();
        }
        else {
            System.out.println("Wrong Shape");
        }
    }
}
