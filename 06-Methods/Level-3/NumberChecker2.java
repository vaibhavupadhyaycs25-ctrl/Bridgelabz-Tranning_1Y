import java.util.*;

public class NumberChecker2 {

    public static int[] storeDigits(int n){

        int size = String.valueOf(n).length();
        int[] digits = new int[size];

        for(int i=size-1;i>=0;i--){
            digits[i]=n%10;
            n/=10;
        }
        return digits;
    }

    public static int sumDigits(int[] digits){

        int sum=0;
        for(int d:digits)
            sum+=d;

        return sum;
    }

    public static int sumSquareDigits(int[] digits){

        int sum=0;

        for(int d:digits)
            sum+=Math.pow(d,2);

        return sum;
    }

    public static boolean isHarshad(int n,int[] digits){

        int sum=sumDigits(digits);

        return n%sum==0;
    }

    public static void frequency(int[] digits){

        int[][] freq=new int[10][2];

        for(int i=0;i<10;i++)
            freq[i][0]=i;

        for(int d:digits)
            freq[d][1]++;

        System.out.println("Digit Frequency");

        for(int i=0;i<10;i++)
            if(freq[i][1]!=0)
                System.out.println(freq[i][0]+" -> "+freq[i][1]);
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number: ");
        int num=sc.nextInt();

        int[] digits=storeDigits(num);

        System.out.println("Sum of digits = "+sumDigits(digits));
        System.out.println("Sum of squares = "+sumSquareDigits(digits));
        System.out.println("Harshad Number = "+isHarshad(num,digits));

        frequency(digits);
    }
}