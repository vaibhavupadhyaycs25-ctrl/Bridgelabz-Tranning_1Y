package Level_1;

import java.util.Scanner;

public class Q10_LowercaseComparison {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String text = scanner.nextLine();

        String userLower = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }
            userLower += ch;
        }

        String builtInLower = text.toLowerCase();

        System.out.println("Lowercase using user-defined method: " + userLower);
        System.out.println("Lowercase using toLowerCase(): " + builtInLower);
        System.out.println("Are both equal? " + userLower.equals(builtInLower));

        scanner.close();
    }
}
