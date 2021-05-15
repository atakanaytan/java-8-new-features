package streams;

import data.Student;
import data.StudentDatabase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {

    static Predicate<Student> isGradeGreaterOrEqual3_4 = (student -> student.getGradeLevel() >= 3.4);
    static Predicate<Student> isGpaGreaterOrEqual3_9 = (student -> student.getGpa() >= 3.9);

    public static void main(String[] args) {

        Map<String, List<String>> studentMap = StudentDatabase.getAllStudents().stream()
                .filter(isGradeGreaterOrEqual3_4)
                .peek((student -> {
                    System.out.println("Students from the first filter : " + student);
                }))
                .filter(isGpaGreaterOrEqual3_9)
                .collect(Collectors.toMap(Student::getName, Student::getActivities));

        System.out.println(studentMap);
    }

}
