package FunctionalInterface;

import java.util.function.Predicate;

public class TemperatureAlert {
    public static void main(String[] args) {
        Predicate<Double> isHighTemp = t -> t > 37.5;

        System.out.println(isHighTemp.test(36.5));
        System.out.println(isHighTemp.test(38.2));
    }
}