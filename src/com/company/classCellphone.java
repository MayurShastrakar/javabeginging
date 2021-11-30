//crete a CLASS cellphone with methode to print "ringing...", "vibrating..
package com.company;
 class cellphone{
public void ring(){
    System.out.println("ringing.....");
}
public void vibrate(){
    System.out.println("vibrating.....");
}
public void call(){
    System.out.println("calling a friend nishant" +
            ".....");
}

 }
public class classCellphone {
    public static void main(String[] args) {
        cellphone vivo= new cellphone();
        vivo.call();
        vivo.vibrate();
        vivo.ring();
    }
}
