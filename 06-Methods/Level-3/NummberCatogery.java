import java.util.*;

public class NumberCategory {

    static int factorial(int n){

        int f=1;
        for(int i=1;i<=n;i++)
            f*=i;

        return f;
    }

    static int sumFactors(int n){

        int sum=0;

        for(int i=1;i<n;i++)
            if(n%i==0)
                sum+=i;

        return sum;
    }

    static boolean isPerfect(int n){

        return sumFactors(n)==n;
    }

    static boolean isAbundant(int n){

        return sumFactors(n)>n;
    }

    static boolean isDeficient(int n){

        return sumFactors(n)<n;
    }

    static boolean isStrong(int n){

        int temp=n;
        int sum=0;

        while(n>0){

            int d=n%10;
            sum+=factorial(d);
            n/=10;
        }

        return sum==temp;
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number: ");
        int n=sc.nextInt();

        System.out.println("Perfect = "+isPerfect(n));
        System.out.println("Abundant = "+isAbundant(n));
        System.out.println("Deficient = "+isDeficient(n));
        System.out.println("Strong = "+isStrong(n));
    }
}'