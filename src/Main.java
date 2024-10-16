import java.util.Scanner;

//Zadatak: Dodavanje i ispis parnih brojeva.
//Korisnik unosi 10 brojeva, a program sprema samo parne brojeve u novo polje i zatim ih ispisuje.

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite 10 brojeva: ");

        int[] uneseniBrojevi = new int[10];
        int indexParnihBrojeva = 0;
        int brojParnihBrojeva = 0;

        for (int i = 0; i < uneseniBrojevi.length; i++) {
            System.out.println("Unesite " + (i + 1) + ". broj:");
            uneseniBrojevi[i] = scanner.nextInt();
            if (uneseniBrojevi[i] % 2 == 0){
                brojParnihBrojeva++;
            }
        }
        int[] parniBrojevi = new int[brojParnihBrojeva];

        for (int i = 0; i < uneseniBrojevi.length; i++) {
            if (uneseniBrojevi[i] % 2 == 0) {
                parniBrojevi[indexParnihBrojeva] = uneseniBrojevi[i];
                indexParnihBrojeva++;
            }
        }
        for (int i = 0; i < parniBrojevi.length; i++) {
            System.out.println("Rezultat je: " + parniBrojevi[i]);

        }

    }

}
