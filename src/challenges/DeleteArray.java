package challenges;

import java.util.Scanner;

public class DeleteArray {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int arry[]=new int[n];
        for (int i=0;i<n;i++){
            arry[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                /* If any duplicate found */
                if(arry[i] == arry[j])
                {
                    /* Delete the current duplicate element */
                    for(int k=j; k < n - 1; k++)
                    {
                        arry[k] = arry[k + 1];
                    }

                    /* Decrement size after removing duplicate element */
                    n--;

                    /* If shifting of elements occur then don't increment j */
                    j--;
                }
            }
        }
        for (int i=0;i<n;i++){
            System.out.println(arry[i]);
        }
    }
    }

