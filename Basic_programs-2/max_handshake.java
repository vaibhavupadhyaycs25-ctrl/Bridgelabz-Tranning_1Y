import java.util.Scanner;
class max_handshake{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of students is ");
		int n = input.nextInt();
		
		int hand_shake = (n*(n-1))/2 ;
		
System.out.println("Handshake is "+hand_shake);}
	   }
			