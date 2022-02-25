package com.company;

public class Assignment1 {

    public static void main(String[] args) {
        System.out.println(printfullName("Jahanvi", "Patel"));
        printFullName("Innokenty","Sviridov");
        System.out.println(square(6));
        System.out.println(Addition(6, 7, 10));
        System.out.println(Rectangle(5,6));
        System.out.println(Circle(5));
        printTable(2);
        printTable(3);
    }
    public static void printTable(int n){System.out.println(n + "*1" + "=" + (n*1));
        System.out.println(n + "*2" + "=" + (n*2));
        System.out.println(n + "*3" + "=" + (n*3));
    }
    public static void printFullName(String firstName, String lastName){
        System.out.println(firstName+ " " + lastName);
    }
    public static String printfullName(String firstName, String lastName){
        return firstName + " " + lastName;
    }
    public static int square(int num) {
        System.out.println("Create method to return square  a given number");
        System.out.println("You have entered: " + num);
        num = num * num;
        System.out.println("Your number squared is: " + num);
        return num;

    }
    public static int Addition(int num1, int num2, int num3) {
        System.out.println("Create method to return sum of three numbers");
        System.out.println("You entered: " + num1 + " " + num2 + " " + num3);
        int total = num1 + num2 + num3;
        System.out.println("The addition of 3 numbers is: " + total);
        return total;

    }
    public static int Rectangle(int Lenght, int breath) {
        System.out.println("Create method to calculate and return the area of a rectangle given it's length and breadth");
        System.out.println("You have entered Lenght:" + " " + Lenght + " " + "You have entered Breath:" + " " + breath);
        int Area = Lenght * breath;
        System.out.println("The area of the rectangle is:"+ " " + Area);
        return Area;
    }
    public static int Circle(int Radius) {
        System.out.println("Create method to return area of a circle given it's radius");
        System.out.println("You have entered the value of radius:"+ " " + Radius);
        int Area = (int) (Math.PI * Radius * Radius);
        System.out.println("The area of a circle is:"+ " " + Area);
        return Area;
    }
}







