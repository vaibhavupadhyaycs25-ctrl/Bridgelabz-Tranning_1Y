package Arrays;

import javax.script.AbstractScriptEngine;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class OutputInput {
    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      int [] arr = new int[10];
      for (int i=0;i<arr.length;i++){
          int x = sc.nextInt();
          arr[i] = x;
      }
      for (int i=0;i<arr.length;i++){
          System.out.print(arr[i] +" ");
      }
    }
}
