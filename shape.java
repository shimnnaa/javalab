import java.util.Scanner;

abstract class Shape {
    abstract double area();
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    double area() {
        return length * width;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

public class shape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of rectangle: ");
        double length = sc.nextDouble();

        System.out.print("Enter width of rectangle: ");
        double width = sc.nextDouble();

        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();

        Rectangle rect = new Rectangle(length, width);
        Circle circ = new Circle(radius);

        System.out.println("Area of Rectangle: " + rect.area());
        System.out.println("Area of Circle: " + circ.area());

        sc.close();
    }
}
