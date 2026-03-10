package com.GLA.Strings;
public class NullPointerExample {

    public static void generateException() {
        String text = null;
        System.out.println(text.length());
    }

    public static void handleException() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Exception handled: " + e);
        }
    }

    public static void main(String[] args) {

        System.out.println("Calling method to generate exception:");
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Exception caught in main: " + e);
        }

        System.out.println("\nCalling method to handle exception:");
        handleException();
    }
}
