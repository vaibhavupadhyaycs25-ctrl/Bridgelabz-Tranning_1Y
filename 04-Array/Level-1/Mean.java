import java.util.Scanner;

class MeanOfStudents {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
int marks[] =new int[11];
int sum=0;
for(int i=0;i<=11;i++){
marks[i]= sc.nextInt();
sum+=marks[i];
}
double mean= sum/11.0;
System.out.println("Averege:- " +mean);

          }
}
