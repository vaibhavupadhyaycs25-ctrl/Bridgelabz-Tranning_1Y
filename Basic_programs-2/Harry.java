import java.util.Scanner;
class Harry{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter birth year=");
		int birth_year= input.nextInt();
		int current_year=2026;
		int age = current_year - birth_year ;
		
		System.out.println("Age is "+age);
		
   }
    }