public class EmployeeBonus {

    public static void main(String[] args){

        double[][] data=new double[10][2];

        for(int i=0;i<10;i++){

            data[i][0]=(int)(Math.random()*90000)+10000;
            data[i][1]=(int)(Math.random()*10)+1;
        }

        double totalBonus=0;

        for(int i=0;i<10;i++){

            double salary=data[i][0];
            double years=data[i][1];

            double bonus=(years>5)?salary*0.05:salary*0.02;

            totalBonus+=bonus;

            System.out.println("Salary="+salary+" Years="+years+" Bonus="+bonus);
        }

        System.out.println("Total Bonus="+totalBonus);
    }
}