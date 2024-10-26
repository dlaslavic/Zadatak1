
import java.sql.SQLOutput;
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

        System.out.println("Unesite broj elemenata: ");
        int listabroj = scanner.nextInt();

        for (int i = 0; i < listabroj; i++) {
            System.out.println("Unesite broj: ");
            listaBrojeva.add(scanner.nextInt());
        }

        provjeraSortiranosti(listaBrojeva);
    }

    public static Boolean provjeraSortiranosti(List<Integer> listaBrojeva) {

        Boolean sortirano = true;

        for (int i = 1; i < listaBrojeva.size(); i++) {
            if (listaBrojeva.get(i) < listaBrojeva.get(i - 1)) {
                System.out.println("Lista nije sortirana uzlazno.");
                sortirano = false;
                break;
            }
        }

        if (sortirano){
            System.out.println("Lista je sortirana uzlazno!");
        }

        return sortirano;

        }

    }





