import java.util.Scanner;

interface Shape {
    double area();
}

class Rectangle implements Shape {
    double length, width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    public double area() {
        return length * width;
    }
}

class Circle implements Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}

public class shapeinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of rectangle: ");
        double length = sc.nextDouble();

        System.out.print("Enter width of rectangle: ");
        double width = sc.nextDouble();

        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();

        Shape rect = new Rectangle(length, width);
        Shape circ = new Circle(radius);

        System.out.println("Area of Rectangle: " + rect.area());
        System.out.println("Area of Circle: " + circ.area());

        sc.close();
    }
}
