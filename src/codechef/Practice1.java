package codechef;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int AmountCash=sc.nextInt();
        float currentCash=sc.nextFloat();


        try {
            if (AmountCash%5==0 && currentCash>AmountCash){
                float Cash= (float) (currentCash-(AmountCash+0.50));
                System.out.println(Cash);
            }
            else {
                System.out.println(currentCash);
            }
        }catch (Exception e){
            return;
        }

    }
}
