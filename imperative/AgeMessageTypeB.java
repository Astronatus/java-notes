package imperative;
import java.util.Scanner;

public class AgeMessageTypeB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qué edad tienes: ");

        int age = sc.nextInt();
        System.out.println(age >= 18 ? "Eres mayor de edad" : "Eres menor de edad" );
        
        sc.close();
    }
}
