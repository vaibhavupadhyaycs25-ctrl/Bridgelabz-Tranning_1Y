import java.util.Scanner;

public class Friends {

    public static int youngest(int[] age) {
        int min = age[0];

        for (int i : age)
            if (i < min)
                min = i;

        return min;
    }

    public static double tallest(double[] height) {
        double max = height[0];

        for (double i : height)
            if (i > max)
                max = i;

        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] age = new int[3];
        double[] height = new double[3];

        String[] names = {"Amar", "Akbar", "Anthony"};

        for (int i = 0; i < 3; i++) {

            System.out.print("Enter age of " + names[i] + ": ");
            age[i] = sc.nextInt();

            System.out.print("Enter height of " + names[i] + ": ");
            height[i] = sc.nextDouble();
        }

        System.out.println("Youngest age = " + youngest(age));
        System.out.println("Tallest height = " + tallest(height));
    }
}