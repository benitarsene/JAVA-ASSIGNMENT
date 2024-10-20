package com.mycompany.benit;
public class ARRAYREVERSE{
    public static void main(String[] args) {
        int[] numbers = {3, 4, 6, 1, 9, 7, 5, 8};
        int length = numbers.length;
        int[] reversedArray = new int[length];

        for (int i = 0; i < length; i++) {
            reversedArray[i] = numbers[length - 1 - i];
        }

        System.out.print("Reversed array: ");
        for (int num : reversedArray) {
            System.out.print(num + " ");
        }
    }
}
