import java.util.Scanner;

// Base class Person
class Person {
    String name;
    String gender;
    String address;
    int age;

    // Constructor to initialize Person data
    Person(String name, String gender, String address, int age) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }
}

// Employee class inheriting Person
class Employee extends Person {
    String emp_id;
    String company_name;
    String qualification;
    double salary;

    // Constructor to initialize Employee data
    Employee(String name, String gender, String address, int age,
             String emp_id, String company_name, String qualification, double salary) {
        super(name, gender, address, age); // call Person constructor
        this.emp_id = emp_id;
        this.company_name = company_name;
        this.qualification = qualification;
        this.salary = salary;
    }
}

// Teacher class inheriting Employee
class Teacher extends Employee {
    String subject;
    String department;
    String teacher_id;

    // Constructor to initialize Teacher data
    Teacher(String name, String gender, String address, int age,
            String emp_id, String company_name, String qualification, double salary,
            String subject, String department, String teacher_id) {
        super(name, gender, address, age, emp_id, company_name, qualification, salary);
        this.subject = subject;
        this.department = department;
        this.teacher_id = teacher_id;
    }

    // Method to display Teacher details
    void display() {
        System.out.println("\n--- Teacher Details ---");
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Company Name: " + company_name);
        System.out.println("Qualification: " + qualification);
        System.out.println("Salary: " + salary);
        System.out.println("Subject: " + subject);
        System.out.println("Department: " + department);
        System.out.println("Teacher ID: " + teacher_id);
    }
}

// Main class
public class prgm13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of teachers: ");
        int N = sc.nextInt();
        sc.nextLine(); // consume newline

        Teacher[] teachers = new Teacher[N];

        for (int i = 0; i < N; i++) {
            System.out.println("\nEnter details of teacher " + (i + 1) + ":");
            
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Gender: ");
            String gender = sc.nextLine();

            System.out.print("Address: ");
            String address = sc.nextLine();

            System.out.print("Age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Employee ID: ");
            String emp_id = sc.nextLine();

            System.out.print("Company Name: ");
            String company_name = sc.nextLine();

            System.out.print("Qualification: ");
            String qualification = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            System.out.print("Subject: ");
            String subject = sc.nextLine();

            System.out.print("Department: ");
            String department = sc.nextLine();

            System.out.print("Teacher ID: ");
            String teacher_id = sc.nextLine();

            // Create Teacher object
            teachers[i] = new Teacher(name, gender, address, age,
                                      emp_id, company_name, qualification, salary,
                                      subject, department, teacher_id);
        }

        // Display all teachers
        System.out.println("\n\n=== All Teachers Details ===");
        for (int i = 0; i < N; i++) {
            teachers[i].display();
        }

        sc.close();
    }
}
