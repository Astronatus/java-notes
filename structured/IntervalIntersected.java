package structured;

import utils.Console;

public class IntervalIntersected {
    public static void main (String[] args) {
        Console console = new Console();
        int min1 = console.readInt("Dame el mínimo: ");
        int max1 = console.readInt("Dame el máximo");

        int min2 = console.readInt("Dame el mínimo: ");
        int max2 = console.readInt("Dame el máximo");

        String isIntersected = "No";

        if( min1 <= min2 && min2 <= max1 
            || min1 <= max2 && max2 <= max1
            || min2 <= min1 && min1 <= max2 
            || min2 <= max1 && max1 <= max2 ) {
                isIntersected = "Sí";
            }

        System.out.println(isIntersected + " existe intersección");
        console.close();
    }
}