package com.company;

import java.util.Scanner;
public class Java6Assignment {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Q1)  Number guess game for those who have not done
        System.out.println("I have thought of a number(1-100)");
        int computerNumber = (int) ((Math.random()) * 100);
        System.out.println("Guess my Number :");

        while (true) {
            int input = sc.nextInt();
            if (input == computerNumber) {
                System.out.println("You guessed it right");
                break;
            }
            System.out.println("Sorry try again");
            if (input > computerNumber) {
                System.out.println("Hint: the actual number is less than the number you typed ");
            } else {
                System.out.println("Hint: the actual number is greater than the number you typed");
            }
        }

        //Q2) make a calculator where take input of two numbers as well as operation to be done by user , using switch block.
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Enter operator: ");
        char op = sc.next().charAt(0);
        int f = 0;
        switch (op) {
            case '+':
                f = a + b;
                System.out.println(a + " + " + b + " = " + f);
                break;

            case '-':
                f = a - b;
                System.out.println(a + " - " + b + " = " + f);
                break;

            case '*':
                f = a * b;
                System.out.println(a + " * " + b + " = " + f);
                break;

            case '/':
                f = a / b;
                System.out.println(a + " / " + b + " = " + f);
                break;

            default:
                System.out.println("INVALID OPERATOR");
        }

        //Q3: practice star pattern , number pattern using double for loop.

           for (int i = 1; i <= 5; i++) {
               for (int j = 1; j < 6; j++) {
                   System.out.println("j");
               }
           }
            for (int i = 1; i <= 5; i++){
                for (int j = 1; j<=10 ; j++){
                    System.out.print(i+"\t");
                }
                System.out.print("\n");
            }

            for (int i = 1; i <= 5; i++){
                for (int j = 1; j<=10 ; j++){
                    System.out.print(j+"\t");
                }
                System.out.print("\n");
            }

            for (int i = 1; i <= 5; i++){
                for (int j = 1; j<=i; j++){
                    System.out.print(i);
                }
                System.out.print("\n");
            }

//Simple brain-teaser: swap 2 numbers without using 3rd variable
        System.out.println("Please write in your 1st number for swap");
        int c = sc.nextInt();
        System.out.println("Please write  in your 2nd number for swap");
        int d = sc.nextInt();
        System.out.println("After swapping:"
                + " 1st = " + d + ", 2nd = " + c + " ");
        }
    }






