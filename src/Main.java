
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//ZADATAK_Provjera da li lista sadrži duplikate
//Tražiti od korisnika da unese broj elemenata u listi te popuni elemente liste.
//Nakon toga, pretražiti po listi da li postoji ijedan duplikat, ukoliko postoji ijedan duplikat, ukoliko postoji
// ispisi vrijednost true, ukoliko ne postoji ispisi vrijednot false.


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite koliko elemenata zelite popuniti: ");

        int n = scanner.nextInt();
        List<Integer> brojevi = new ArrayList<>();

        System.out.println("Unesite brojeve:");
        for (int i = 0; i < 10; i++) {
            brojevi.add(scanner.nextInt());
        }

        Boolean duplikat = false;

        for (int i = 0; i < brojevi.size(); i++) {
            int trenutniBroj = brojevi.get(i);

            for (int j = i + 1; j < brojevi.size(); j++) {
                if (i != j) {
                    if (brojevi.get(j) == trenutniBroj) {
                        System.out.println("True");
                        duplikat = true;
                        break;
                    }
                }

                if (duplikat) {
                    break;
                }
            }

            if (!duplikat) {        //!duplikat = false
                System.out.println("False");
            }
        }
    }
}



