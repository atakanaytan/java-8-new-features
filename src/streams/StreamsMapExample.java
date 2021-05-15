package streams;

import data.Student;
import data.StudentDatabase;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsMapExample {

    public static List<String> nameList_imperative() {
        List<String> list = new ArrayList<>();

        for (Student std : StudentDatabase.getAllStudents()) {
            list.add(std.getName());
        }

        return list;
    }

    public static List<String> nameList_declarative() {

        List<String> list = StudentDatabase.getAllStudents().stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        return list;
    }

    public static Set<String> nameSet_declarative() {

        Set<String> set = StudentDatabase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.toSet());

        return set;
    }

    public static void main(String[] args) {
        System.out.println("imperative  : " + nameList_imperative());
        System.out.println("declarative : " + nameList_declarative());
        System.out.println("nameSet_declarative : " + nameSet_declarative());

    }
}
