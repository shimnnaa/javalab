import java.util.Scanner;

class prgm10
{
    double area(double side)  
    {
        return side * side;
    }

    double area(double length, double breadth) 
    {
        return length * breadth;
    }

    double area(int radius)  
    {
        return 3.14 * radius * radius;
    }

    double area(double base, double height, int t) 
    {
        return 0.5 * base * height;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        prgm10 obj = new prgm10();

        System.out.print("Enter side of square: ");
        double s = sc.nextDouble();
        System.out.println("Area of Square: " + obj.area(s));

        System.out.print("Enter length and breadth of rectangle: ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Area of Rectangle: " + obj.area(l, b));

        System.out.print("Enter radius of circle: ");
        int r = sc.nextInt();
        System.out.println("Area of Circle: " + obj.area(r));

        System.out.print("Enter base and height of triangle: ");
        double base = sc.nextDouble();
        double h = sc.nextDouble();
        System.out.println("Area of Triangle: " + obj.area(base, h, 1));

        sc.close();
    }
}
