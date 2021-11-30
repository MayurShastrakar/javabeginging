package com.company;
import java.util.Scanner;
public class Ifelse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        if(num%2==0){
          if(2<num && num<5 ){
              System.out.println("Not Weird");
          }
          else  if (6<num && num<20){
              System.out.println("Weird");
          }
          else {
              System.out.println("Not Weird");
          }
        }
        else {
            System.out.println("weird");
        }
    }
}
