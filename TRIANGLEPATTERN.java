package com.mycompany.benit;
public class TRIANGLEPATTERN {
    public static void main(String[] args) {
        int rows = 7;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
    
