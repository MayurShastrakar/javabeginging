package com.company;

import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for (int i=0;i<=10;i++){
        int sum= num*i;
            System.out.printf("%d*%d=%d",num,i,sum);
            System.out.println();
        }
    }
}
