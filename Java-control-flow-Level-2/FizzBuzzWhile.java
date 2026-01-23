import java.util.Scanner;
class Vaibhav{
	
public static void main(String...args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
if(n>0){
	for(int i=1;i<=n;i++){
		if(i%3!=0||i%5!=0){
			System.out.println(+i);
		}
		if(i%3==0){
			System.out.println("Buzz");
		}
		if(i%5==0){
			System.out.println("Buzz");
		}
		if(i%5==0&&i%3==0){
			System.out.println("FizzBuzz");
		}
	}
}
	
}
}