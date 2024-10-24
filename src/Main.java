
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


//Napraviti funkciju koja provjerava da li je lista uzlazno sortirana.
//Prethodno listu popunjava korisnik svojim unosima.
//Funkcija treba vratiti true ili false.
//Na kraju programa korisniku ispisati da li je lista sortirana ili nije.


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listaBrojeva = new ArrayList<>();

        for (int i = 1; i < 10; i++) {
            listaBrojeva.add(i);
        }

        listaJeSortirana(listaBrojeva);
    }

    public static void listaJeSortirana(List<Integer> listaBrojeva) {

        Boolean rezultat = true;

        for (int i = 1; i < listaBrojeva.size(); i++) {
            if (listaBrojeva.get(i) > listaBrojeva.get(i)) {
                System.out.println("Sortirana nije sortirana uzlazno.");
                sortirano = false;
                break;
            }
        }
        if (sortirano == true)
            System.out.println("Nije sortirana!");
    }

         return sortirano;

}




