package HackerRank;

import java.util.Scanner;

public class Java1DArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int[] array=new int[length];
        for (int i=0;i<=length-1;i++){
            array[i]=sc.nextInt();
        }
        for (int i=0;i<=length-1;i++){
            System.out.println(array[i]);
        }
    }
}
