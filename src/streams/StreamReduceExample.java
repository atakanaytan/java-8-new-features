package streams;

import data.Student;
import data.StudentDatabase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {

    public static Optional<Integer> streamMultiplication(List<Integer> integerList) {
        return integerList.stream()
                .reduce((a, b) -> a * b);
    }

    public static Optional<Student> getHighestGpaStudent() {
        return StudentDatabase.getAllStudents().stream()
                .reduce((s1, s2) -> (s1.getGpa() > s2.getGpa()) ? s1 : s2);
    }

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 3, 5, 7, 9);

        System.out.println("Multiplication : " + streamMultiplication(list));

        Optional<Integer> result = streamMultiplication(list);

        result.ifPresent(System.out::println);

        Optional<Student> student = getHighestGpaStudent();

        if (student.isPresent()) {
            System.out.println("The student with highest gpa: " + student);
        }

    }
}
