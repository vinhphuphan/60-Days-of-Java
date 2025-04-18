import java.util.Scanner;


// Step 1: Define the Student class
class Student {
    String name;
    int studentID;
    int age;
    double height;
    
    public Student(String name, int studentID, int age, double height) {
        this.name = name;
        this.studentID = studentID;
        this.age = age;
        this.height = height;
    }
}


public class App {
    public static void main(String[] args) throws Exception {
        // Declare and initialize
        Scanner scanner = new Scanner(System.in);

        // Step 2: Ask the user for the number of students
        System.out.print("How many students do you want to enter? ");
        int numStudents = scanner.nextInt();

        // Step 3: Create an array to store Student objects
        Student[] students = new Student[numStudents];

        // Step 4: Loop to take input for each student
        for (int i = 0; i < students.length; i++) {
            System.out.print("Please enter the details for student " + (i+1));
            scanner.nextLine(); // Consume new line
            System.out.println();
            // name
            System.out.print("Name : ");
            String name = scanner.nextLine();
            // Student ID
            System.out.print("StudentID : ");
            int studentID = scanner.nextInt();
            // age
            System.out.print("Age : ");
            int age = scanner.nextInt(); 
            //height
            System.out.print("Height (cm) : ");
            double height = scanner.nextDouble(); 

            // Khởi tạo student object với constructor
            students[i] = new Student(name, studentID, age, height);

        }

        
        // Step 6: Compute and display statistics
        calculateAndDisplayStatistics(students);
        scanner.close();

    }

    public static void calculateAndDisplayStatistics(Student[] students) {
        int totalAge = 0;
        double totalHeight = 0;
        Student oldest = students[0];
        Student tallest = students[0];
        for (Student student : students ) {
            // Computes total age
            totalAge += student.age;
            // Computes total height
            totalHeight += student.height;
            // Find the oldest student
            if (student.age > oldest.age) {
                oldest = student;
            }
            // Find the tallest student
            if (student.height > tallest.height) {
                tallest = student;
            }
        }

        // Compute the average age 
        double averageAge = (double) totalAge/students.length;
        // Compute the average height 
        double averageHeight = (double) totalHeight/students.length;
        System.out.println("Here is the statistic of student lists");
        System.out.println("Average age : " + averageAge);
        System.out.println("Average height : " + averageHeight);
        System.out.println("Oldest student : " + oldest.name + " with ID " + oldest.studentID);
        System.out.println("Tallest student : " + tallest.name + " with ID " + tallest.studentID);

    }
}
