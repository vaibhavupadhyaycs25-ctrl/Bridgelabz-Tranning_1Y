import java.util.Scanner;
class Factor{
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] fact= new int[n];
		int count=0;
		int i;
		for(i=1;i<=n;i++){
			if(n%i==0){
				fact[count]=i;
				count++;
			}
		}
		System.out.println(+n);
		for(i=0;i<count;i++){
			System.out.print(fact[i] +" ");
		}
	}
}