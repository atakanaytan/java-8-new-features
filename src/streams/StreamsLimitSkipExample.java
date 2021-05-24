package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExample {

    public static Optional<Integer> limit(List<Integer> integerList) {
        return integerList.stream()
                .limit(2)
                .reduce((x, y) -> x + y);
    }

    public static Optional<Integer> skip(List<Integer> integerList) {
        return integerList.stream()
                .skip(2)
                .reduce((x, y) -> x + y);
    }

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> limitResult = limit(integers); // will pass only first two elements
        Optional<Integer> skipResult = skip(integers); // will skip first to elements

        if (limitResult.isPresent()) {
            System.out.println("The limit result is : " + limitResult.get()); // result is 3
        } else {
            System.out.println("No input is passed");
        }
        if (skipResult.isPresent()) {
            System.out.println("The skip result is : " + skipResult.get()); // result is 12
        } else {
            System.out.println("No input is passed");
        }
    }
}
