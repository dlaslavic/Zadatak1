

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Upravljanje bankovnim računom
//Kreirati klasu Racun koja sadrži atribute: brojRacuna(String), stanje (BigDecimal) i vlasnik (String).
//Kreirati dvije izvedene klase:
// - TekuciRacun, na kojemmu se obracunavaku kamate s fiksnom ktma 0.1%.
// - StedniRacun, na kojemu se obracunavaju kamate s fiksnom ktma stopom od 1.5%.

//Na svaku racun korisnik mora moci uplatiti i isplatiti novac, te ima metodu obracunKamate koja ce obračunavati ktme
//na trenutno stanje na računu (ovisno o kojem je tipu računa riječ) te nadodati izračunati iznos na trenutno stanje i
//poslije toga ispisati koliko iznosi kamata i koliko je trenutno stanje.

//Kreirati par računa u main klasi, napraviti par uplata/isplata te obračunati ktme za napravljene račune.


    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);


        Racun racun = new Racun("", "", "");



        
    }
}


