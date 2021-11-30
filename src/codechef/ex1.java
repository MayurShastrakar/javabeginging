package codechef;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class ex1 {
    private static int longestStreak(String str){
    int longstr=1;
    int currentstr=1;
    for (int i=1;i<=str.length();i++) {
        if (str.charAt(i) == 1 && str.charAt(i - 1) == 1) {
           currentstr++;
        } else currentstr= 1;
        if (currentstr>longstr){
            longstr=currentstr;
        }
    }
        return longstr;
    }
    public static void main(String[] args) {
        try {
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            while (T!=0) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                int salary = 0;
                sc.nextInt();
                String str = sc.nextLine();
                for (int i = 0; i <= str.length(); i++) {
                    if (str.charAt(i) == 1) {
                        salary++;
                    }
                }
                int currentSalary = salary * x;
                int bonasSalary=longestStreak(str)*y;
                int finalsalary=currentSalary+bonasSalary;
                System.out.println(finalsalary);
                T--;
            }
        }catch (Exception e){
            return;
        }
    }
}
