import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();
    
    public void addStudent(String studentID, String name) {
        for (Student s : students) {
            if (s.getStudentID().equals(studentID)) {
                System.out.println("This ID already exists...");
                return;
            }
        }
        students.add(new Student(studentID, name));
    }

    public Student findStudent(String studentID){
        for (Student s : students) {
            if (s.getStudentID().equals(studentID)) {
                return s;
            }
        }
        return null;
    }

    public void displayStudent(String studentID) {
        Student student = findStudent(studentID);
        if (student != null) {
            System.out.println("Student ID: " + studentID);
            System.out.println("Student Name: " + student.getName());
            System.out.println("Student Grades: " + student.getGrades());
            System.out.println("Student Avg Grades: " + student.calculateAverage());
        }
        else{
            System.out.println("Student cant be found.");
        }
    }

    public void addGradeToStudent(String studentID, int grade) {
        Student student = findStudent(studentID);
        if (student != null) {
            student.addGrades(grade);
            System.out.println("Grade added for " + student.getName());
            return;
        }
        System.out.println("Student cant be found.");
    }
    

    
}



