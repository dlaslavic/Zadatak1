import java.util.Scanner;

//Zadatak: Dodavanje i ispis parnih brojeva.
//Korisnik unosi 10 brojeva, a program sprema samo parne brojeve u novo polje i zatim ih ispisuje.
//U programu se ne koristi FOR petlja.

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite 10 brojeva: ");

        int[] uneseniBrojevi = new int[10];
        int indexParnihBrojeva = 0;
        int brojParnihBrojeva = 0;
        int i = 0;

        while (i<uneseniBrojevi.length){
            System.out.println("Unesite " + (i + 1) + ". broj:");
            uneseniBrojevi[i] = scanner.nextInt();
            if (uneseniBrojevi[i] % 2 == 0){
                brojParnihBrojeva++;
            }
            i++;
        }

        int[] parniBrojevi = new int[brojParnihBrojeva];
        i = 0;

        while (i < uneseniBrojevi.length){
            if (uneseniBrojevi[i] % 2 == 0){
                parniBrojevi[indexParnihBrojeva] = uneseniBrojevi[i];
                indexParnihBrojeva = indexParnihBrojeva + 1;
            }

            i  = i + 1;
        }

        i = 0;

        while (i < parniBrojevi.length){
            System.out.println("Rezultat je: " + parniBrojevi[i]);
            i++;

        }

    }

}
