import java.util.*;
class EvenOdd{
	public static void main (String [] args ){
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int [] even = new int[n];
		int [] odd = new int[n];
		int e=0;
		int o=0;
		int i;
		for(i=1;i<=n;i++){
			if(i%2==0){
				even[e] = i;
				e++;
			}
			else{
				odd[o] = i;
				o++;
			}
		}
		System.out.println("Even Number:-");
		for(i=0;i<e;i++){
			System.out.print(even[i] +" ");
		}
		System.out.println("\nOdd Number:-");
		for(i=0;i<=o;i++){
			System.out.print(odd[i] +" ");
		}
	}
}