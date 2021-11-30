package HackerRank;

import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class JavaStrComp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int k= sc.nextInt();
        SortedSet<String> set=new TreeSet<>();

        for (int i=0;i<=str.length()-k;i++){
            set.add(str.substring(i,i+k));
        }
        System.out.println(set.first());
        System.out.println(set.last());
    }
}
