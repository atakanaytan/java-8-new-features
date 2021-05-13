package functionalInterfaces;

import data.Student;
import data.StudentDatabase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {

    static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> biFunction = ((students, studentBiPredicate) -> {

        Map<String, Double> studentGradeMap = new HashMap<>();
        students.forEach(student -> {
            if (studentBiPredicate.test(student)) {
                studentGradeMap.put(student.getName(), student.getGpa());
            }
        });
        return studentGradeMap;
    });

    public static void main(String[] args) {

        System.out.println(biFunction.apply(StudentDatabase.getAllStudents(), PredicateStudentExample.isGpaGreaterOrEqual3_4));
    }
}
