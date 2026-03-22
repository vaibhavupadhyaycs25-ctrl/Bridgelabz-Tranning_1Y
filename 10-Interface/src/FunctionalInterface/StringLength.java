package FunctionalInterface;
import java.util.function.Function;

public class StringLength {
    public static void main(String[] args) {
        Function<String, Integer> length = s -> s.length();

        System.out.println(length.apply("Hello"));
        System.out.println(length.apply("Encapsulation"));
    }
}
