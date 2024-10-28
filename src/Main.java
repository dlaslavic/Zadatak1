

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


//Testni primjer stringa 1.2

public class Main {
    public static <Osoba> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String nekiString = "Ovo je testni primjerak stringa 1.2";
        Integer brojacSlova = 0;

        for (int i = 0; i < nekiString.length(); i++) {
            char character = nekiString.charAt(i);
            boolean daLiJeSlovo = Character.isLetter(character);
            boolean daLiJeBroj = Character.isDigit(character);
            String stringCharacter = String.valueOf(character);

            if (stringCharacter.equals(" ")) {
                continue;
            }

            if (daLiJeSlovo == true) {
                System.out.println(character + " Slovo");
                brojacSlova++;
            } else if (daLiJeBroj == true) {
                System.out.println(character + " Broj");
            } else {
                System.out.println(character + " Znak");
            }


            System.out.println(brojacSlova);
        }
    }
}




