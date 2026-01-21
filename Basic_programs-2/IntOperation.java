import java.util.Scanner;
   class IntOperation{
	     public static void main(String args[]){
		 Scanner input = new Scanner(System.in);
		 System.out.println("Enter a is  :");
		 int a = input.nextInt();
		 
		 		 
		 System.out.println("Enter b is  :");
		 int b = input.nextInt();
		 
		 System.out.println("Enter c is  :");
		 int c = input.nextInt();
		 
		 int v =a+b*c;
		 int x =a*b+c;
		 int y =c+a/b;
		 int z =a%b+c;
		 System.out.println("opertion 1 is  "+v);
		 System.out.println("opertion 2 is  "+x);
		 System.out.println("opertion 3 is  "+y);
		 System.out.println("opertion 4 is  "+z);
		 
   }}