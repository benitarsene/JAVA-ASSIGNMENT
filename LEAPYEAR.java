package com.mycompany.benit;
import java.util.Scanner;

public class LEAPYEAR{
    public static void main(String[] args) {
        Scanner benit = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = benit.nextInt();

        if (year % 4 == 0){
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
