package com.GLA.Strings;
import java.util.Scanner;

public class Substringcompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();


        String sub1 = "";
        for (int i = start; i < end; i++) {
            sub1 += text.charAt(i);
        }


        String sub2 = text.substring(start, end);

        // 3️⃣ Compare both substrings
        boolean result = sub1.equals(sub2);


        System.out.println("Substring using charAt(): " + sub1);
        System.out.println("Substring using substring(): " + sub2);
        System.out.println("Are both substrings equal? " + result);

        sc.close();
    }
}
