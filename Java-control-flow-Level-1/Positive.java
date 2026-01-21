import java.util.Scanner;
public class Positive{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		double n= sc.nextDouble();
		if(n>0){
			System.out.println("positive ");
		}
		else if (n<0){
			System.out.println("Negative");
		} else if (n==0){
			System.out.println("Zero");
		}
	}
}