package com.GLA.methods;
import java.util.Scanner;
public class Circle {
    public void CircleOfArea() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Radius:- ");
        double radius = sc.nextDouble();
        double circum = 2 * Math.PI * radius * radius;
        System.out.println("Circum Of Circle:-  " +circum);
        double area = Math.PI * radius * radius;
        System.out.println("Area Of Circle:- "+area);
    }

}