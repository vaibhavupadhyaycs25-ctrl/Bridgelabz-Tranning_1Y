import java.util.Scanner;

class FactorialWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            long fact = 1;
            int i = 1;

            while (i <= n) {
                fact *= i;
                i++;
            }

            System.out.println("Factorial = " + fact);
        }
        sc.close();
    }
}
