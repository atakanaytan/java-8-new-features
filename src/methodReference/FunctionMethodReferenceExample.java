package methodReference;

import java.util.function.Function;

public class FunctionMethodReferenceExample {

    static Function<String, String> toUpperCaseLambda = (s) -> s.toUpperCase();

    static Function<String, String> toUpperCaseMethodReference = String::toUpperCase;

    public static void main(String[] args) {

        String example = "example";

        System.out.println(toUpperCaseLambda.apply(example));

        System.out.println(toUpperCaseMethodReference.apply(example));
    }

}
