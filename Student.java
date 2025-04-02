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
    // create a method to add grade into grades arraylist
    public void addGrades(int grade){
        // check if grade is between 0 and 100
        if (grade >= 0 && grade <=100) {
            // add grade to grades array
            grades.add(grade);
        }
        else{
            // if it is not between 0-100 then invalid
            System.out.println("Invalid Grade");
        }
    }
    // create a method to calculate the average grade as a double
    public double calculateAverage(){
        // create double variable for the average
        double avg = 0;
        // create double sum variable
        double sum = 0;
        // create length variable and set to the length of the array
        int length = grades.size();

        // check if array is empty, if itis then return the starter avg
        if (grades.size() == 0) {
            return avg;
        }

        // for loop to iterate through the grades, to add up each grade
        for (Integer grade : grades) {
            // the sum which starts at 0 is equal to the grade, each time in loop it adds to the sum
            sum += grade;
        }
        avg = sum / length;
        
        return avg;
    }
    
}
