package Day01;

import java.util.Scanner;

public class FindMean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       double height  [ ] = new double[11];
       int sum =0;
       for(int i=0;i<10;i++){
           height[i]= sc.nextDouble();
           sum +=height[i];
       }
       double mean = sum/height.length;
        System.out.println(" vhfttgvfhnj"+mean);
    }
}
