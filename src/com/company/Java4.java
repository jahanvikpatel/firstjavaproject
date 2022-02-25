package com.company;

import java.util.Scanner;

public class Java4 {
    //if (condition){if the condition becomes true} else {if the condition is false}
    //{} scopes  - defines the scope
    //if() {} - else if () {} - else {}
    public static void main(String[] args) {
        Scanner j4 = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a = j4.nextInt();
        System.out.println("Enter 2nd number");
        int b = j4.nextInt();
        System.out.println("Enter 3rd number");
        int c = j4.nextInt();
        greaterNumber(a,b,c);

        System.out.println("Please write your name");
        String name = j4.next();
        nameCondition(name);

        System.out.println("Please enter a number");
        int x = j4.nextInt();
        positiveNegative(x);

        System.out.println("Please enter a number");
        int y = j4.nextInt();
        oddEven(y);


    }
    public static void positiveNegative(int x){
        if (x > 0) {
            System.out.println("positive");
        } else if (x < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }
    public static void greaterNumber(int a, int b, int c){
        if (a>b && a>c) {
            System.out.println("A is greater");
        }
        else if (b>a && b>c){
            System.out.println("B is greater");
        }
        else {System.out.println("C is greater");}
    }

    public static void nameCondition(String name ){
        if (name.startsWith("ri")) {
            if (name.length()>6){
            System.out.println(name.toUpperCase());
        }
        else {System.out.println(name.toLowerCase());
        }
    }

}
    public static void oddEven(int y){
        if (y%2==0){
            System.out.println("even");
        }
         else {
            System.out.println("odd");
        }
}
}

