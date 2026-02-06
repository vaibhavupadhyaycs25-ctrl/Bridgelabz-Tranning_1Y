import java.util.*;
class VotingEligiblity{
public static void main(String[] args){
Scanner sc = new Scanner(System.in); 
int[] age  = new int[10];
System.out.println("Enter a 10 Student age");
for(int i=0;i<age.length;i++){
age[i] = sc.nextInt();
}
for(int i=0;i<age.length;i++){
if(age[i]<0){
System.out.println("Invalid age");
}
else if(age[i]>=18){
System.out.println(+age[i] +"Eligible For Vote");
}
else{
System.out.println(+age[i] +"Not Eligible For Vote");
}
}
}
}