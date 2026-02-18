package Level_3;
import java.util.Scanner;
public class Q4_CharFrequencyCharAt {

    public static String[][] charFrequency(String text) {
        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        String[][] result = new String[text.length()][2];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch != '\0' && freq[ch] != 0) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(freq[ch]);
                index++;
                freq[ch] = 0; // Mark character as counted
            }
        }

        // Resize result array to remove empty rows
        String[][] finalResult = new String[index][2];
        for (int i = 0; i < index; i++) {
            finalResult[i][0] = result[i][0];
            finalResult[i][1] = result[i][1];
        }

        return finalResult;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        String[][] frequencies = charFrequency(text);

        System.out.println("Character frequencies:");
        System.out.printf("%-10s%-10s\n", "Character", "Frequency");
        for (String[] row : frequencies) {
            System.out.printf("%-10s%-10s\n", row[0], row[1]);
        }

        scanner.close();
    }
}

