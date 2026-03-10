import java.util.Scanner;

public class NumberCheck {

    public static boolean isPositive(int n) {
        return n >= 0;
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static int compare(int a, int b) {

        if (a > b)
            return 1;
        else if (a == b)
            return 0;
        else
            return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number: ");
            arr[i] = sc.nextInt();
        }

        for (int i : arr) {

            if (isPositive(i)) {

                if (isEven(i))
                    System.out.println(i + " is Even");
                else
                    System.out.println(i + " is Odd");
            } else
                System.out.println(i + " is Negative");
        }

        int result = compare(arr[0], arr[4]);

        if (result == 1)
            System.out.println("First element is greater");
        else if (result == 0)
            System.out.println("Both are equal");
        else
            System.out.println("Last element is greater");
    }
}