package challenges;

import java.util.Scanner;

public class GrossSalary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int g=(((x*12)/100)+((x*10)/100))+x;

        System.out.println(g);
    }
}
