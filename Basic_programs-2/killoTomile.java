import java.util.Scanner;
class killo{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("enter killometer");
		int kil = input.nextInt();
		
		double Milies=kil*(0.621371);
		System.out.println("Milies"+Milies);
}}

