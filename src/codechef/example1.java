package codechef;

import java.util.Scanner;

public class example1 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
    int a=(int)(Math.ceil((Math.log(n) / Math.log(2))));
    int b=(int)(Math.floor(((Math.log(n) / Math.log(2)))));
    if (n!=0){
        if (a==b){
            System.out.println("Yes");
        }
        else System.out.println("No");
    }else System.out.println("No");
    }
}
