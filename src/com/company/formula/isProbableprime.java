package com.company.formula;

import java.util.Scanner;

public class isProbableprime {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        long num = Sc.nextLong();
        int c = 0;
        if (num <= 1) {
            System.out.println("not prime");
        } else {
            for (int i = 2; i < num; i++) {
                if (num == 2) {
                    c = 1;
                } else {
                    if (num % i == 0) {
                        c = 1;
                    }
                }
            }
            if (c==0){
                System.out.println("prime");
            }
            else {
                System.out.println("not prime");
            }
        }
    }
}
