import java.util.*;

public class FactorOperations {

    static int[] findFactors(int n){

        int count=0;

        for(int i=1;i<=n;i++)
            if(n%i==0)
                count++;

        int[] factors=new int[count];

        int index=0;

        for(int i=1;i<=n;i++)
            if(n%i==0)
                factors[index++]=i;

        return factors;
    }

    static int greatestFactor(int[] f){

        return f[f.length-1];
    }

    static int sumFactors(int[] f){

        int sum=0;

        for(int i:f)
            sum+=i;

        return sum;
    }

    static int productFactors(int[] f){

        int p=1;

        for(int i:f)
            p*=i;

        return p;
    }

    static double cubeProduct(int[] f){

        double p=1;

        for(int i:f)
            p*=Math.pow(i,3);

        return p;
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number: ");
        int n=sc.nextInt();

        int[] factors=findFactors(n);

        System.out.println("Greatest Factor = "+greatestFactor(factors));
        System.out.println("Sum = "+sumFactors(factors));
        System.out.println("Product = "+productFactors(factors));
        System.out.println("Cube Product = "+cubeProduct(factors));
    }
}