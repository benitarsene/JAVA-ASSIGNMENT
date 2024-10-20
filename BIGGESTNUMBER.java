package com.mycompany.benit;
import java.util.Scanner;

public class BIGGESTNUMBER{
    public static void main(String[] args) {
        Scanner benit = new Scanner(System.in);
        
        System.out.print("Enter the first number (A): ");
        int A = benit.nextInt();
        
        System.out.print("Enter the second number (B): ");
        int B = benit.nextInt();
        
        System.out.print("Enter the third number (C): ");
        int C = benit.nextInt();

        if (A > B && A > C) {
            System.out.println(A + " is the largest number.");
        } else if (B > A && B > C) {
            System.out.println(B + " is the largest number.");
        } else if (C > A && C > B) {
            System.out.println(C + " is the largest number.");
        } else {
            System.out.println("Some numbers are equal.");
        }
    }
}
