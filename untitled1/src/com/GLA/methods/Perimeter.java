package com.GLA.methods;

import java.util.Scanner;

public class Perimeter {
    public void Perimeter(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a length:- ");
        double l= sc.nextDouble();
        System.out.println("Enter a breath:- ");
        double b= sc.nextDouble();
        double Pre =  2*(l+b);
        System.out.println("Perimeter of rectangle:-  " +Pre);
        double area = l*b;
        System.out.println("Area Of Rectangle:- " +area);
    }


}
