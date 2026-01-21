import java.util.Scanner;
class volume{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("x");
		int x = input.nextInt();
		
		System.out.println("y");
		int y=input.nextInt();
		
		System.out.println("z");
		int z=input.nextInt();
		
		int average=(x+y+z)/3;
		System.out.println("average of three no."+average);
		
   }
    }
