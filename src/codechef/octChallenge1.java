package codechef;

import java.util.Scanner;

public class octChallenge1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

            while (t != 0) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                try {
                if (a > 0 && b > 0) {
                    System.out.println("Solution");
                } else if (b == 0)
                    System.out.println("Solid");
                else if (a == 0)
                    System.out.println("Liquid");
                t--;
            } catch (Exception e){
                    System.out.println("exepection" );
                }
        }

    }
}
