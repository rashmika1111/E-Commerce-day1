import java.util.ArrayList;
import java.util.List;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class StudentAverage {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Student_01", 80));
        students.add(new Student("Student_02", 90));
        students.add(new Student("Student_03", 65));
        students.add(new Student("Student_04", 75));
        students.add(new Student("Student_05", 35));

        int totalMarks = 0;
        for (Student student : students) {
            totalMarks += student.marks;
        }

        double average = totalMarks / (double) students.size();
        System.out.println("Average Marks: " + average);
    }

}
