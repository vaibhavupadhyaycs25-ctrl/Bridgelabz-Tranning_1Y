package Level_2;


import java.util.Scanner;

public class Q7_TrimString {

    public static int[] findTrimIndexes(String text) {
        int start = 0, end = text.length() - 1;

        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    public static String substringUsingCharAt(String text, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string with leading and trailing spaces: ");
        String text = scanner.nextLine();

        int[] indexes = findTrimIndexes(text);
        String trimmedByMethod = substringUsingCharAt(text, indexes[0], indexes[1]);
        String trimmedByBuiltIn = text.trim();

        boolean isEqual = compareStrings(trimmedByMethod, trimmedByBuiltIn);

        System.out.println("\nTrimmed using charAt(): '" + trimmedByMethod + "'");
        System.out.println("Trimmed using built-in trim(): '" + trimmedByBuiltIn + "'");
        System.out.println("Are both trimmed strings equal? " + isEqual);

        scanner.close();
    }
}
