public class OTPGenerator {

    static int generateOTP(){

        return (int)(Math.random()*900000)+100000;
    }

    public static void main(String[] args){

        int[] otp=new int[10];

        for(int i=0;i<10;i++){

            otp[i]=generateOTP();
            System.out.println(otp[i]);
        }

        boolean unique=true;

        for(int i=0;i<10;i++)
            for(int j=i+1;j<10;j++)
                if(otp[i]==otp[j])
                    unique=false;

        System.out.println("All OTP unique = "+unique);
    }
}