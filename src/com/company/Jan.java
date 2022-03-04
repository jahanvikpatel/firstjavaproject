package com.company;

public class Jan {

    public static void main(String[] args) {

        String name = "Jahanvi";
        char[] chars = name.toCharArray();
        char[] revArr = new char[name.length()];
        int length = chars.length;
        int lastIndex = length - 1;
        for (int i = 0; i <= lastIndex; i++) {
            revArr[lastIndex - i] = chars[i];
        }
        System.out.println(revArr);
        System.out.println(name.equals(revArr));

        System.out.println(name.substring(5, 7)); //7 index will not be inclusive
        System.out.println(name.charAt(0));
//        char c = name.charAt(0);

        System.out.println(name.replace("a", "$"));
        System.out.println(name.replaceFirst("J", "%"));


int i=12345;
String s1 = String.valueOf(i);
        System.out.println(s1.substring(1,4));


    }
}