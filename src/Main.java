import java.util.HashSet;
import java.util.TreeSet;



public class Main {
    public static void main(String[] args) {
        kreirajStudente();
        kreirajGradove();
        kreirajZaposlenike();
    }

    static void  kreirajStudente() {
        HashSet<String> studenti = new HashSet<>();
        studenti.add("Marko");
        studenti.add("Ivo");
        studenti.add("Ana");
        studenti.add("Borna");

        if (studenti.contains("Borna")) {
            System.out.println("Borna postoji");
        } else {
            System.out.println("Borna NE postoji");
        }
        System.out.println(studenti);
        studenti.remove("Borna");
        System.out.println(studenti);
    }

    static void kreirajGradove() {
        TreeSet<String> gradovi = new TreeSet<>();
        gradovi.add("Zagreb");
        gradovi.add("Rijeka");
        gradovi.add("Osijek");
        gradovi.add("Split");

        System.out.println(gradovi);
        System.out.println("Prvi grad je " + gradovi.first());
        System.out.println("Zadnji grad je " + gradovi.last());
        gradovi.remove("Rijeka");
        System.out.println(gradovi);
    }

    static void kreirajZaposlenike() {
        HashSet<String> zaposleniciA = new HashSet<>();
        zaposleniciA.add("Marko");
        zaposleniciA.add("Ivo");
        zaposleniciA.add("Ana");
        zaposleniciA.add("Borna");

        HashSet<String> zaposleniciB = new HashSet<>();
        zaposleniciB.add("Lara");
        zaposleniciB.add("Jura");
        zaposleniciB.add("Borna");
        zaposleniciB.add("Dejan");

        System.out.println(zaposleniciA);
        System.out.println(zaposleniciB);

        for (String zaposlenik : zaposleniciA) {
            if (zaposleniciB.contains(zaposlenik)) {
                System.out.println(zaposlenik + " radi u oba odjela");
            }
        }
        for (String zaposlenik : zaposleniciA) {
            if (!zaposleniciB.contains(zaposlenik)) {
                System.out.println(zaposlenik + " radi SAMO u odjelu A");
            }
        }
    }

}