package com.company;

/**
 * Created by hp on 2/2/2017.
 */
public class MulNumber implements Chain
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
        if (request.getcalcWanted() == "mul")
        {
            System.out.println(request.getNumber1() + " * " + request.getNumber2() + " = " +
                    (request.getNumber1() * request.getNumber2()));
        }
        else {
            nextInChain.calculate(request);
        }
    }
}
