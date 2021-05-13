package functionalInterfaces;

public class FunctionExample1 {

    public static String performConcat(String str) {

        return FunctionExample.addSomeString.apply(str);
    }

    public static void main(String[] args) {

        String result = performConcat("Functional Interfaces ");

        System.out.println("Result is : " + result);
    }
}
