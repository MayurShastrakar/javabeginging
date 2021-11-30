package challenges;

import java.util.Scanner;

public interface SquarematrixintoaLowerTriangularmatrix {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int matrix[][]=new int[a][b];
        for (int i=1;i<=a;i++){
        for (int j=1;j<=b;j++) {

            matrix[i][j]=sc.nextInt();
        }
        }
        for (int i = 0; i < a; i++)
        {
            for (int j = 0; j < b; j++)
            {

                if (i < j)
                {
                    System.out.print("0" + " ");
                }
                else
                    System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }}
