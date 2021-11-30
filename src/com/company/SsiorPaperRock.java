package com.company;
import java.util.Scanner;
import java.util.Random;
 class ScissorPaperRock{
    public static void main(String[] args) {
        // rock=0 ;
        // paper=1
        // scissor=2
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 0 for Rock, 1 for Paper, 2 for scissor");
        int userInput= sc.nextInt();
        Random ra= new Random();

        int computerInput= ra.nextInt(3);
        if(computerInput==0){
            System.out.println("computer choice---//Rock\\");
        }
        else if (computerInput==1){
            System.out.println("computer choice---//paper\\");
        }
        else {
            System.out.println("computer choice---//scissor\\");
        }

        if(userInput==computerInput){
            System.out.println("Draw");
        }
        else if(userInput==1 && computerInput==0 || userInput==2 && computerInput ==1|| userInput==0 && computerInput==2)
        {
            System.out.println("you win !!!!!!!");
        }
        else {
            System.out.println("you loss....play for next move");
        }
    }
}
