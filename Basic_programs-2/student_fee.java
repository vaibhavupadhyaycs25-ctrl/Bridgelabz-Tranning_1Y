	import java.util.Scanner;
  class student_fee{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter course_fee=");
		int st_fee = input.nextInt();
		
		System.out.println("Enter discount");
		int discount = input.nextInt();
		
		int discount_amount = (discount*st_fee)/100 ;
		
		
	
		System.out.println("discount_amount is "+discount_amount);}

	   }
	           
			
