

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

    public class Main {
        public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

            Proizvod proizvod = new Proizvod("Mobitel", 200.00);

        BigDecimal cijena = BigDecimal.valueOf(200.00);
        BigDecimal popust = BigDecimal.valueOf(0.80);
        BigDecimal konacnaCijena = cijena.multiply(popust);

    }

}

}
