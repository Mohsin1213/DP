package com.company;

/**
 * Created by hp on 2/6/2017.
 */
public class Recipt_Generator implements Chain
{
    private Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {nextInChain = nextChain;}

    @Override
    public void service(Services request)
    {
       if (request.equals("Collection"))
       {
           System.out.println("Issuing Card");
       }
       else if (request.equals("Make"))
       {
           System.out.println("Recipt_Generate");
       }
    }
}
