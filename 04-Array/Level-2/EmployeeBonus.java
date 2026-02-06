package com.gla.arrays.Level2;

import java.util.Scanner;

class EmployeeBonus {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] salary = new double[10];
        double[] service = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0;
        double totalOld = 0;
        double totalNew = 0;

        for (int i = 0; i < 10; i++) {

            System.out.print("Enter salary of employee " + (i + 1) + ": ");
            salary[i] = input.nextDouble();

            System.out.print("Enter years of service: ");
            service[i] = input.nextDouble();

            if (salary[i] <= 0 || service[i] < 0) {
                System.out.println("Invalid input. Enter again.");
                i--;
            }
        }

        for (int i = 0; i < 10; i++) {

            if (service[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOld += salary[i];
            totalNew += newSalary[i];
        }

        System.out.println("Total Bonus = " + totalBonus);
        System.out.println("Total Old Salary = " + totalOld);
        System.out.println("Total New Salary = " + totalNew);
    }
}

