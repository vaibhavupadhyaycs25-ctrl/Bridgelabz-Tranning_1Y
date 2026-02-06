import java.util.Scanner;
class Array_sum{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
 System.out.println("Enter number");
int[] table= new int[10];
for(int i=1;i<=10;i++){
int num= sc.nextInt();
table[i -1]=num*i;
}
for(i=0;i<=10;i++){
System.out.println(num+ "*" +i+ "=" +table[1-i]);
}
}
}