import java.util.Scanner;
  class student_fee{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter radius in kilometer=");
		double r = input.nextInt();
		
		double  volOfsp = (4.0/3)*3.14*r*r*r ;
		
		System.out.println("volOfsp in killmete^3 is"+volOfsp);
		double  volOfsp2 =volOfsp/1000000000;
		
	
		System.out.println("volOfsp in meter^3 is "+volOfsp2);}

	   }
	           
			
