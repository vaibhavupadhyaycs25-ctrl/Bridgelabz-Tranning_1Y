import java.util.Scanner;
public class Divisibleby5{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		double n= sc.nextDouble();
		if(n%5==0){
			System.out.println("Divisible by 5");
		}
		else{
			System.out.println("not divisible by 5");
		}
	}
}