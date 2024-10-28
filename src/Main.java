

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


//Telefonski imenik:
// - Napravi program koji simulira telefonski imenik koristeći dvije paralelne liste
// - Lista u koju se spremaju imena i lista u koju se spremaju brojevi
// - Kod prvog odabira korisnik unosi ime i broj koji se spremaju u svoje liste
// - Korisnik ima mogućnost odabira te za svaki odabir treba omogućiti određenu funkcionalnost sa slike


public class Main {
    public static <Osoba> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listaBrojeva = new ArrayList<>();
        List<String> popisImena = new ArrayList<>();

        System.out.println("Unesite ime ili broj: ");
        int broj = scanner.nextInt();
        var ime = scanner.nextInt();

        for (int i = 0; i < broj; i++) {
            System.out.println("Unesite željenu vrijednost: ");
            listaBrojeva.add(scanner.nextInt());
            popisImena.add(scanner.next());
        }

        int trenutniBroj = listaBrojeva.get(0);

        for (int i = 0; i < listaBrojeva.size(); i++){

        }
    }
}




