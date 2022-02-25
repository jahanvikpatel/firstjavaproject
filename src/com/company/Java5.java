package com.company;

import java.util.Scanner;

public class Java5 {

    public static void main(String[] args) {
//for (begin condition; end condition ; update){output}

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }


            for (int j =100; j>= 1; j--) {
                System.out.println(j);
            }
        }
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }

        int sum = 0;
        for (int i = 1; i <= 10; i++){
            sum = sum + i;
        }
        System.out.println(sum);

        int product = 1;
        for (int i = 1; i <= 10; i++){
            product = product *  i;
        }
        System.out.println(product);

        int even = 1;
        for (int i = 1; i <= 10; i++){
            if (i%2 == 0)
            even = even + i;
        }
        System.out.println(even);

        int odd = 1;
        for (int i = 1; i <= 10; i++){
            if (i%2 != 0)
                odd = odd + i;
        }
        System.out.println(odd);

        //nested for loop
        for (int i = 1; i <= 5; i++){
            for (int j = 1; j<6; j++){
                System.out.println("*");
            }
        }

        System.out.print("125\t000000");
        System.out.println("\tWithout line break");

        System.out.print("125\t000000");
        System.out.print("\n"); //line break
        System.out.print("line break");
        // \t  will gave tab place
        System.out.print("\n");

        for (int i = 1; i <= 5; i++){
            for (int j = 1; j<=10 ; j++){
                System.out.print(i+"\t"); //no line break
            }
            System.out.print("\n");
        }

        for (int i = 1; i <= 5; i++){
            for (int j = 1; j<=10 ; j++){
                System.out.print(j+"\t"); //no line break
            }
            System.out.print("\n");
        }

        for (int i = 1; i <= 5; i++){
            for (int j = 1; j<=i; j++){
                System.out.print(i); //no line break
            }
            System.out.print("\n");
        }

        int K=1;
        while(K<=10){
            System.out.println(K);
            K++;
        }

        int l=11;
        do {
            System.out.println(K);
            K++;
        }
        while(l<=10);

        System.out.println("please put the number of the month you want the days for");
        int month = sc.nextInt();

        switch(month){
            case 1 :
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31");
                break;

            case 4 :
            case 6:
            case 9:
            case 11:
                System.out.println("30");
                break;

            case 2 :
                System.out.println("28");
                break;

            default:
                System.out.println("wrong input");
                break;
        }
        System.out.println("done");


       //Factorial
        System.out.println("Please enter the number:");
        int input = sc.nextInt();
        int factorial = 1;
        for(int i=1;i<=input;i++)
        {
            factorial = factorial * i;
        }
        System.out.println("Factorial of the given number is :" +factorial);
    }

        }








    // n factorial n! = n*n1
    //fibonacci series 0112358
    //ln is for line change








