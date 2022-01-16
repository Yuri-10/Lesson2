/**
 * Java1. HomeWork 2
 *
 * @author Yuri
 * @version 16.01.2022
 */
package com.company;

public class Lesson2HomeWork {

    public static void main(String[] args) {
        System.out.println(sumTwoNumbers(7,5));
        PositiveOrNegative(-1);
        System.out.println(isNegative(5));
        wordNumber("text", 5);
        System.out.println(leapYear(2004));

    }
    public static boolean sumTwoNumbers(int a, int b) {
        int sum = a+b;
        if(sum >=10 && sum<=20){
            return true;
        }else {
            return false;
        }
    }

    public static void PositiveOrNegative(int a){
        if(a>=0){
            System.out.println("Positive");
        }else {
            System.out.println("Negative");
        }
    }
    
    public static boolean isNegative(int a){
        if (a>=0){
            return true;
        }
        return false;
    }

    public static void wordNumber(String str, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("[" + i + "]" + " " + str);
        }
    }

    public static boolean leapYear(int year){
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }
        else {
            return false;
        }
    }

}
