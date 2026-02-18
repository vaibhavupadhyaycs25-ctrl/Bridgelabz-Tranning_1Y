package Level_1;
import java.util.Scanner;

public class Q3_CharacterArrayComparison {

    public static char[] getCharacters(String text) {
        char[] result = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            result[i] = text.charAt(i);
        }

        return result;
    }

    public static boolean compareArrays(char[] arr1, char[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String text = scanner.next();

        char[] userDefinedArray = getCharacters(text);

        char[] builtInArray = text.toCharArray();

        boolean isEqual = compareArrays(userDefinedArray, builtInArray);

        System.out.println("\nCharacters using user-defined method:");
        for (char c : userDefinedArray) {
            System.out.print(c + " ");
        }

        System.out.println("\nCharacters using toCharArray() method:");
        for (char c : builtInArray) {
            System.out.print(c + " ");
        }

        System.out.println("\n\nAre both character arrays equal? " + isEqual);

        scanner.close();
    }
}
