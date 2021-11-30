package HackerRank;
import java.util.Locale;
import java.util.Scanner;

public class JavaString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int length=A.length()+B.length();
        System.out.println(length);
        System.out.println(A.compareTo(B)>0?"Yes":"No");

        String FirstLetterA=A.substring(0,1);
        String remLetterA=A.substring(1);
        String firstLA=FirstLetterA.toUpperCase();
        System.out.println(firstLA.concat(remLetterA));
        String FirstLetterB=B.substring(0,1);
        String remLetterB=B.substring(1);
        String firstLB=FirstLetterB.toUpperCase();
        System.out.println(firstLB.concat(remLetterB));
    }
}
