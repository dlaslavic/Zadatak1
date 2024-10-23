
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Zadatak1.Zamjena najvećeg i najmanjeg broja u List-i.
//Napiši program koji od korisnika traži unos brojeva i sprema ih u Listu.
//Pronađi najmanji i najveći broj, zamjeni ih međusobno i isši u novu listu.

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite koliko elemenata zelite popuniti: ");

        int n = scanner.nextInt();
        List<Integer> polje = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            System.out.println("Unesite vrijednost" + (i + 1) + ". elementa: ");
            int uneseniElement = scanner.nextInt();
            polje.add(uneseniElement);
        }

        int minUneseniBroj = polje.get(0);
        int maxUneseniBroj = polje.get(0);

        for (int i = 0; i < polje.size(); i++) {
            if (polje.get(i) < minUneseniBroj) {
                minUneseniBroj = polje.get(i);
            } else if (polje.get(i) > maxUneseniBroj) {
                maxUneseniBroj = polje.get(i);
            }
        }
        System.out.println("Maksimalna vrijednost elementa " + " je " + maxUneseniBroj);
        System.out.println("Minimalna vrijednost elementa " + " je " + minUneseniBroj);

    }
}



