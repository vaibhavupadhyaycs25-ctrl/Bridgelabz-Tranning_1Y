package com.GLA.Arrays;

import java.util.Scanner;

public class Calculator {
    public int sub(int num1, int num2) {
        return num1 - num2;

    }

    public int add(int num1, int num2) {
        return num1 + num2;

    }

    public int mul(int num1, int num2) {
        return num1 * num2;

    }

    public int div(int num1, int num2) {
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner  sc  = new Scanner(System.in);
        System.out.println("Enter tha first number ");
        int a = sc. nextInt();
        System.out.println("Enter a second number ");
        int b =  sc. nextInt();
        Calculator c1 = new Calculator();
        int addition= c1.add(a,b);
        System.out.println("Addition" +addition);
        int subtraction= c1.sub(a,b);
        System.out.println("Subtraction" +subtraction );
        int multipication = c1.mul(a,b);
        System.out.println("Multipication" +multipication);
        int division = c1.div(a,b);
        System.out.println("Division" +subtraction);
    }
    }

