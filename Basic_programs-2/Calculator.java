import java.util.Scanner;
   class Calculator {
	     public static void main(String args[]){
		 Scanner input = new Scanner(System.in);
		 System.out.println("Enter num1 is :");
		 int num1 = input.nextInt();
		 System.out.println("Enter num2 is:");
		 int num2 = input.nextInt();
		 
		 int sum=num1+num2 ;
		 int sub=num1 -num2;
		 int mult= num1*num2;
		 System.out.println("Sum is "+sum);
		 System.out.println("Sub is "+sub);
		 System.out.println("Mult is "+mult);
		 
		 if(num2!=0){
			 
			 double div = num1/num2;
		 System.out.println("Div is"+div);
			 
   }}}