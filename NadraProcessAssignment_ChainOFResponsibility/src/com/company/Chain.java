package com.company;

/**
 * Created by hp on 2/6/2017.
 */
public interface Chain
{
public void setNextChain(Chain nextChain);

public void service(Services request);
}


