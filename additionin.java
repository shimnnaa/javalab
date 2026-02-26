import java.util.Scanner;

class Complex {
    double real;
    double imag;

    Complex(double r, double i) {
        real = r;
        imag = i;
    }
    Complex add(Complex c) {
        return new Complex(this.real + c.real, this.imag + c.imag);
    }

    void display() {
        System.out.println(real + " + " + imag + "i");
    }
}

public class additionin{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter real part of first complex number: ");
        double r1 = sc.nextDouble();
        System.out.print("Enter imaginary part of first complex number: ");
        double i1 = sc.nextDouble();


        System.out.print("Enter real part of second complex number: ");
        double r2 = sc.nextDouble();
        System.out.print("Enter imaginary part of second complex number: ");
        double i2 = sc.nextDouble();

        Complex c1 = new Complex(r1, i1);
        Complex c2 = new Complex(r2, i2);

        Complex result = c1.add(c2);

        System.out.print("Sum = ");
        result.display();

        sc.close();
    }
}

