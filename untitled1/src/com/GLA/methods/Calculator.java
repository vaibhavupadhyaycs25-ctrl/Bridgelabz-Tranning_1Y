package com.GLA.methods;
import java.util.Scanner;
public class Calculator {
    static int add(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        return a+b;
    }
    public static int Sub(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        return a-b;
    }
    public static int Mul(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        return a*b;
    }
    public static double Div(){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b= sc.nextDouble();
        return a/b;
    }


    public static void main(String[] args) {
        System.out.println("Additon:- " +add());
        System.out.println("Subtraction:- " +Sub());
        System.out.println("MUltipication:- " +Mul());
        System.out.println("Divition:- "+Div());



    }
}
