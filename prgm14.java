import java.util.Scanner;

interface student {
    void getAcademic();
}

interface sports {
    void getSports();
}

class result implements student, sports {
    int academic_score;
    int sports_score;

    Scanner sc = new Scanner(System.in);

    public void getAcademic() {
        System.out.print("Enter academic score: ");
        academic_score = sc.nextInt();
    }

    public void getSports() {
        System.out.print("Enter sports score: ");
        sports_score = sc.nextInt();
    }

    void display() {
        System.out.println("\n--- Result ---");
        System.out.println("Academic Score: " + academic_score);
        System.out.println("Sports Score: " + sports_score);
        System.out.println("Total Score: " + (academic_score + sports_score));
    }
}
public class prgm14 {
    public static void main(String[] args) {
        result obj = new result();

        obj.getAcademic();
        obj.getSports();
        obj.display();
    }
}
