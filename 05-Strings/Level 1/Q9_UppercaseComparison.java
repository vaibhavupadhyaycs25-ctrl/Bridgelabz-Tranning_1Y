package Level_1;

import java.util.Scanner;

public class Q9_UppercaseComparison {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String text = scanner.nextLine();

        String userUpper = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }
            userUpper += ch;
        }

        String builtInUpper = text.toUpperCase();

        System.out.println("Uppercase using user-defined method: " + userUpper);
        System.out.println("Uppercase using toUpperCase(): " + builtInUpper);
        System.out.println("Are both equal? " + userUpper.equals(builtInUpper));

        scanner.close();
    }
}
