import java.util.*;
class MultipicationTable{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
int[] table= new int[10];
System.out.println("Enter a Number");
int num= sc.nextInt();
int i;
for( i=1;i<=10;i++){
table[i -1]= num*i;
}
for(i=1;i<10;i++){
System.out.println(num + " * " + i + " = " + table[i - 1]);
}
}
}