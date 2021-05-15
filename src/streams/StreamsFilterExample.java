package streams;

import data.Student;
import data.StudentDatabase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterExample {

    public static List<Student> filterStudents() {
        return StudentDatabase.getAllStudents().stream()
                .filter((student -> student.getGender().equals("male")
                )).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println("Male students : ");
        filterStudents().forEach(System.out::println);
    }
}
