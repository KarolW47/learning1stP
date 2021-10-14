package pl.astralkarolwaw;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Random random = new Random();

        boolean wannaPlayMore = true;

        while (wannaPlayMore){
            int drawnNumber = random.nextInt(1,101);
            boolean guessed = false;

            System.out.println("Odgadnij liczbe od 1 do 100");
            System.out.println("Masz 10 prob");

            while (!guessed) {
                for (int i = 1; i < 11; i++) {
                    System.out.println("Szansa numer " + i + "/10, wprowadz liczbe:");
                    int typedNumber = scanner.nextInt();

                    if (typedNumber == drawnNumber) {
                        System.out.println("Trafiony zatopiony!");
                        guessed = true;
                        break;
                    } else if (i == 10) {
                        System.out.println("Wyczerpana została liczba prob.");
                        guessed = true;
                        break;
                    } else if (typedNumber < drawnNumber) {
                        System.out.println("Wylosowany numer jest wiekszy.");
                    } else {
                        System.out.println("Wylosowany numer jest mniejszy.");
                    }
                }
            }
            System.out.println("Czy chcesz zagrać jeszcze raz? (t/n)");
            String answer = scanner1.nextLine();
            if(!answer.equals("t")){
                System.out.println("Bye Bye.");
                wannaPlayMore = false;
            }
        }
    }
}
