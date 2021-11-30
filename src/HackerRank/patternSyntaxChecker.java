package HackerRank;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class patternSyntaxChecker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=Integer.parseInt(sc.nextLine());

        while (N!=0){
            String str=sc.nextLine();
           try {
               Pattern.compile(str);
               System.out.println("Valid");
           }catch (PatternSyntaxException exception){
               System.out.println("Invalid");
           }
           N--;
        }
    }
}
