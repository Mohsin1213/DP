package com.company;

/**
 * Created by hp on 2/6/2017.
 */
public class Finger_Prints implements Chain
{
    private Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {nextInChain = nextChain;}

    @Override
    public void service(Services request)
    {
        System.out.println("Your Finger Prints");

        nextInChain.service(request);

    }
}
