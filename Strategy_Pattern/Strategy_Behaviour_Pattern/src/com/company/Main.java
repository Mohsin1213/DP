package com.company;

/**
 * Created by hp on 2/27/2017.
 */
public class Main
{
    public static void main(String args[])
    {
        Duck whiteduck = new WhiteDuck();
        ISwim s = new YesSwim();
        IFly f = new NotFly();
        IRun r = new NotRun();

        whiteduck.setS(s);
        whiteduck.setF(f);
        whiteduck.setR(r);

        s.swim();
        f.Fly();
        r.run();

        whiteduck.display();
    }
}
