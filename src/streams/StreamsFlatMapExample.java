package streams;

import data.Student;
import data.StudentDatabase;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class StreamsFlatMapExample {

    public static List<String> printStudentActivities() {

        List<String> studentActivities = StudentDatabase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(toList());

        return studentActivities;
    }

    public static long printStudentActivitiesCount() {

        long numberOfActivities = StudentDatabase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .count();

        return numberOfActivities;
    }

    public static void main(String[] args) {
        System.out.println("printStudentActivities : " + printStudentActivities());
        System.out.println("printStudentActivitiesCount : " + printStudentActivitiesCount());
    }
}
