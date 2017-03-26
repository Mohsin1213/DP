package com.company;

/**
 * Created by hp on 2/23/2017.
 */
public abstract class Duck
{
    abstract void display();

    ISwim s;
    IFly f;
    IRun r;

    public void setS(ISwim s) {
        this.s = s;
    }

    public void setF(IFly f) {
        this.f = f;
    }

    public void setR(IRun r1) {
        this.r = r1;
    }
}
