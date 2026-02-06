package com.gla.arrays.Level2;

import java.util.Scanner;

class FriendsData {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] age = new int[3];
        double[] height = new double[3];

        for (int i = 0; i < 3; i++) {

            System.out.print("Enter age: ");
            age[i] = input.nextInt();

            System.out.print("Enter height: ");
            height[i] = input.nextDouble();
        }

        int minAge = age[0];
        double maxHeight = height[0];

        for (int i = 1; i < 3; i++) {

            if (age[i] < minAge) {
                minAge = age[i];
            }

            if (height[i] > maxHeight) {
                maxHeight = height[i];
            }
        }

        System.out.println("Youngest Age = " + minAge);
        System.out.println("Tallest Height = " + maxHeight);
    }
}
