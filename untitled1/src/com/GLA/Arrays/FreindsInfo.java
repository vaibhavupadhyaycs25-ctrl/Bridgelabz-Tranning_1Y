package com.GLA.Arrays;
import java.util.Scanner;
public class FreindsInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] names = {"Amar","Akbar","Anthony"};
        int age [] = new int[3];
        int height[] = new int[3];
        for (int i=0;i<3;i++){
            System.out.println(names[i]);
            System.out.println("enter a number");
            age [i]= sc.nextInt();
            System.out.println("Enter a Height");
            height[i] = sc.nextInt();
        }
        int youngest =0;
        int tollest = 0;

        for (int i=1;i<3;i++){
            if(age[i]<age[youngest]){
                youngest =i;
            }
            if (height[i]>age[tollest]){
                tollest = i;

            }
        }
        System.out.println(names[youngest] +age[youngest]);
        System.out.println(names[tollest] +height[tollest]);
    }
}