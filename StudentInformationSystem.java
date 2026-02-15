import java.util.Scanner;

public class StudentInformationSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        while (true) {
            System.out.println("\n=== STUDENT INFORMATION SYSTEM ===");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    String id = sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();

                    System.out.print("Enter Grade: ");
                    double grade = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter Contact: ");
                    String contact = sc.nextLine();

                    if (!ValidationUtils.isValidAge(age)) {
                        System.out.println("Invalid age!");
                        break;
                    }

                    if (!ValidationUtils.isValidGrade(grade)) {
                        System.out.println("Invalid grade!");
                        break;
                    }

                    Student student = new Student(name, age, grade, id, contact);
                    manager.addStudent(student);
                    break;

                case 2:
                    manager.viewAllStudents();
                    break;

                case 3:
                    System.out.print("Enter Student ID to search: ");
                    String searchId = sc.nextLine();
                    Student found = manager.searchById(searchId);

                    if (found != null) {
                        System.out.println("Student Found:");
                        found.display();
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
