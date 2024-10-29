

import java.math.BigDecimal;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


//Zadatak_1.
//Tražiti od korisnika da unese količinu novca koju treba dobiti natrag (kusur) od 423,52.
//Ispisati sve novčanice koje morate dati natrag kupcu.
//Apoeni novčanica koje imatea su: 500, 200, 100, 50, 20, 10, 5, 2, 1, o.5, 0.2, 0.1, 0.05, 0.02, 0.01

//Rezultat s primjera: 200, 200, 20, 2, 1, 0,5, 0,02

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Unesite iznos kusura: ");
        BigDecimal iznos = new BigDecimal(scanner.nextLine());
        double[] kusur = racunajKusur(iznos);

        System.out.println(kusur[0] + " novcanica po 200€");
        System.out.println(kusur[1] + " novcanica od 20€");
        System.out.println(kusur[2] + " kovanica od 2€");
        System.out.println(kusur[3] + " kovanica od 1€");
        System.out.println(kusur[4] + " kovanica od 50Centi");
        System.out.println(kusur[5] + " kovanica od 2Centa");


        System.out.println(provjeriKusur(iznos, kusur));

    }


    public static double[] racunajKusur(BigDecimal iznos){
        double[] kusur = {0, 0, 0, 0, 0, 0};

        while (iznos.doubleValue() >= 200){
            iznos =iznos.subtract(new BigDecimal("200")); kusur[0]+=1;
        }
        while (iznos.doubleValue() >= 20){
            iznos = iznos.subtract(new BigDecimal("20")); kusur[1] += 1;

        }
        while (iznos.doubleValue() >= 2){
            iznos = iznos.subtract(new BigDecimal("2")); kusur[2] += 1;
        }

        while (iznos.doubleValue() >= 1){
        iznos = iznos.subtract(new BigDecimal("1")); kusur[3] += 1;

        }
        while (iznos.doubleValue() >= 0.5) {
        iznos = iznos.subtract(new BigDecimal("0.5")); kusur[4] += 1;

        }
        while (iznos.doubleValue() >= 0.02) {
        iznos = iznos.subtract(new BigDecimal("0.02")); kusur[5] += 1;

        }

        return kusur;
    }

    public static boolean provjeriKusur(BigDecimal iznos, double[] kusur){

        double v1 = kusur[0] * 200;
        double v2 = kusur[1] * 20;
        double v3 = kusur[2] * 2;
        double v4 = kusur[3] * 1;
        double v5 = kusur[4] * 0.5;
        double v6 = kusur[5] * 0.02;
        double ukupno = v1 + v2 + v3 + v4 + v5 + v6;
        System.out.println(iznos + " u odnosu na " + ukupno);

        return (iznos.doubleValue() == ukupno);

    }

}




