import java.util.*;

public class CalendarProgram {

    static boolean isLeap(int y){

        return (y%4==0 && y%100!=0) || y%400==0;
    }

    static int daysInMonth(int m,int y){

        int[] days={31,28,31,30,31,30,31,31,30,31,30,31};

        if(m==2 && isLeap(y))
            return 29;

        return days[m-1];
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter month: ");
        int m=sc.nextInt();

        System.out.print("Enter year: ");
        int y=sc.nextInt();

        Calendar cal=Calendar.getInstance();
        cal.set(y,m-1,1);

        int firstDay=cal.get(Calendar.DAY_OF_WEEK)-1;

        int days=daysInMonth(m,y);

        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        for(int i=0;i<firstDay;i++)
            System.out.print("    ");

        for(int d=1;d<=days;d++){

            System.out.printf("%4d",d);

            if((d+firstDay)%7==0)
                System.out.println();
        }
    }
}