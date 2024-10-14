import java.util.Scanner;

//ZAdatak 1. NApišite program koji će izračunati sumu brojeva od 1 do N, gdje je N
// pozitivan cijeli broj unesen od strane korisnika.
// N=10

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int unesiBroj;
        int zbrojPokusaja=10;

        do {
            System.out.println("Unesite pozitivni broj od 1 do 10:");
            unesiBroj = scanner.nextInt();

        }while (unesiBroj>10 || unesiBroj<1);

        System.out.println("Ispiši ukupni zbroj pokušaja unosa: " + (zbrojPokusaja++));
        System.out.println("Ispiši konačni zbroj: " + (unesiBroj++));


    }

}