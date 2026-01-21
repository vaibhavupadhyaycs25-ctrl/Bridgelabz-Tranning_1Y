import java.util.Scanner;
public class Natural{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		double n= sc.nextDouble();
		if(n*(n+1)/2!=0){
			System.out.println("Natural Number");
		}
		else{
			System.out.println("not natural number");
		}
	}
}