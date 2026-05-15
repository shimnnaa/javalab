import java.util.Scanner;

class symatrix
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int r, c;

        System.out.print("Enter number of rows: ");
        r = sc.nextInt();

        System.out.print("Enter number of columns: ");
        c = sc.nextInt();

        int matrix[][] = new int[r][c];

        if (r != c)
        {
            System.out.println("Matrix is NOT symmetric (not a square matrix).");
            return;
        }

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }

        boolean symmetric;
        symmetric = true;

        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++)
            {
                if (matrix[i][j] != matrix[j][i])
                {
                    symmetric = false;
                    break;
                }
            }
        }

        if (symmetric)
        {
            System.out.println("Matrix is SYMMETRIC");
        }
        else
        {
            System.out.println("Matrix is NOT SYMMETRIC");
        }
    }
}
