
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {
    static List<Zaposlenik> zaposlenici = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;

            do {
            System.out.println("Za unos stalnog zaposlenika birajte 1 za unos sezonskog zaposlenika birajte 2, " +
                    "za prekid unosa odaberi 3");

            number = scanner.nextInt();

            if (number == 3) {
                break;
            }

            System.out.println("Ime zaposlenika : ");
            String ime = scanner.next();


            System.out.println("Osnovna placa : ");
            BigDecimal placa = scanner.nextBigDecimal();


            System.out.println("Broj radnih sati : ");
            Double brojRadnihSati = scanner.nextDouble();

            switch (number) {
                case 1:
                    unosStalnogZaposlenika(ime, placa, brojRadnihSati);
                    break;
                case 2:
                    unosSezonskogZaposlenika(ime, placa, brojRadnihSati);
                    break;
                default:
                    System.out.println("Pogresan unos pokusaj ponovo");

                }

        } while (true);

        System.out.println("Lista zaposlenika: ");
        for (Zaposlenik zaposlenik : zaposlenici) {
            System.out.println(zaposlenik.toString() + " izracun place sa bonusom " + zaposlenik.izracunPlace());
        }
        //Ovo je duza verzija for petlje preko indexa
        //for (int i = 0; i< zaposlenici.size(); i++){
        //zaposlenici.get(i).toString();
        }

        // Spremili smo oba tipa zaposlenika u jednu listu kako bi imali samo u jednoj listi sve zaposlenike te
        // izbjegli dvije for petlje za ispis


        public static void unosStalnogZaposlenika(String ime, BigDecimal placa, Double brojRadnihSati) {
        Zaposlenik stalniZaposlenik = new StalniZaposlenik(ime, placa, brojRadnihSati);
        zaposlenici.add(stalniZaposlenik);
        }

        public static void unosSezonskogZaposlenika(String ime, BigDecimal placa, Double brojRadnihSati) {
        Zaposlenik sezonskiZaposlenik = new SezonskiZaposlenik(ime, placa, brojRadnihSati);
        zaposlenici.add(sezonskiZaposlenik);

    }

}


