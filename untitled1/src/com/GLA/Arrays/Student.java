package com.GLA.Arrays;

public class Student {
    int age;
    int rollNo;
    String name;
    public void printInfo()
    {
        System.out.println("Name :-"+ name);
        System.out.println("Roll No :-"+ rollNo);
        System.out.println("Age:-"+ age);

    }

    public static void main(String[] args) {
        Student s1=new Student();
        int a=s1.age=12;
        int r=s1.rollNo=1;
        String name=s1.name="Ram";
        s1.printInfo();


        Student s2=new Student();
        int A=s2.age=22;
        int R=s2.rollNo=64;
        String NAME=s2.name="Vaibhav";
        s2.printInfo();

    }
}
