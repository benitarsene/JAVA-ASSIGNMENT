package com.mycompany.benit;
public class ARRAY {
        public static void main(String[] args) {
        int[] numbers = {10, 12, 34, 23, 56, 78};
        int sum = 0;
        int index = 0;

        while (index < numbers.length) {
            sum = sum + numbers[index];
            index++;
        }

        double average = (double) sum / numbers.length;
        System.out.println("The average is: " + average);
    }

}
