public class p5_copy {
    
    // A class to demonstrate the use of a copy constructor
    static class Student {
        int id;
        String name;

        // Parameterized constructor
        Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        // Copy constructor
        Student(Student student) {
            this.id = student.id;
            this.name = student.name;
        }

        // Method to display student details
        void display() {
            System.out.println("ID: " + id + ", Name: " + name);
        }
    }

    public static void main(String[] args) {
        // Creating an object of Student class
        Student student1 = new Student(101, "John Doe");

        // Creating another object using the copy constructor
        Student student2 = new Student(student1);

        // Displaying the details of both students
        student1.display();
        student2.display();
    }
}
