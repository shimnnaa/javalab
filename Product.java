import java.util.Scanner;
class Product {
        int pcode;
        String pname;
        double price;

        Product(int pcode,String pname,double price){
                this.pcode = pcode;
                this.pname = pname;
                this.price = price;
        }

        void display(){
                System.out.println("Product Code: " +pcode);
                System.out.println("Product Name: " +pname);
                System.out.println("Price: " +price);
        }

        public static void main(String[] args){
                Scanner sc = new Scanner (System.in);

                System.out.println("Enter detailes for Product 1");
                System.out.println("Enter the product code: ");
		int code1 = sc.nextInt();
                System.out.println("Enetr the product Name: ");
                String name1 =sc.next();
                System.out.println("Enter price:");
                double price1 = sc.nextDouble();

                Product p1 = new Product(code1, name1, price1);

                System.out.println("Enter detailes for Product 2");
                System.out.println("Enter the product code: ");
                int code2 = sc.nextInt();
                System.out.println("Enter the product Name: ");
                String name2 =sc.next();
                System.out.println("Enter price:");
                double price2 = sc.nextDouble();

                Product p2 = new Product(code2, name2, price2);

                System.out.println("Enter detailes for Product 3");
                System.out.println("Enter the product code: ");
                int code3 = sc.nextInt();
                System.out.println("Enter the product Name: ");
		String name3 =sc.next();
                System.out.println("Enter price:");
                double price3 = sc.nextDouble();

                Product p3 = new Product(code3, name3, price3);

                Product lowest = p1;

                if (p2.price < lowest.price){
                       lowest = p2;
                }
                if (p3.price < lowest.price){
                       lowest = p3;
                }
                 System.out.println("\nProduct with Lowest Price:");
                 lowest.display();
        }
}





