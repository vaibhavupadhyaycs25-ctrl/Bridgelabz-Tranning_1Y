import java.util.Scanner;

class GreatestFactorWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int greatestFactor = 1;
        int i = number - 1;

        while (i >= 1) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
            i--;
        }

        System.out.println("Greatest factor (besides itself): " + greatestFactor);
        sc.close();
    }
}
