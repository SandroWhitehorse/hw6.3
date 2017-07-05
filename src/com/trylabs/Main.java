package com.trylabs;

public class Main {

    private static void IsNumberPositive(int i)
    {if (i>0) System.out.println("Number "+i+" is positive");
    else if (i<0) System.out.println("Number "+i+" is negative");
    else System.out.println("Number is 0");
    }

    private static void IsNumberSimple(int number) {
        int k = 0;
        if (number == 1) System.out.println("Number " + number + " is simple");
           for (int j = 2; j <= number; j++) {
                if (number % j == 0) {
                    k++;
                }
            }
            if (k == 1) System.out.println("Number " + number + " is simple");
            else System.out.println("Number " + number + " isn't simple");
    }

    private static void Divisibility(int divided)
    {
        if (divided%2==0) System.out.println("Number "+divided+" shares by 2");
        if (divided%5==0) System.out.println("Number "+divided+" shares by 5");
        if (divided%3==0) System.out.println("Number "+divided+" shares by 3");
        if (divided%6==0) System.out.println("Number "+divided+" shares by 6");
        if (divided%9==0) System.out.println("Number "+divided+" shares by 9");
    }

    public static void main(String[] args) {
        IsNumberPositive(34);
        IsNumberSimple(56);
        Divisibility(99);
    }
}
