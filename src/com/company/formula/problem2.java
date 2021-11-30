package com.company.formula;

import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        int T, N, M;
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        N = sc.nextInt();
        M = sc.nextInt();
        String a[] = new String[N];
        for (int i = 0; i < T; i++) {
            for (int j = 0; j < N; j++) {
                a[j] = sc.nextLine();
                 }
            }
        for (int i = 0; i < T; i++) {
            for (int j = 0; j < N; j++) {
                if (j!=M) {
                    System.out.println(a[j]);
                }else continue;
            }
        }
    }
}
