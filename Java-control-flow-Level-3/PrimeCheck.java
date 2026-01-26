import java.util.Scanner;
class PrimeCheck{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = sc.nextInt();
        int Count = 0;	
	    for(int i=1;i<=n;i++){
			if(n%i==0){
				Count++;
			}
		} if (Count==2)
		System.out.println("Number is Prime");
		else 
			System.out.println("Number is Not Prime");
		
	}
}