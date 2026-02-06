package com.gla.arrays.Level2;

import java.util.Scanner;

class DigitFrequency {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = input.nextInt();

        int[] freq = new int[10];

        while (number != 0) {

            int digit = number % 10;
            freq[digit]++;
            number /= 10;
        }

        for (int i = 0; i < 10; i++) {

            System.out.println("Digit " + i + " = " + freq[i]);
        }
    }
}

