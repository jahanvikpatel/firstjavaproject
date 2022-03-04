package com.company;

import javax.sound.midi.Soundbank;
import java.text.NumberFormat;
import java.util.Scanner;

public class SelfStudy {
    public static void main(String[] args){
        System.out.println("hi");
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        Scanner sc = new Scanner(System.in);
        System.out.print("Principle: ");
        int principle = sc.nextInt();
        System.out.print("Annual Interest Rate: ");
        float rate = sc.nextFloat();
        double r = (rate / MONTHS_IN_YEAR) / PERCENT;
        double r2 = (1 + r);
        System.out.print("Period (years): ");
        Byte years = sc.nextByte();
        double y = years * 12;
        double raise = Math.pow(r2,y);
        double s = raise - 1;
        double m =  (r*raise)/s;
        double mortgage = principle * m ;
        String result = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage:" + result);
        System.out.println("Apply Now");
    }

}
