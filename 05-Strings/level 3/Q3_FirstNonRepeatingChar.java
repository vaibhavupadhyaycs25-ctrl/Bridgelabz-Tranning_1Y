package Level_3;

import java.util.Scanner;

public class Q3_FirstNonRepeatingChar {

    public static char findFirstNonRepeating(String text) {
        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (freq[ch] == 1) {
                return ch;
            }
        }

        return '\0'; // Return null character if no non-repeating character found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        char firstNonRepeat = findFirstNonRepeating(text);

        if (firstNonRepeat != '\0') {
            System.out.println("First non-repeating character: " + firstNonRepeat);
        } else {
            System.out.println("No non-repeating character found.");
        }

        scanner.close();
    }
}
