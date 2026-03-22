package StaticMethods;

    import java.time.LocalDate;

    interface DateUtil {
        static String formatDate(LocalDate date) {
            return date.getDayOfMonth() + "-" + date.getMonthValue() + "-" + date.getYear();
        }
    }

    public class DataFormet {
        public static void main(String[] args) {
            System.out.println(DateUtil.formatDate(LocalDate.now()));
        }
    }

