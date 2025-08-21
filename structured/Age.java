package structured;

import java.util.Scanner;

public class Age {
    public static void main (String[] args) {
        Scanner log = new Scanner(System.in);

        System.out.println("Dame tu edad: ");
        int age = log.nextInt();

        int previous = age - 1;
        int next = age + 1;

        String preffix = "E";

        if (age == 0) {
            preffix = preffix + "l año pasado tenías " + previous + " año" + (previous != 1 ? "s" : "") + " y e";
        }
        System.out.println(preffix + "l año que viene tendrás " + next + " año" + (next != 1 ? "s": ""));

        log.close();
    }
}