package com.mycompany.benit;
import java.util.Scanner;

   public class BENIT{
    public static void main(String[] args) {
        Scanner benit = new Scanner(System.in);  
        System.out.print("Enter a number: ");
        int num = benit.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is an odd number.");
        }
    }
}
