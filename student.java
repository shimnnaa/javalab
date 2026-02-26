import java.util.Scanner;

class Student {
    String name;
    int rollNo;
    int marks;

    Student(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
   }
    void checkEligibility() {
        if (marks >= 40) {
            System.out.println("Student " + name + " (Roll No: " + rollNo + ") is Eligible for Exam.");
        } else {
            System.out.println("Student " + name + " (Roll No: " + rollNo + ") is NOT Eligible for Exam.");
        }
    }
}

public class student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("\nEnter details for Student " + (i + 1));

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Roll No: ");
            int rollNo = sc.nextInt();

            System.out.print("Enter Marks: ");
            int marks = sc.nextInt();
            sc.nextLine(); 

            students[i] = new Student(name, rollNo, marks);
        }

        System.out.println("\n--- Exam Eligibility Result ---");
        for (Student s : students) {
            s.checkEligibility();
        }

        sc.close();
    }
}

