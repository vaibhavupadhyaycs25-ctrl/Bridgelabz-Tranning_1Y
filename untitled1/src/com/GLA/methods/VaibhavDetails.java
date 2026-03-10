package com.GLA.methods;

import java.util.Scanner;

public class VaibhavDetails {
        int  age;
        int rollNo;
        String name;
        public void printInfo()
        {
            Scanner sc = new Scanner(System.in);
            System.out.println(" Enter a age :- ");
            int age = sc.nextInt();
            System.out.println("Enter a roll no :- ");
            int rollNo = sc.nextInt();
            System.out.println("Enter a Name:- ");
            String name = sc.next();
            System.out.println("Enter a MObile Numbera;- ");
            String Mobile = sc.next();
            System.out.println("Name :-"+ name);
            System.out.println("Roll No :-"+ rollNo);
            System.out.println("Age:-"+ age);
            System.out.println("Mobile number:- " +Mobile);

        }


    }

