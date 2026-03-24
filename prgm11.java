import java.util.Scanner;

class Publisher
{
    String pname;

    void getPublisher(String name)
    {
        pname = name;
    }
}

class Book extends Publisher
{
    String bname;
    int price;

    void getBook(String bn, int p)
    {
        bname = bn;
        price = p;
    }
}

class Literature extends Book
{
    void display()
    {
        System.out.println("Category: Literature");
        System.out.println("Book Name: " + bname);
        System.out.println("Publisher: " + pname);
        System.out.println("Price: " + price);
    }
}

class Fiction extends Book
{
    void display()
    {
        System.out.println("Category: Fiction");
        System.out.println("Book Name: " + bname);
        System.out.println("Publisher: " + pname);
        System.out.println("Price: " + price);
    }
}

class prgm11
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Book Name:");
        String bname = sc.nextLine();

        System.out.println("Enter Publisher Name:");
        String pname = sc.nextLine();

        System.out.println("Enter Price:");
        int price = sc.nextInt();

        System.out.println("Choose Category (1-Literature, 2-Fiction):");
        int ch = sc.nextInt();

        if(ch == 1)
        {
            Literature l = new Literature();
            l.getPublisher(pname);
            l.getBook(bname, price);
            l.display();
        }
        else if(ch == 2)
        {
            Fiction f = new Fiction();
            f.getPublisher(pname);
            f.getBook(bname, price);
            f.display();
        }
        else
        {
            System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
