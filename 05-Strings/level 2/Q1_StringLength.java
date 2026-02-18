package Level_2;

import java.util.Scanner;

public class Q1_StringLength {

    public static int getStringLength(String text) {
        int count = 0;
        while (true) {
            try {
                text.charAt(count);
                count++;
            } catch (IndexOutOfBoundsException e) {
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.next();

        int lengthByMethod = getStringLength(text);
        int lengthBuiltIn = text.length();

        System.out.println("Length using user-defined method: " + lengthByMethod);
        System.out.println("Length using built-in length(): " + lengthBuiltIn);

        scanner.close();
    }
}
