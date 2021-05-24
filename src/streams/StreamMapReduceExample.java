package streams;

import data.Student;
import data.StudentDatabase;

public class StreamMapReduceExample {

    private static int numberOfNotebooks() {

        int numberOfNoteBooks = StudentDatabase.getAllStudents().stream()
                .filter((student -> student.getGpa() >= 3.5))
                .map(Student::getNoteBooks)
                .reduce(0, Integer::sum);

        return numberOfNoteBooks;
    }

    public static void main(String[] args) {
        System.out.println("NumberOfNoteBooks : " + numberOfNotebooks());
    }
}
