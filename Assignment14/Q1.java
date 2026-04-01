import java.util.Scanner;


public class Q1 {
    public  void primitiveToWapper(){
        Scanner sc = new Scanner(System.in);
        int num1= sc.nextInt();
        Integer num2=num1;
        System.out.println("Primitive:- "+num1);
        System.out.println("Wraper:- "+num2);

    }

    public static void main(String[] args) {
        Q1 q1=new Q1();
        q1.primitiveToWapper();
    }

}
