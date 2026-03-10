import java.util.*;

public class NumberChecker {

    public static int countDigits(int n){
        int count = 0;
        while(n>0){
            count++;
            n/=10;
        }
        return count;
    }

    public static int[] storeDigits(int n){
        int size = countDigits(n);
        int[] digits = new int[size];

        for(int i=size-1;i>=0;i--){
            digits[i]=n%10;
            n/=10;
        }
        return digits;
    }

    public static boolean isDuck(int[] digits){
        for(int d:digits)
            if(d==0)
                return true;
        return false;
    }

    public static boolean isArmstrong(int n,int[] digits){
        int power = digits.length;
        int sum=0;

        for(int d:digits)
            sum+=Math.pow(d,power);

        return sum==n;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int[] digits = storeDigits(num);

        System.out.println("Digit Count = "+countDigits(num));

        System.out.println("Duck Number = "+isDuck(digits));
        System.out.println("Armstrong Number = "+isArmstrong(num,digits));
    }
}