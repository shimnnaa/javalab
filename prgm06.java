import java.util.Scanner;

class Complex {
    double real;
    double imaginary;
    Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    Complex add(Complex c) {
        double newReal = this.real + c.real;
        double newImaginary = this.imaginary + c.imaginary;
        return new Complex(newReal, newImaginary);
    }

    void display() {
        if (imaginary >= 0)
            System.out.println(real + " + " + imaginary + "i");
        else
            System.out.println(real + " - " + (-imaginary) + "i");
    }
}

public class prgm06 {
    public static void main(String[] args) {

        System.out.println("Addition without user input:");
        Complex c1 = new Complex(3, 4);
        Complex c2 = new Complex(2, 5);
        Complex result1 = c1.add(c2);
        result1.display();

        Scanner sc = new Scanner(System.in);

        System.out.println("\nAddition with user input:");

        System.out.print("Enter real part of first complex number: ");
        double r1 = sc.nextDouble();
        System.out.print("Enter imaginary part of first complex number: ");
        double i1 = sc.nextDouble();

        System.out.print("Enter real part of second complex number: ");
        double r2 = sc.nextDouble();
        System.out.print("Enter imaginary part of second complex number: ");
        double i2 = sc.nextDouble();

        Complex c3 = new Complex(r1, i1);
        Complex c4 = new Complex(r2, i2);

        Complex result2 = c3.add(c4);
        System.out.print("Result: ");
        result2.display();

        sc.close();
    }
}

