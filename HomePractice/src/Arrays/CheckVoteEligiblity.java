package Day01;

import java.util.Scanner;

public class CheckVoteEligiblity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age[]= new int[10];
        System.out.println("Enter a Age" );
        for(int i=0;i< age.length;i++){
            age[i] = sc.nextInt();
        }
        for (int i=0;i<age.length;i++){
            if(age[i]<0){
                System.out.println("Innvalid Age" +age[i]);
            } else if (age[i]>18) {
                System.out.println("It Can Give the vote" +age[i]);
            }
            else{
                System.out.println("It CanNot Give the vote" +age[i]);
            }
        }
    }
}
