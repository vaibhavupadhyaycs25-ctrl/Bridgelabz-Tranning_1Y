import java.util.Scanner;
class ciAr{

  public static void main(String args[]){
	  Scanner input = new Scanner(System.in);
	  System.out.println("Enter circle of radius");
	  int r=input.nextInt();
	 
	  
	  double A=3.14*r*r ;
	  System.out.println("Area of circle is  "+A);
  }}