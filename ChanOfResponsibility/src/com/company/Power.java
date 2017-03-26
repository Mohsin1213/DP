package com.company;

/**
 * Created by hp on 2/2/2017.
 */
public class Power implements Chain
{
    private Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain)
    {
        nextInChain = nextChain;
    }

    @Override
    public void calculate(Numbers request)
    {
        if (request.getcalcWanted() == "Power")
        {
            System.out.print(request.getNumber1() + " ^ " + request.getNumber2() + " = " +
                    Math.pow(request.getNumber1(),request.getNumber2()));
        }
        else {
            System.out.println("Only Works on Add,Sub,Mul,div,Power.... Otherwise handler chain not work");
        }
    }
}
