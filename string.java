import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String1: ");
        String a = sc.nextLine();

        System.out.println("Enter a String2: ");
        String b = sc.nextLine();

        System.out.println("String length: " + a.length());

        System.out.println("String Concat: " + a.concat(b));

        System.out.println("String Character At 0: " + a.charAt(0));

        char arr[] = new char[a.length()];
        a.getChars(0, a.length(), arr, 0);
        System.out.println("String getChars: " + new String(arr));

        System.out.println("String compareTo: " + a.compareTo(b));
         System.out.println("String equals: " + a.equals(b));

        System.out.println("String equalsIgnoreCase: " + a.equalsIgnoreCase(b));

        System.out.println("String starts with 'a': " + a.startsWith("a"));

        System.out.println("String ends with 'a': " + a.endsWith("a"));

        System.out.println("String contains 'a': " + a.contains("a"));

        System.out.println("String indexOf 'a': " + a.indexOf("a"));

        System.out.println("String to uppercase: " + a.toUpperCase());

        System.out.println("String to lowercase: " + a.toLowerCase());

        System.out.println("String Empty or Not: " + a.isEmpty());

        System.out.println("String replace a with @: " + a.replace("a", "@"));
	System.out.print("Enter a decimal number: ");
        String doubleStr = sc.nextLine();
        Double d = Double.valueOf(doubleStr);

        System.out.print("Enter an integer number: ");
        String intStr = sc.nextLine();
        Integer i = Integer.valueOf(intStr);

        System.out.println("Double value: " + d);
        System.out.println("Integer value: " + i);

        sc.close();
    }
}




