import java.util.Scanner;
class Array_positive{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number");
int[] num= new int[5];
for(int i=0;i< num.length;i++){
num[i] = sc.nextInt();
}
for(int i=0;i<num.length;i++){
if(num[i]>0){
System.out.println(+num[i] +"  Positive");
}
else if(num[i]<0){
System.out.println(+num[i] +"  Negative");
}
else if(num[i]==0){
System.out.println(+num[i] +"  Zero");
}
}
}
}