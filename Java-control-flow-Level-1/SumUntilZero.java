import java.util.Scanner;

class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int num;

        System.out.println("Enter numbers (0 to stop):");

        while (true) {
            num = sc.nextInt();
            if (num == 0) {
                break;
            }
            sum += num;
        }

        System.out.println("Sum = " + sum);
        sc.close();
    }
}
