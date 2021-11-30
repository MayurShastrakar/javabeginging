package HackerRank;

import java.util.Scanner;

public class JavaSubstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int firstNo=sc.nextInt();
        int lastNo=sc.nextInt();
        System.out.println(str.substring(firstNo,lastNo));
    }
}
