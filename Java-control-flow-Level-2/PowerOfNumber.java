import java.util.Scanner;

class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        System.out.print("Enter the power: ");
        int power = sc.nextInt();
        if (number > 0 && power > 0) {
            int result = 1;

            for (int i = 1; i <= power; i++) {
                result = result * number;
            }

            System.out.println(number + " raised to the power " + power + " = " + result);
        } else {
            System.out.println("Please enter positive integers only.");
        }

        sc.close();
    }
}
