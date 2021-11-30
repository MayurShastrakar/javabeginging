package challenges;

import java.util.Scanner;

public class FindReminders {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c = 0;
        while (a!=0){
             c=sc.nextInt();
            a--;
        }
        System.out.println(c%b);
    }
}
