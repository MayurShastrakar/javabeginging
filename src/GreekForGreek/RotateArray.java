package GreekForGreek;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        int N=sc.nextInt();
        int D=sc.nextInt();
        int[] array=new int[N];
        int[] temp=new int[N];
        while (T--!=0) {
            for (int i = 0; i < N; i++) {
                array[i] = sc.nextInt();
            }
            for(int k=0;k<D;k++){
            for (int i = 0; i < array.length-1; i++) {
                int j = i + 1;
                temp[i] = array[i];
                array[i] = array[j];
                array[j] = temp[i];
            }
            }
            for (int i = 0; i < N; i++) {
                System.out.print(array[i]+" ");
            }
        }
        System.out.println();
    }
}
