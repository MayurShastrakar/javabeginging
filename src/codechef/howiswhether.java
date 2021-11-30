package codechef;

import java.util.Scanner;

public class howiswhether {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        String a[]= new String[0];
        int count=0;
        int co=0;
        for (int i=1;i<=7;i++){
            a[i]=Sc.nextLine();
            if (a[i] == String.valueOf('R')){
               count++;
            }else {
                co++;
            }
        }
        if (co>count) {
            System.out.println("Yes");
        }
        else System.out.println("No");

    }
}
