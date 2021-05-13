package methodReference;

import data.Student;
import data.StudentDatabase;

import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {

    /**
     * classname::methodname
     */
    static Consumer<Student> consumer = System.out::println;

    static Consumer<Student> consumer2 = Student::printListOfActivities;

    public static void main(String[] args) {

        StudentDatabase.getAllStudents().forEach(consumer);

        StudentDatabase.getAllStudents().forEach(consumer2);
    }
}
