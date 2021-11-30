package com.company.formula;

import java.util.Scanner;

public class patter1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the num of which pattern");
        int num=sc.nextInt();
        for (int i=1; i<=num;i++){
            for (int j=num-i;j>=0;j--){
                System.out.print(" ");
            }
            for (int j=1;j<=num;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
