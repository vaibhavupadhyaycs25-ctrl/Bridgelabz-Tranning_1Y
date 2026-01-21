import java.util.Scanner;
   class Cm_converter_A_Tringle {
	     public static void main(String args[]){
		 Scanner input = new Scanner(System.in);
		 System.out.println("Enter base in cm ");
		 float b = input.nextFloat();
		 System.out.println("Enter Height in cm");
		 float h = input.nextFloat();
		 
		 float t = 1*b*h/2;
		 double inch = t/(2.54) ;
		 double foot = inch/12 ;
		 
		 System.out.println("Inch is "+inch);
		 System.out.println("foot is  "+foot);
   }}
	           