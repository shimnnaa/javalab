import java.util.Scanner;

interface Bill
{
    void calculate();
}

class BillGenerator implements Bill
{
    int id, qty;
    String name;
    double price, total;

    static double netAmount = 0;

    void getData(Scanner sc)
    {
        System.out.print("Enter Product ID: ");
        id = sc.nextInt();

        System.out.print("Enter Product Name: ");
        name = sc.next();

        System.out.print("Enter Quantity: ");
        qty = sc.nextInt();

        System.out.print("Enter Unit Price: ");
        price = sc.nextDouble();
    }

    public void calculate()
    {
        total = qty * price;
        netAmount += total;
    }

    void display()
    {
        System.out.printf("%-12d %-10s %-10d %-12.2f %-10.2f\n",
                id, name, qty, price, total);
    }
}

public class prgm15

{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

        BillGenerator b[] = new BillGenerator[n];

        System.out.print("Order No: ");
        int orderNo = sc.nextInt();

        System.out.print("Date: ");
        String date = sc.next();

        System.out.println("\n------------------------------- BILL -------------------------------");
        System.out.println("Order No : " + orderNo);
        System.out.println("Date     : " + date);
        System.out.println("--------------------------------------------------------------------");

        System.out.printf("%-12s %-10s %-10s %-12s %-10s\n",
                "Product ID", "Name", "Quantity", "Unit Price", "Total");
        System.out.println("--------------------------------------------------------------------");

        for(int i = 0; i < n; i++)
        {
            b[i] = new BillGenerator();
            System.out.println("\nEnter details for product " + (i + 1));
            b[i].getData(sc);
            b[i].calculate();
        }

        System.out.println("--------------------------------------------------------------------");

System.out.printf("%-12s %-10s %-10s %-12s %-10s\n",
        "Product ID", "Name", "Quantity", "Unit Price", "Total");

System.out.println("--------------------------------------------------------------------");


for(int i = 0; i < n; i++)
{
    b[i].display();
}

System.out.println("--------------------------------------------------------------------");

System.out.printf("%-46s %-10.2f\n", "Net Amount :", BillGenerator.netAmount);
System.out.println("--------------------------------------------------------------------");
    }
}
