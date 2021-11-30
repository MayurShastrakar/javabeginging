package codechef;

import java.util.Scanner;

public class bunnyHop {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int num=Sc.nextInt();
        int no=num;
        int rev=0;
       while (num!=0) {
           int r = num % 10;
           rev=(rev*10)+r;
           num = num / 10;

       }
        System.out.println(rev);




    }
}
