

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


//Zadatak_1.
//Kreirajte klasu Proizvod s privatnim atributima:
//naziv (tipa String),
//cijena (tipa BigDecimal)
//popust( tipa BigDecimal)
//Dodajte javni konstruktor za inicijalizaciju naziv i cijena
//Kreirajte public metodu postaviPropust koja omogućava postavljanje popusta u postocima (tip BigDecimal)
//Dodajte public metodu izracunajCijenu koja vraća konačnu cijenu proizvoda nakon što je popust primijenjen.
//U glvanoj klasi kreirajte objekt klase Proizvod, postavite naziv, cijenu i popust te ispišite konačnu cijenu proizvoda.

//Opcionalno:
//Od korisnika traziti unos velicine polja te nakon toga kreirati onoliko objekata koliko je korisnik unio.
//Za svaki proizvod (objekt) potrebno je napraviti sve korake iz glavnog dijela zadatka.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        BigDecimal test = BigDecimal.valueOf(674);
        System.out.println("Upišite za koliko proizvoda želite izračunati popust: ");
        int brojObjekata = scanner.nextInt();

        for (int i = 0; i < brojObjekata; i++){
            izracunajPopust();
        }

    }

    public static void izracunajPopust() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Upišite naziv proizvoda:");
        String nazivProizvoda = scanner.nextLine();

        System.out.println("Upišite cijenu proizvoda:");
        BigDecimal cijenaProizvoda = scanner.nextBigDecimal();

        System.out.println("Upišite popust na cijenu proizvoda:");
        BigDecimal popustProizvoda = scanner.nextBigDecimal();

        Proizvod proizvod = new Proizvod(nazivProizvoda, cijenaProizvoda);

        proizvod.postaviPopust(popustProizvoda);
        System.out.println("Cijena proizvoda nakon popusta je " + proizvod.izracunajCijenu());

    }
}


