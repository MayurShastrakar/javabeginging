package GreekForGreek;

import java.util.Scanner;

public class GeekonacciNum {
   public static int Geek(int a, int b, int c, int n){
        if (n==a)
            return a;
        else if (n==b)
            return b;
        else if (n==c)
            return c;
        else return Geek(a, b, c, n-1)+Geek(a, b, c, n-2)+Geek(a, b, c, n-3);
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        for (int i=1;i<=t;i++){
            int a= sc.nextInt();
            int b= sc.nextInt();
            int c= sc.nextInt();
            int n= sc.nextInt();
            int re=Geek(a,b,c,n);
            System.out.println(re);
        }

    }
}
