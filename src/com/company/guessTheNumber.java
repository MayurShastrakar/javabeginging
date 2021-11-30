package com.company;

import java.util.Scanner;
import java.util.Random;
class game{
        int UserInput;
        int ComInput;
        int num=0;

          void game() {
               Random ra = new Random();
                ComInput = ra.nextInt(100);
           }
           int takeUserInput(){
              Scanner sc=new Scanner(System.in);
               System.out.println("Guess the number!");
              UserInput=sc.nextInt();
              return UserInput;
          }
          boolean IsCorrectNumber(){
              num++;
              if (UserInput==ComInput) {
                  System.out.printf("you guess the perfect number %d !!\n Your attemt is %d ", UserInput,num);
                  return true;
              }
              else if (UserInput<ComInput){
                  System.out.println("too small....,try again..");
              }
              else if ( UserInput > ComInput ){
                  System.out.println("too large....,try again..");
              }
              return false;
          }
          public int getNoOfGuesse(int num){
              return num;
          }
          public void setNoOfGuesse(int num){
             this.num=num;
          }



     }
public class guessTheNumber {
    public static void main(String[] args) {
        game g=new game();
        boolean b =true;
        while (b){
        g.takeUserInput();
        g.game();
        g.IsCorrectNumber();
        }

    }

}
