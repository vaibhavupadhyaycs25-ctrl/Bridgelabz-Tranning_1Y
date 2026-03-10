package com.GLA.Strings;

import java.util.Scanner;

public class StringCampare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        boolean same = true;
        if (s1.length()!= s2.length()){
            same = false;
        }
        else {
            for (int i=0;i<s1.length();i++){
                if (s1.charAt(i)!= s1.charAt(i)){
                    same = false;
                    break;
                }
            }
        }
        System.out.println(same);
    }

}
