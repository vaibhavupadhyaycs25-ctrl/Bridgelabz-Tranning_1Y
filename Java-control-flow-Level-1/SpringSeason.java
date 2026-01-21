//March 20 to June 20
import java.util.Scanner;
public class SpringSeason{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a date");
		int day= sc.nextInt();
		System.out.println("Enter a month");
		int month= sc.nextInt();
		if(month >=3 && month<=6){
			System.out.println("Spring Season ");
		}
		else{
			System.out.println("Not a Spring Season");
		}
	}
}
