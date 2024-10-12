import java.util.Scanner;

//Tražiti od korisnika da odabere broj od 1 do 4 (svaki broj će označavati pojedinu
// matematičku radnju: 1=zbrajanje, 2=oduzimanje, 3=množenje i 4=dijeljenje)
//Ovisno o korisnikovom odabiru, potrebno je ispisati rezultat s pripadajućom
//porukom koja je matematičkaradnja obavljena.

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Odaberite broj od 1 do 4 za matematičku radnju:");

        System.out.println("1 = Zbrajanje");
        System.out.println("2 = Oduzimanje");
        System.out.println("3 = Množenje");
        System.out.println("4 = Dijeljenje");

        int odabirRadnje = scanner.nextInt();

        System.out.println("Unesite prvi broj:");
        double broj1 = scanner.nextDouble();
        System.out.println("Unesite drugi broj:");
        double broj2 = scanner.nextDouble();

        if (odabirRadnje == 1) {
            System.out.println("Rezultat zbrajanja je: " + (broj1 + broj2));
        } else if (odabirRadnje == 2) {
            System.out.println("Rezultat oduzimanja je: " + (broj1 - broj2));
        } else if (odabirRadnje == 3) {
            System.out.println("Rezultat množenja je: " + (broj1 * broj2));
        } else if (odabirRadnje == 4) {
            System.out.println("Rezultat dijeljenja je: " + (broj1 / broj2));
        } else {
            System.out.println("Nevažeći odabir. Pokušajte ponovno.");
        }

    }

}