package codechef;

import java.util.Scanner;

public class paisapaisa {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        float x=Sc.nextFloat();
        float y=Sc.nextFloat();
        if (y%5==0){
            if (x>=y){
                System.out.println("valid");
            }
            else System.out.println("Invalid");
        }
        else System.out.println("Invalid");
    }
}
