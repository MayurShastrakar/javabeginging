package codechef;

import java.util.Scanner;

public class Fuil {
    public static void main(String[] args) {
        try{
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while (T-->0){
            int x=sc.nextInt();
            int Y=sc.nextInt();
            int A=sc.nextInt();
            int B=sc.nextInt();
            int k=sc.nextInt();
            if ((x+A*k)<(Y+B*k)){
                System.out.println("PETROL");
            }
            else if ((x+A*k)>(Y+B*k)){
                System.out.println("DIESEL");
            }
            else
                System.out.println("SAME PRICE");
            }
                }catch (Exception e){
            return;
        }
        }
    }

