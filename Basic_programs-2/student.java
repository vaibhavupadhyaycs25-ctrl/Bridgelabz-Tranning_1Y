import java.util.Scanner;
class student{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of pen");
		int pen = input.nextInt();
		
		System.out.println("Enter number of students");
		int St = input.nextInt();
		
		int peSt=0;
		int NotDis=0;
		if(pen >=St && St !=0){
			   peSt=pen/St;
			  NotDis = pen%St ;
		
		System.out.println("Pen per student is "+peSt );
		System.out.println("remaining per not distributed is "+NotDis);}

		else{
System.out.println("Statement is Worrug");}
	   }}
			