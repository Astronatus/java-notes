package structured;

import java.util.Scanner;

public class Numbers {
    public static void main (String[] args) {
         Scanner log = new Scanner(System.in);

        System.out.println("Escribe un número: ");
        int number = log.nextInt();

        String parity = "impar";
        
        if(number % 2 ==0 ) {
            parity = "par";
        }
        
        System.out.println("El número "+ number + " es " + parity);
        log.close();
    }
}
