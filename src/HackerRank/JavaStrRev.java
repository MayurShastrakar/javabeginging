package HackerRank;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;

public class JavaStrRev {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String rev="";
        for (int i=str.length()-1;i>=0;i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println(rev.equals(str)?"Yes":"No");

    }

    }
