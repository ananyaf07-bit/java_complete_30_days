class Student {
    String name;
    int age;
    double cgpa;

    void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age + ", CGPA: " + cgpa);
    }
}

public class StudentObject {
    public static void main(String[] args) {
        
        Student student1 = new Student();
        Student student2 = new Student();

        
        student1.name = "Aarav";
        student1.age = 20;
        student1.cgpa = 8.7;

        student2.name = "Priya";
        student2.age = 21;
        student2.cgpa = 9.2;

        System.out.println("--- Initial Details ---");
        student1.displayDetails();
        student2.displayDetails();

        student1.age = 22;

        System.out.println("\n--- After Modifying Student 1's Age ---");
        student1.displayDetails();
        student2.displayDetails();
        
        student1 = null;
        student2 = null;

        System.out.println("\n--- References Set to Null ---");
        System.out.println("student1: " + student1);
        System.out.println("student2: " + student2);
    }
}
