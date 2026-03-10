import java.util.*;

public class StudentMarks {

    static int[][] generateMarks(int n){

        int[][] marks=new int[n][3];

        for(int i=0;i<n;i++)
            for(int j=0;j<3;j++)
                marks[i][j]=(int)(Math.random()*90)+10;

        return marks;
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n=sc.nextInt();

        int[][] marks=generateMarks(n);

        for(int i=0;i<n;i++){

            int total=marks[i][0]+marks[i][1]+marks[i][2];

            double avg=total/3.0;

            double per=total/3.0;

            System.out.println("Total="+total+" Avg="+avg+" %="+per);
        }
    }
}