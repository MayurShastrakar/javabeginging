package codechef;

import java.util.Arrays;
import java.util.Scanner;

public class Qualprel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int count=0;
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] arry=new int[n];
            for (int i=0;i<n;i++){
                arry[i]=sc.nextInt();
                }
            Arrays.sort(arry);
            for (int i=0;i<n;i++){

                if (arry[i]>=arry[n-k]){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
