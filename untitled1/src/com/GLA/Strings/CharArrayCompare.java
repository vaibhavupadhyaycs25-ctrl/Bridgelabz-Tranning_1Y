package com.GLA.Strings;
import java.util.Scanner;

public class CharArrayCompare {

    public static char[] getCharacters(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        char[] userArray = getCharacters(text);
        char[] builtInArray = text.toCharArray();

        System.out.print("User-defined method: ");
        for (char c : userArray) {
            System.out.print(c + " ");
        }

        System.out.println();

        System.out.print("Built-in toCharArray(): ");
        for (char c : builtInArray) {
            System.out.print(c + " ");
        }

        boolean same = true;

        if (userArray.length != builtInArray.length) {
            same = false;
        } else {
            for (int i = 0; i < userArray.length; i++) {
                if (userArray[i] != builtInArray[i]) {
                    same = false;
                    break;
                }
            }
        }

        System.out.println("\nAre both results equal? " + same);
    }
}
