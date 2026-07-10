class Student {
    // Static variable
    static int studentCount = 0;

    // Instance variable
    String name;

    // Constructor
    Student(String name) {
        this.name = name;
        studentCount++; // Increment static variable
    }

    // Static method
    static void showStudentCount() {
        System.out.println("Total students: " + studentCount);
    }

    // Instance method
    void display() {
        System.out.println("Student name: " + name);
    }
}

public class StaticExample {
    public static void main(String[] args) {
        Student s1 = new Student("Ritik");
        Student s2 = new Student("Anita");
        Student s3 = new Student("Rahul");

        // Call instance method
        s1.display();

        // Call static method without creating object
        Student.showStudentCount();
    }
}
