import java.util.Scanner;
class volume{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("length");
		int length = input.nextInt();
		
		System.out.println("wridth");
		int wridth=input.nextInt();
		
		int p=2*(length+wridth);
		System.out.println("perimeter of rectangal is"+p);
}}


