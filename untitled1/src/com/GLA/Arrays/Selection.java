package com.GLA.Arrays;

public class Selection {
    public static void main(String[] args) {
        int arr[] = {1,3,4,5,7,8};
        for (int i=0;i< arr.length-1;i++){
            int minTndex =i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[j]>arr[minTndex]){
                    minTndex =j;
                }
                int temp = arr[i];
                arr[i]= arr[minTndex];
                arr[minTndex]= temp;
            }
        }
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }
}
