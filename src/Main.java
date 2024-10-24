
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite prvi broj: ");
        int prviBroj = scanner.nextInt();
        ispisiVrijednostElementa(prviBroj);

        System.out.println("Unesite drugi broj: ");
        int drugiBroj = scanner.nextInt();
        ispisiVrijednostElementa(drugiBroj);

        Integer rezultatOduzimanja = oduzmiBrojeve(prviBroj, drugiBroj);

        System.out.println("Rezultat je: " + rezultatOduzimanja);
        }

        public static void ispisiVrijednostElementa(Integer element){
        // Integer element;
        System.out.println("Vrijednost je: " + element);
        }

        public static Integer oduzmiBrojeve(Integer element1, Integer element2){
        Integer rezultat = element1 - element2;
        return rezultat;


    }
}



