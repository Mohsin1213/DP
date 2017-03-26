package com.company;

/**
 * Created by hp on 2/6/2017.
 */
class Token_Service implements Chain
{
    private Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain)
    {nextInChain = nextChain;}

    @Override
    public void service(Services request)
    {
        System.out.println("Show Your Token No:   ");
        nextInChain.service(request);

    }

}
