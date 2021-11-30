package challenges;

import java.util.Scanner;

public class FindingTypeOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if ((Math.pow(a, 2) + Math.pow(b, 2)) == Math.pow(c, 2))
            System.out.println("Right-angle");
        if ((Math.pow(b, 2) + Math.pow(a, 2)) == Math.pow(c, 2))
            System.out.println("Right-angle");
        if ((Math.pow(c, 2) + Math.pow(b, 2)) == Math.pow(a, 2))
            System.out.println("Right-angle");
        else {
            if (a == b && a == c && b == c) {
                System.out.println("Equilateral");
            } else if (a == b || a == c || b == c) {
                System.out.println("Isosceles");
            } else if
                (a == 0 || b == 0 || c == 0) {System.out.println("Not Possible");
            }
            else if (a != b && b != c) {
                System.out.println("Scalene");}
        }
    }
}