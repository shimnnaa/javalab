import java.util.Scanner;
class Student {
	String name;
	int rollNo;
	int marks;

	Student(String name,int rollNo,int marks){
		this.name=name;
		this.rollNo=rollNo;
		this.marks=marks;
	}
	void checkEligibility(){
		if (marks >= 40){
			System.out.println(name + "is Eligible for Exam");
			 } else {
            System.out.println(name + " is Not Eligible for Exam");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating three students using user input
        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter details for Student " + i);

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Roll No: ");
            int rollNo = sc.nextInt();

            System.out.print("Marks: ");
            int marks = sc.nextInt();
            sc.nextLine(); // consume leftover newline

            Student s = new Student(name, rollNo, marks);
            s.checkEligibility();

            System.out.println();
        }

        sc.close();
    }
}
