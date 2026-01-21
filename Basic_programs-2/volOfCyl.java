
import java.util.Scanner;
class volume{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("enter radius of circle");
		int r = input.nextInt();
		
		System.out.println("enter height of cylinder");
		int h=input.nextInt();
		
		double A=3.15*r*r*h;
		System.out.println("area of circle is"+A);
}}








