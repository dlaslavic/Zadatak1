

import java.math.BigDecimal;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Polaznik polaznik1 = new Polaznik("Jura", "Juric");
        Polaznik polaznik2 = new Polaznik("Pero", "Peric", 45, "Musko");
        Polaznik polaznik3 = new Polaznik("Miro", "Miric");



        String ime = polaznik1.getIme();
        String prezime = polaznik1.getPrezime();

        Integer dob2 = polaznik2.getDob();
        polaznik2.promijeniGodinu(42);
        Integer novaDob2 = polaznik2.getDob();

        String ime3 = polaznik3.getIme();
        String prezime3 = polaznik3.getPrezime();

        System.out.println(polaznik1.getIme());
        System.out.println(polaznik1.getPrezime());


    }
}
