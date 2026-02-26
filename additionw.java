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

public class additionw {
    public static void main(String[] args) {

       
        Complex c1 = new Complex(4, 5);
        Complex c2 = new Complex(2, 3);

        Complex result = c1.add(c2);

        System.out.print("Sum = ");
        result.display();
    }
}

