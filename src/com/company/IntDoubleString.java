package com.company;

import java.util.Scanner;

public class IntDoubleString {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        double num2= sc.nextDouble();
        sc.nextInt(); // // gets rid of the pesky newline
        String num3= sc.nextLine();
        sc.close();
        System.out.println("String:"+ num3);
        System.out.println("Double:"+ num2);
        System.out.println("Int:"+ num1);
    }
}
