import java.util.Scanner;
class Total_uniprice_quality{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter uniprice is ");
		int unipr = input.nextInt();
		
		System.out.println("Enter Quality is ");
		int Qua = input.nextInt();
		
		int Totalprice = unipr*Qua ;
		
System.out.println("TOTAL_PRICE is "+Totalprice);}
	   }
			