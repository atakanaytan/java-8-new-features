package methodReference;

import data.Student;
import data.StudentDatabase;

import java.util.function.Predicate;

public class RefactorMethodReferenceExample {

    public static boolean greaterThanGradeLevel(Student s) {
        return s.getGradeLevel() >= 3;
    }

    static Predicate<Student> p1 = RefactorMethodReferenceExample::greaterThanGradeLevel;

    public static void main(String[] args) {

        System.out.println(p1.test(StudentDatabase.studentSupplier.get()));
    }

}
