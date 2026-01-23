import java.util.Scanner;
class GreatestFactor{
public static void main(String...args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	long fact = 1;
	for(int i=n-1;i>=1;i--){
		if (n%i==0){
		fact=i;
		break;
		}
}
System.out.println(+fact);
}
}