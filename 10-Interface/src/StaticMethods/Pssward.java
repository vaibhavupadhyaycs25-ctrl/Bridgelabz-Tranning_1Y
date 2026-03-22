package StaticMethods;


    interface SecurityUtils {
        static boolean isStrongPassword(String pass) {
            return pass.length() >= 8;
        }
    }

    public class Pssward {
        public static void main(String[] args) {
            System.out.println(SecurityUtils.isStrongPassword("abc123"));
            System.out.println(SecurityUtils.isStrongPassword("Strong@123"));
        }
    }

