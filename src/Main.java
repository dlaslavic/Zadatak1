import java.util.Scanner;


//Zadatak: Zbrajanje unesenih brojeva dok korisnik ne unese0
//NApiši program koji koristi while petlju i traži od korisnika da uosi brojeve sve dok ne unese 0.
//Program treba ispisati ukupni zbroj svih unesenih brojeva.
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int broj;
        int pogodak = 0;
        int zbroj = 0;

        System.out.println("Unesi broj dok ne pogodis:");
        broj = scanner.nextInt();

        while (broj!=pogodak) {
            zbroj = zbroj + broj;

            System.out.println("Pokusaj ponovo:");
            broj = scanner.nextInt();

        }

        System.out.println("Rezultat je: " + zbroj);
    }

}