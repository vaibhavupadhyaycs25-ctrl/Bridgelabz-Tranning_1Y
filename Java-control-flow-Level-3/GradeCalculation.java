import java.util.Scanner;
class GradeCalculation{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
	System.out.println("enter a percentege");
	double p = sc.nextDouble();
	if (p>=80){
		System.out.println("Grade 'A'");
	}
	else if (p>=70){
		System.out.println("Grade 'B'");
	}
	else if (p>=60){
		System.out.println("Grade 'C'");
	}
	else if (p>=50){
		System.out.println("Grade 'D'");
	}
    else if (p>=40){
		System.out.println("Grade 'P'");
	}
    else  if (p<40){
		System.out.println("Grade 'F'");
	}
	}
}
	