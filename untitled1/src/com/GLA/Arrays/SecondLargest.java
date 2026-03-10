package com.GLA.Arrays;
import  java.util.Scanner;
public class SecondLargest {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n= sc.nextInt();
int arr[]= new int[n];
int sum=0;
for(int i=0;i<=n;i++){
    sum+=arr[i];
}
        System.out.println(sum);

    }
}
