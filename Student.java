import java.util.*;

public class Student {
    String name;
    int marks;
    int rollNo;

    public Student(String name, int marks, int rollNo) throws InvalidMarksException {
        if (marks < 0) {
            throw new InvalidMarksException("Invalid marks. Please enter a valid mark.");
        } else {
            this.name = name;
            this.marks = marks;
            this.rollNo = rollNo;
        }
        this.name = name;
        this.marks = marks;
        this.rollNo = rollNo;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Roll No: " + rollNo);
    }

    public static void enrolledInJavaAndPython() {

    }

    public static void enrolledInJAva() {

    }

    public static void enrolledInEitherJavaOrPython() {

    }

    public static void enrolledInNone() {

    }

    public static void main(String[] args) throws InvalidMarksException {
        enrolledInJavaAndPython();
        enrolledInJAva();
        enrolledInEitherJavaOrPython();
    }

}

class StudentDetails {
    public static void main(String[] args) throws InvalidMarksException {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 85, 101));
        students.add(new Student("Alice", 90, 102));
        students.add(new Student("Bob", 78, 103));
        try {
            students.add(new Student("Charlie", -5, 104));
        } catch (InvalidMarksException e) {
            System.out.println(e.getMessage());
        }
        // for (Student student : students) {
        // student.displayDetails();
        // System.out.println();
        // }
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            student.displayDetails();
            System.out.println();
        }
    }
}

// Write a program to create a user defined exception invalid marks if total
// marks <0
class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) {
        super(message);
    }
}