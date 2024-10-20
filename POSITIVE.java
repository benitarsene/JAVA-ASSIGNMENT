package com.mycompany.benit;
import java.util.Scanner;

public class POSITIVE{
    public static void main(String[] args) {
        Scanner benit = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = benit.nextDouble();
        
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}
