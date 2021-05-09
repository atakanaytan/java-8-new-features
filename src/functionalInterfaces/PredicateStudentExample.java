package functionalInterfaces;

import data.Student;
import data.StudentDatabase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

    static List<Student> students = StudentDatabase.getAllStudents();

    static Predicate<Student> isGradeGreaterOrEqual3 = (student) -> student.getGradeLevel() >= 3;

    static Predicate<Student> isGpaGreaterOrEqual3_4 = (student) -> student.getGpa() >= 3.4;

    public static void filterStudentsByGradeLevel() {

        students.forEach((student) -> {
            if (isGradeGreaterOrEqual3.test(student))
                System.out.println("filterStudentsByGradeLevel : " + student);
        });
    }

    public static void filterStudentByGpa() {

        students.forEach((student -> {
            if (isGpaGreaterOrEqual3_4.test(student)) {
                System.out.println("filterStudentByGpa : " + student);
            }
        }));
    }

    public static void filterCombineGradeAndGpaStudent() {

        students.forEach((student -> {
            if (isGradeGreaterOrEqual3.and(isGpaGreaterOrEqual3_4).negate().test(student)) {
                System.out.println("filterCombineGradeAndGpaStudent negated : " + student);
            } else {
                System.out.println("filterCombineGradeAndGpaStudent matched : " + student);
            }
        }));
    }

    public static void main(String[] args) {

        filterStudentsByGradeLevel();

        filterStudentByGpa();

        filterCombineGradeAndGpaStudent();
    }

}
