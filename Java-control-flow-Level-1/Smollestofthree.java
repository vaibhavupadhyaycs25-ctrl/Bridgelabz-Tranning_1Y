import java.util.Scanner;
public class Largestofthree{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first number");
		double a = sc.nextDouble();
		System.out.println("Enter a second number");
		double b = sc.nextDouble();
		System.out.println("Enter a third number");
		double c = sc.nextDouble();
		if(a<b&&a<c){
			System.out.println(+a);
		}	else if (b<c&&b<a){
			System.out.println(+b);
		}		else if (a>c&&c<a){
System.out.println(+c);
		}
	}
}