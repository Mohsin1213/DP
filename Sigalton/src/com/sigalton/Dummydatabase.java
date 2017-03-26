package com.sigalton;

/**
 * Created by hp on 1/27/2017.
 */
public class Dummydatabase
{
    static Dummydatabase obj;
    private String name;
    static int count = 0;
    static String arr[] = new String[3];
    static int point = 0;

    private Dummydatabase(String Name)
    {
        this.name = Name;
    }
    public static Dummydatabase getObj(String Name)
    {
        if (count < 3)
        {
            obj = new Dummydatabase(Name);
            System.out.println(Name);
            arr[point] = Name;
            count++;
            point++;
        }
        else
            {
                if (point==3)
                {
                    point = 0;
                }
                System.out.println(arr[point]);
                count++;
                point++;
            }
            return obj;

    }
}
