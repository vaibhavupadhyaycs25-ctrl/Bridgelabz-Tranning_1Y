package com.GLA.Arrays;
//import java.util.Scanner;
public class Shorting {
    public static void main(String[] args) {
        int arr[] ={7,6,5,4,3,2,1};
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j< arr.length-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1]= arr[j];
                    arr[j]= temp;
                }
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }
}