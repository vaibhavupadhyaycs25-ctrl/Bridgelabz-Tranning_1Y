import java.util.Scanner;

class DoubleOpt {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first double value: ");
        double a = sc.nextDouble();

        System.out.print("Enter second double value: ");
        double b = sc.nextDouble();

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulo: " + (a % b));

        sc.close();
    }
}