package com.company;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("My 1st Java Project: Calculator");
        System.out.println(sum(2,5));
        System.out.println(sub(80,45));
        System.out.println(div(45,5));
        System.out.println(multi(45,65));
        int sum = sum(5, 6);
        System.out.println(sum(5,6));
        System.out.println("The sum "+sum+" is correct");


    }
public static int sum(int a, int b){
      return a+b;
}
public static int sub(int a, int b){
        return a-b;
}
public static int div(int a, int b){
        return a/b;
}
public static int multi(int a, int b){
        return a*b;
}
}
