package H02;

import java.util.Scanner;

public class H2Opdracht5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("OPDRACHT 2.5\n");
        System.out.print("Typ een getal tussen 0 en 1000: ");
        int userInput = scanner.nextInt();

        int rest = userInput % 10;
        userInput = userInput / 10;

        int mid = userInput % 10;
        userInput = userInput / 10;

        int first = userInput;

        int answer = first * mid * rest;

        System.out.println("De vermenigvuldiging van de cijfers luidt: " + first + " x " + mid + " x " + rest + " = " + answer);



    }
}
