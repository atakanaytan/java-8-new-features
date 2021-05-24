package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinMaxExample {

    public static int findMaxValue(List<Integer> integerList) {

        return integerList.stream()
                .reduce(0, (x, y) -> x > y ? x : y);
    }

    public static Optional<Integer> findMaxValueOptional(List<Integer> integerList) {

        return integerList.stream()
                .reduce((x, y) -> x > y ? x : y);
    }

    public static Optional<Integer> findMinValueOptional(List<Integer> integerList) {

        return integerList.stream()
                .reduce((x, y) -> x < y ? x : y);
    }

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        List<Integer> emptyList = new ArrayList<>();

        int maxVal = findMaxValue(list);
        System.out.println("Max value : " + maxVal);

        Optional<Integer> maxValueOptional = findMaxValueOptional(emptyList);
        if (maxValueOptional.isPresent()) {
            System.out.println("Max value using optional : " + maxValueOptional.get());
        } else {
            System.out.println("Input list is empty");
        }

        Optional<Integer> minValueOptional = findMinValueOptional(list);

        if (minValueOptional.isPresent()) {
            System.out.println("Min value using optional : " + minValueOptional.get());
        } else {
            System.out.println("No input is passed");
        }
    }
}
