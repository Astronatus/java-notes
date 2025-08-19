package imperative;

import java.util.Scanner;

public class AgeMessageTypeA {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu edad:");

        final int AGE = sc.nextInt();
        final int AGE_MAJORITY = 18;
        System.out.println(AGE >= AGE_MAJORITY ? "Eres mayor de edad" : "Eres menor de edad");

        sc.close();
    }
}
