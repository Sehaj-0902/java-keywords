class Student {
    private static String universityName = "Central University";
    private final int rollNumber;
    private String name;
    private String grade;

    // Constructor
    public Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
    }

    // Method to display student details
    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
        }
    }
}

public class UniversityStudentManagement {
    public static void main(String[] args) {
        System.out.println("Student Details:");

        Student student1 = new Student(101, "Alice", "A");
        student1.displayStudentDetails();

        Student student2 = new Student(102, "Charlie", "A");
        student2.displayStudentDetails();
    }
}

/*
Output:
    Student Details:
    University: Central University
    Roll Number: 101
    Name: Alice
    Grade: A
    University: Central University
    Roll Number: 102
    Name: Charlie
    Grade: A
 */