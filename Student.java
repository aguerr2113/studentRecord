import java.util.ArrayList;

public class Student {
    // store student ID
    private String studentID;
    // store student name
    private String name;
    // store grades from student
    private ArrayList<Integer> grades;

    // create constructor method that runs automaticaly whe a student object is created, with two parameters student id and name
    public Student(String studentID, String name){
        // assign value to instance var, use this to refer to id inside object
        this.studentID = studentID;
        // assign value to instance var, use this to refer to name inside object
        this.name = name;
        // create an empty array list to store grades
        this.grades = new ArrayList<Integer>();
    }
    // create getter method to retrieve student ID
    public String getStudentID(){
        return studentID;
    }
    // create getter method to retrieve name
    public String getName(){
        return name;
    }
    // create getter method to retrieve grade
    public ArrayList<Integer> getGrades(){
        return grades;
    }
    
}
