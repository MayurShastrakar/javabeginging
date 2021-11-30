package com.company.formula;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class payment {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double num= sc.nextDouble();
        Locale.setDefault(new Locale("en","IN"));
        String india= NumberFormat.getCurrencyInstance().format(num);
        Locale.setDefault( Locale.CHINA);

        String china= NumberFormat.getCurrencyInstance().format(num);
        Locale.setDefault( Locale.FRANCE);

        String france= NumberFormat.getCurrencyInstance().format(num);
        Locale.setDefault( Locale.US);
        String us= NumberFormat.getCurrencyInstance().format(num);


        System.out.println("US:"+ us);
        System.out.println("India:"+ india);
        System.out.println("China:"+ china);
        System.out.println("France:"+ france);
    }
}
