import java.util.*;

public class prgm07 {

    public static void userDefinedSort(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                   
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void display(String[] arr) {
        System.out.println("Sorted Strings:");
        for (String str : arr) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[n];

        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        System.out.println("\nMenu:");
        System.out.println("1 -> Built-in Sorting");
        System.out.println("2 -> User-defined Sorting");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                Arrays.sort(arr);
                display(arr);
                break;

            case 2:
                userDefinedSort(arr);
                display(arr);
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}

