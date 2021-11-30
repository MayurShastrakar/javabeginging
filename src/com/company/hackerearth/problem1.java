package com.company.hackerearth;

import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        int test,n,m;
        int out=0;
        Scanner sc= new Scanner(System.in);
        test= sc.nextInt();
        for(int i=1;i<=test;i++) {

            n = sc.nextInt();
            m = sc.nextInt();
            String a[][] = new String[0][];
            for (int j=1;j<=n;j++){
                for (int k=1;k<=m;k++) {

                    a[j][k] = sc.nextLine();
                }
                    System.out.println();
                }
            for (int j=1;j<=n;j++){
                for (int k=1;k<=m;k++) {

                  if(a[j][k]=="#"){
                      out++;
                }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println(out);
        }
        System.out.println();
    }
}
