import java.util.ArrayList;
import java.util.List;

public class SumGeneric {

    public static <T extends Number> double sum(List<T> numbers) {
        double total = 0.0;
        for (T number : numbers) {
            total += number.doubleValue();
        }
        return total;
    }

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(5);
        intList.add(10);
        intList.add(15);
        double intSum = sum(intList);

        List<Long> longList = new ArrayList<>();
        longList.add(100L);
        longList.add(200L);
        longList.add(300L);
        double longSum = sum(longList);

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(1.5);
        doubleList.add(2.5);
        doubleList.add(3.5);
        double doubleSum = sum(doubleList);

        System.out.println("Integer sum: " + intSum);
        System.out.println("Long sum: " + longSum);
        System.out.println("Double sum: " + doubleSum);
    }
}