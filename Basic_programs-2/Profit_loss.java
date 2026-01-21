import java.util.Scanner;

class Profit_loss 
{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter sellprice is");
          int sp = input.nextInt();

        System.out.println("Enter costprice is");
          int cp = input.nextInt();
       
int pr = (sp - cp)*100/cp ;
            
     System.out.println("profit is "+pr);			
}}