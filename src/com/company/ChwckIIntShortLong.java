package com.company;

import java.util.Scanner;

public class ChwckIIntShortLong {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
       int n= sc.nextInt();



            for (int i = 1; i <= n; i++) {
                try {
                    long num = sc.nextLong();
                    System.out.printf("%d can be fitted in:\n", num);


                    if (Byte.MAX_VALUE >= num && num >= Byte.MIN_VALUE) {
                        System.out.println("* byte");
                    }
                    if (Short.MAX_VALUE >= num && num >= Short.MIN_VALUE) {
                        System.out.println("* short");
                    }
                    if (Integer.MAX_VALUE >= num && num >= Integer.MIN_VALUE) {
                        System.out.println("* int");
                    }
                    if (Long.MAX_VALUE >= num && num >= Long.MIN_VALUE) {
                        System.out.println("* long");
                    }


                } catch (Exception e) {
                    System.out.println(sc.next() + "can't be fitted anywhere.");
                }
            }

    }
}
