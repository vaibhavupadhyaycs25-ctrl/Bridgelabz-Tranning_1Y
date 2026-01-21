import java.util.Scanner;
class Sum{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter math=");
		int math = input.nextInt();
		
		System.out.println("Enter physics=");
		int physics  = input.nextInt();
		
		System.out.println("Enter chemistry=");
		int chemistry= input.nextInt();
		
		int avg=(math+physics+chemistry)/3 ;
		
		
		System.out.println("avg is "+avg);
		
   }
    }