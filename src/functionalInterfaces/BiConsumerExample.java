package functionalInterfaces;

import data.Student;
import data.StudentDatabase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void nameAndActivities() {

        BiConsumer<String, List<String>> biConsumer = (name, activities) ->
                System.out.println(name + " : " + activities);

        List<Student> studentList = StudentDatabase.getAllStudents();

        studentList.forEach((student -> biConsumer.accept(student.getName(), student.getActivities())));
    }

    public static void main(String[] args) {

        BiConsumer<String, String> biConsumer = (a, b) -> {
            System.out.println("a: " + a + " , b: " + b);
        };

        biConsumer.accept("java", "go");

        BiConsumer<Double, Double> multiply = (a, b) -> {
            System.out.println("Multiplication is: " + a * b);
        };

        BiConsumer<Double, Double> division = (a, b) -> {
            System.out.println("Division is: " + a / b);
        };

        multiply.andThen(division).accept(500.0, 12.0);

        nameAndActivities();
    }
}
