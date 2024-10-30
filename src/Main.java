

import java.math.BigDecimal;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Pas pasRex = new Pas("Rex", "Njemacki ovcar", 10);
        Pas pasOskar = new Pas("Oskar", "Labrador", 5);

        String ime1 = pasRex.dohvatiIme();
        String pasmina1 = pasRex.dohvatiPasminu();
        String goidna1 = pasRex.dohvatiGodinuUStringu();

        String ime2 = pasOskar.dohvatiIme();
        String pasmina2 = pasOskar.dohvatiPasminu();
        Integer goidna2 = pasOskar.dohvatiGodinu();

        Integer staraGodina = pasOskar.dohvatiGodinu();

        pasOskar.promjeniGodinu(7);

        Integer novaGodina = pasOskar.dohvatiGodinu();

        System.out.println(pasRex.dohvatiIme());
        System.out.println(pasOskar.dohvatiIme());

    }
}
