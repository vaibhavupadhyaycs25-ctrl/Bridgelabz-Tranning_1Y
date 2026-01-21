import java.util.Scanner;
public class Eligibleforvote{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		double age = sc.nextDouble();
		if(age>=18){
			System.out.println("valid");
		}
		else{
			System.out.println("not valid");
		}
	}
}