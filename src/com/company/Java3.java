package com.company;


import java.util.Scanner;

public class Java3 {
    public static void main(String[] args) {
        // camelCase naming variable
        // There are only two special character allow $ or _ before the variable name
        //operator +,-,*,/,%
        //for alignment of a line alt crtl L
        int a = 10;
        int b = 3;
        //will give us question value
        System.out.println(a/b);
        //will give us reminder value
        System.out.println(a%b);
        //float
        //by default the decimal will be double
        float c =10f;
        float d = 3f;
        System.out.println(c/d);
        //Assignment operators =, +=, -=, *=, /=, %=
        //Assigning always happen to the variable ont the left side
        //increment ++, --, value is always added/subtracted by 1
        int i = 0;
        //pre increment, value of ++ is 1
        System.out.println(++i);
        System.out.println(i);
        //post increment
        System.out.println(i++ +8);
        int j = 6;
        System.out.println(--j);
        System.out.println(j);
        System.out.println(j-- -6);
        //Relational Operators ==,!=,>,<.>=,<=
        //Always the result of a relational statement is a boolean value
        int h = 2;
        int e = 4;
        System.out.println(h<e);
        System.out.println(h<=e);
        System.out.println(h>e);
        System.out.println(h!=e);//not equal to
        System.out.println(h>=e);
        //Logical Operator &&, ||(or), !
        //boolean logical boolean
        System.out.println("new logical operator");
        int x = -1;
        if(x>1 && x<100) {
            System.out.println("Congrats");}
        else {
            System.out.println("Sorry");}

        if(x>1 || x<100) {
            System.out.println("Congrats");}
        else {
            System.out.println("Sorry");}

        if(x>1 || x<100 || x==101) {
            System.out.println("Congrats");}
        else {
            System.out.println("Sorry");}
        //3,5,7,8,10,12


        //Scanner sc(variable name) = new Scanner(System.in); ; is to get input into the data
        //int month = sc.nextInt();

        System.out.println("Please enter the month from 1-12");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        printDaysInMonth(month);


        }

    public static void printDaysInMonth (int month){
        if (month == 1 || month == 3 || month == 5 || month == 7|| month == 8|| month == 10 || month == 12)
    {
        System.out.println("31 days");
    }
        if ( month == 4 || month == 6 || month == 9|| month == 11 )
        {
            System.out.println("30 days");
        }
        if (month == 2) {
            System.out.println("28 days");
        }

    }
}
