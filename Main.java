import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Student\n2. Add Grade\n3. View Student\n4. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            if (choice == 1) {
                System.out.print("Enter Student ID: ");
                String id = scanner.nextLine();
                System.out.print("Enter Name: ");
                String name = scanner.nextLine();
                manager.addStudent(id, name);
            } else if (choice == 2) {
                System.out.print("Enter Student ID: ");
                String id = scanner.nextLine();
                System.out.print("Enter Grade: ");
                int grade = scanner.nextInt();
                manager.findStudent(id).addGrades(grade);
            } else if (choice == 3) {
                System.out.print("Enter Student ID: ");
                String id = scanner.nextLine();
                manager.displayStudent(id);
            } else if (choice == 4) {
                break;
            }
        }
        scanner.close();
    }
}
