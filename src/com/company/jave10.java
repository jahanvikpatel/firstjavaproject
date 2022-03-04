package com.company;

import java.util.Scanner;

public class jave10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//[] array
        // int marks[] = {15, 20, 40, 60};
        //int[] marks = new int[10];
        //System.out.println("length =" + marks.length); //to find out length of array
        //filling array
        //System.out.println("Please input marks of 10 Subjects:");
        //for (int j = 0; j < 10; j++) {
            //marks[j] = 10; //sc.nextInt();

        //int s = 0;
       // for (int j = 0; j < 10; j++) {
           // s = s + marks[j];

        //System.out.println(s);

        int arr[][] = new int[][]{
                {5, 6, 7, 80},
                {10, 10, 11, 12},
                {50, 4, 6, 8}
        };
      for (int i=0; i<3; i++){
       for (int j=0; j<4; j++){
        System.out.print(arr[i][j]+"\t"); //+" " instead of t
    }
          System.out.println("\n"); //sout()


}
        int ar[][] = new int[][]{
                {5, 6, 7, 80},
                {10, 10, 11, 12},
                {50, 4, 6, 8}
        };
        for (int i=0; i<3; i++) {
            int s = 0;


            for (int j = 0; j < 4; j++) {
                s = s + ar[i][j];
            }
            System.out.println(s);
        }


        System.out.println("total");

        int a[][] = new int[][]{
                {5, 6, 7, 80},
                {10, 10, 11, 12},
                {50, 4, 6, 8}
        };
        for (int i=0; i<4; i++) {
            int s = 0;


            for (int j = 0; j <3; j++) {
                s = s + a[j][i];
            }
            System.out.println(s);
        }

        int b[][] = new int[][]{
                {5, 6, 7, 80},
                {10, 10, 11, 12},
                {50, 4, 6, 8}
        };
        for (int i=0; i<3; i++){
            for (int j=0; j<1; j++){
                System.out.print(b[i][j]);
            }
            System.out.println("\n");


        }

        java.lang.String h ="jahanvi";
        char[] chars = h.toCharArray();
        System.out.println(chars);

    }
}