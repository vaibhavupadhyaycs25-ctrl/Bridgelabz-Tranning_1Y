package com.gla.arrays.Level2;

import java.util.Scanner;

class StudentGrade2D {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter students: ");
        int n = input.nextInt();

        double[][] marks = new double[n][3];
        double[] percent = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {

            System.out.print("Physics: ");
            marks[i][0] = input.nextDouble();

            System.out.print("Chemistry: ");
            marks[i][1] = input.nextDouble();

            System.out.print("Maths: ");
            marks[i][2] = input.nextDouble();

            percent[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3;

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

