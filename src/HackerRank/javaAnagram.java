package HackerRank;

import java.util.Scanner;
import java.util.SortedSet;

public class javaAnagram {
    public static boolean isAnagram(String a,String b){
        if (a.length()!=b.length()){
            return false;
        }
        else {
            char[] ArrayA=a.toLowerCase().toCharArray();
            char[] ArrayB=b.toLowerCase().toCharArray();

            java.util.Arrays.sort(ArrayA);
            java.util.Arrays.sort(ArrayB);

            return java.util.Arrays.equals(ArrayA,ArrayB);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String a=sc.next();
        String b=sc.next();
        System.out.println(isAnagram(a,b)==true?"Anagrams":"Not Anagrams");
    }
}
