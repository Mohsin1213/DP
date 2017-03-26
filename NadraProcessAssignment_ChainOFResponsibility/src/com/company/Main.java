package com.company;

import java.lang.String;

import java.util.Scanner;
/**
 * Created by Mohsin on 2/6/2017.
 */
public class Main
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input Your Request:  ");
        String input = scan.next();
        Chain ch1 = new Token_Service();
        Chain ch2 = new Picture_Snape_Serviec();
        Chain ch3 = new Finger_Prints();
        Chain ch4 = new Data_Collection();
        Chain ch5 = new Recipt_Generator();

        if (input.equals("Make")) {
        ch1.setNextChain(ch2);
        ch2.setNextChain(ch3);
        ch3.setNextChain(ch4);
        ch4.setNextChain(ch5);

        Services req = new Services(input);
        ch1.service(req);
    }

       else if (input.equals("Collection"))
        {
            ch1.setNextChain(ch5);
            Services req = new Services(input);
            ch1.service(req);
        }


    }
}
