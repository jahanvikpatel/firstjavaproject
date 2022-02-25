package com.company;

import java.util.Scanner;

public class Assignment3 {

    public static void main(String[] args) {
        //take input of month number from user accordingly print if that month has 30/31/28 days
        System.out.println("Please enter the month from 1-12");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        printDaysInMonth(month);

        // take number input from user , if that number is between 1-100 print message congrats
        System.out.println("Please enter the number from 1-100");
        int num = sc.nextInt();
        congratsPrint(num);

        //take three numbers from user, check if all of them are equal  print the numbers are equal
        System.out.println("Enter first number");
        int a1 = sc.nextInt();
        System.out.println("Enter second number");
        int b1 = sc.nextInt();
        System.out.println("Enter third number");
        int c1 = sc.nextInt();
        equalCheck(a1, b1, c1);

         // take students marks in 5 subjects as input from scanner .find the percentage of marks. If percent is > 80 print grade A
        // if between 70-80 print grade B , and if percent is between 60-70 print grade C , if less than 60 , print grade D..note the in the range eg 60-70 ,
        // 60 is included but 70 is not included
        System.out.println("Enter Marks in first subject");
        int s1 = sc.nextInt();
        System.out.println("Enter Marks in second subject");
        int s2 = sc.nextInt();
        System.out.println("Enter Marks in third subject");
        int s3 = sc.nextInt();
        System.out.println("Enter Marks in fourth subject");
        int s4 = sc.nextInt();
        System.out.println("Enter Marks in fifth subject");
        int s5 = sc.nextInt();
        gradeCalculator(s1, s2, s3, s4, s5);
    }

    public static void printDaysInMonth(int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("31 days");
        }
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("30 days");
        }
        if (month == 2) {
            System.out.println("28 days");
        }
    }

    public static void congratsPrint(int num) {
        if (num > 1 && num < 100) {
            System.out.println("Congratulation");
        } else {
            System.out.println("Sorry Try Again");


        }
    }

    public static void equalCheck(int a1, int b1, int c1) {
        if ((a1 == b1) && (b1 == c1)) {
            System.out.println("All the three numbers are equal");

        } else {
            System.out.println("Not Equal");
        }
    }

    public static void gradeCalculator(int s1, int s2, int s3, int s4, int s5) {
        int marksScored = s1 + s2 + s3 + s4 + s5;
        int totalMarks = 500;
        float p = ((marksScored * 100) / totalMarks);
        System.out.println("You scored" + " " + p + "%");
        if (p >= 80) {
            System.out.println("Grade A");
        } else if ((p >= 70) && (p < 80)) {
            System.out.println("Grade B");
        } else if ((p >= 60) && (p < 70)) {
            System.out.println("Grade C");
        } else if (p < 60) {
            System.out.println("Grade D");
        } else {
            System.out.println("Something wrong");
        }
    }


}






