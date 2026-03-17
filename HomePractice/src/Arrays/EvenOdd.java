package Day01;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n[]= new int[5];
        System.out.println("Enter a number:-");
        for (int i=0;i<n.length;i++){
            n[i]= sc.nextInt();
        }
        for (int i=0;i<n.length;i++){
            if(n[i]<0){
                System.out.println("Invalid Number" +n[i]);
            } else if (n[i]%2==0) {
                System.out.println("Even" +n[i]);

            }
            else {
                System.out.println("Odd" +n[i]);
            }
        }
    }
}
