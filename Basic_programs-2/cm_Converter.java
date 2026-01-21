import java.util.Scanner;
   class cm_Converter {
	     public static void main(String args[]){
		 Scanner input = new Scanner(System.in);
		 System.out.println("Enter Heigth in cm is :");
		 double h = input.nextDouble();
		 double  inch = h/2.54;
		 double foot = inch/12 ;
		 
		 System.out.println("Inch is "+inch);
		 System.out.println("foot is  "+foot);
   }}
	           