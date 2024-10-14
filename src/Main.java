import java.util.Scanner;

//ZAdatak 1. NApišite program koji će izračunati sumu brojeva od 1 do N, gdje je N
// pozitivan cijeli broj unesen od strane korisnika.
// N=10

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int brojZnamenki;
        int broj;

        System.out.println("Unesite jedan cijeli broj: ");
        int odabir = scanner.nextInt();

        brojZnamenki = 0;
        broj = 123456;

        while (broj != 0) {
            ++brojZnamenki;
            broj /= 10;
        }

        System.out.println("Broj znamenki upisanog broja: " + brojZnamenki);

    }

}