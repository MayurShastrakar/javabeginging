package codechef;

import java.util.Scanner;

public class KTTABLE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int count = 0;
            int a[] = new int[N];
            int b[] = new int[N];
            for (int i = 0; i < N; i++) {
                a[i] = sc.nextInt();
                for (int j = 0; j <= N; j++) {
                    b[j] = sc.nextInt();
                }
            }
            for (int i = 0; i <= N; i++) {
                for (int j = 0; j <= N; j++) {
                    if (a[i] == b[j] || a[i] < b[j]) {
                        count++;
                        a[i + 1] = a[i + 1] - a[i];
                    }
                }
            }
            System.out.println(count);


        }
    }
}
