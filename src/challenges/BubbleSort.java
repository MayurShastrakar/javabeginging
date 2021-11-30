package challenges;

import java.util.ArrayList;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
       for (int i=0;i<array.length;i++){
           array[i]=sc.nextInt();
       }
        for (int i=0;i<array.length;i++){
            int temp;
           if (array[i]>array[i+1]){
               temp=array[i];
               array[i]=array[i+1];
               array[i+1]=temp;
           }
       }


    }
}
