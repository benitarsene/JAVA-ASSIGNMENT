package com.mycompany.benit;
import java.util.Scanner;

public class GRADES{
    public static void main(String[] args) {
        Scanner benit = new Scanner(System.in);
        System.out.print("Enter a grade (A, B, C, D, F): ");
        char grade = benit.next().charAt(0);

        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Good job!");
                break;
            case 'C':
                System.out.println("Well done!");
                break;
            case 'D':
                System.out.println("Push Hard.");
                break;
            case 'F':
                System.out.println("Hahaha.");
                break;
            default:
                System.out.println("Invalid grade.");
        }
    }
}



