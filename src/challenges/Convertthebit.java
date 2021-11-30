package challenges;

import java.util.Scanner;

public class Convertthebit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long remainder, binary = 0, i = 1;
        while (n != 0) {
            remainder = n % 2;
            n = n / 2;
            binary = binary + (remainder * i);
            i = i * 10;
        }
        System.out.println(binary);
    }
}