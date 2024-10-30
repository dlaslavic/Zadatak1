

import java.math.BigDecimal;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {

    /* STATISTIKA RIJECI
     * Napravi program koji učitava rečenicu i ispisuje:
     * 1. Sve riječi duže od 5 slova
     * 2. Najduzu rijec
     * 3. Prosjecnu duljinu rijeci
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesi neku rečenicu: ");
        String unesenaRecenica = scanner.nextLine();

        List<String> recenicaLista = new ArrayList<>();

        for (String rijec : unesenaRecenica.split(" ")) {
            recenicaLista.add(rijec);
        }

        List<String> rijeciDuzeOdPet = rijeciDuzeOdPetSlova(recenicaLista);
        String najduzaRijec = najduzaRijec(recenicaLista);
        float prosjekDuljine = prosjecnaDuljinaRijeci(recenicaLista); //4.5

        System.out.println("Riječi duže od 5 slova: " + rijeciDuzeOdPet);
        System.out.println("Najduža riječ: " + najduzaRijec);
        System.out.printf("Prosječna duljina riječi: " + prosjekDuljine);
    }

    private static List<String> rijeciDuzeOdPetSlova(List<String> rijeci) {
        List<String> duzeOdPet = new ArrayList<>();

//        for (int i = 0; i < rijeci.size(); i++){
//            if (rijeci.get(i).length() > 5) {
//                duzeOdPet.add(rijeci.get(i));
//            }
//        }

        for (String rijec : rijeci) {
            if (rijec.length() > 5) {
                duzeOdPet.add(rijec);
            }
        }
        return duzeOdPet;
    }

    private static String najduzaRijec(List<String> rijeci) {
        String najduza = "";
        for (String rijec : rijeci) {
            if (rijec.length() > najduza.length()) {
                najduza = rijec;
            }
        }
        return najduza;
    }

    private static float prosjecnaDuljinaRijeci(List<String> rijeci) {
        float ukupnaDuljina =18;
        for (String rijec : rijeci) {
            ukupnaDuljina = ukupnaDuljina + rijec.length();
        }
        float rezultat = ukupnaDuljina / rijeci.size(); // 4.5

        return rezultat; // 4.5
    }
}



