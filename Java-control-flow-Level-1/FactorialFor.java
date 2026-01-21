import java.util.Scanner;

class FactorialFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            long fact = 1;

            for (int i = 1; i <= n; i++) {
                fact *= i;
            }

            System.out.println("Factorial = " + fact);
        }
        sc.close();
    }
}
