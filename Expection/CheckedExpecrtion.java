package Expection;
import java.io.FileReader;
import java.io.IOException;
public class CheckedExpecrtion {
    public static void main(String[] args) {
        FileReader fr = null;

        try {
            fr = new FileReader("data.txt");
            int ch;

            // Read character by character
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }

        } catch (IOException e) {
            System.out.println("File not found");
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing file");
            }
        }
    }
}