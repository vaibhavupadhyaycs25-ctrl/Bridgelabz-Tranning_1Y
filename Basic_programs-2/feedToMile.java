import java.util.Scanner;
   class feedToMile{
	     public static void main(String args[]){
		 Scanner input = new Scanner(System.in);
		 System.out.println("Enter length in feed is :");
		 double f = input.nextDouble();
		 double  y = f/3;
		 double m = y/1760 ;
		 
		 System.out.println("length in yaad is "+y);
		 System.out.println("while length in mile is "+m);
   }}