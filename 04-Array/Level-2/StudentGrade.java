package com.gla.arrays.Level2;

import java.util.Scanner;

class StudentGrade {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter students: ");
        int n = input.nextInt();

        double[] percent = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {

            double p, c, m;

            System.out.print("Physics: ");
            p = input.nextDouble();

            System.out.print("Chemistry: ");
            c = input.nextDouble();

            System.out.print("Maths: ");
            m = input.nextDouble();

            percent[i] = (p + c + m) / 3;

            if (percent[i] >= 80)
                grade[i] = 'A';
            else if (percent[i] >= 70)
                grade[i] = 'B';
            else if (percent[i] >= 60)
                grade[i] = 'C';
            else if (percent[i] >= 50)
                grade[i] = 'D';
            else if (percent[i] >= 40)
                grade[i] = 'E';
            else
                grade[i] = 'R';
        }

        for (int i = 0; i < n; i++) {

            System.out.println("Percentage = " + percent[i] + " Grade = " + grade[i]);
        }
    }
}

