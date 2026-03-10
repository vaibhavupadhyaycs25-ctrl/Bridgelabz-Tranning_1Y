import java.util.*;

public class PalindromeCheck {

    public static int[] storeDigits(int n){

        int size = String.valueOf(n).length();
        int[] digits = new int[size];

        for(int i=size-1;i>=0;i--){
            digits[i]=n%10;
            n/=10;
        }

        return digits;
    }

    public static int[] reverse(int[] arr){

        int[] rev=new int[arr.length];

        for(int i=0;i<arr.length;i++)
            rev[i]=arr[arr.length-1-i];

        return rev;
    }

    public static boolean compare(int[] a,int[] b){

        if(a.length!=b.length)
            return false;

        for(int i=0;i<a.length;i++)
            if(a[i]!=b[i])
                return false;

        return true;
    }

    public static boolean isPalindrome(int[] digits){

        int[] rev=reverse(digits);

        return compare(digits,rev);
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number: ");
        int num=sc.nextInt();

        int[] digits=storeDigits(num);

        System.out.println("Palindrome = "+isPalindrome(digits));
    }
}