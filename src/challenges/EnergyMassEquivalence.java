package challenges;

import java.util.Formatter;
import java.util.Scanner;
import java.math.BigDecimal;

public class EnergyMassEquivalence{

    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        double x=Sc.nextDouble();
        long c=300000000;

        double E = Math.abs(x * c*Math.pow(10,8));

        System.out.println(BigDecimal.valueOf(E).toPlainString());

    }


}
