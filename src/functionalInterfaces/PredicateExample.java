package functionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {

    static Predicate<Integer> isIntegerEven = (i) -> {
        return i % 2 == 0;
    };

    static Predicate<Integer> isIntegerEven1 = (i) -> i % 2 == 0;

    static Predicate<Integer> isDivisibleBy5 = (i) -> i % 5 == 0;

    public static void predicateAnd() {

        System.out.println("Predicate And result is : " + isIntegerEven.and(isDivisibleBy5).test(10));
        System.out.println("Predicate And result is : " + isIntegerEven.and(isDivisibleBy5).test(11));
    }

    public static void predicateOr() {

        System.out.println("Predicate Or result is : " + isIntegerEven.or(isDivisibleBy5).test(10));
        System.out.println("Predicate Or result is : " + isIntegerEven.or(isDivisibleBy5).test(12));
    }

    public static void predicateNegate() {

        System.out.println("Predicate Negate result is : " + isIntegerEven.or(isDivisibleBy5).negate().test(12));
    }

    public static void main(String[] args) {

        System.out.println(isIntegerEven.test(4));

        System.out.println(isIntegerEven1.test(8));

        predicateAnd();

        predicateOr();

        predicateNegate();
    }
}
