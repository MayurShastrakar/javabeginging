package HackerRank;

import java.util.Scanner;
import java.util.regex.Pattern;

public class javaStrSlit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str=str.trim();

        if (str.length() > 0) {
            String[] tokens = str.split("[!,?._'@\\s]+");
            System.out.println(tokens.length);
            for(String token : tokens) {
                System.out.println(token);
            }
        } else {
            System.out.println(0);
        }

    }
}
