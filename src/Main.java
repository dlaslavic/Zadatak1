import java.util.Scanner;

//ZAdatak 1. NApišite program koji će izračunati sumu brojeva od 1 do N, gdje je N
// pozitivan cijeli broj unesen od strane korisnika.
// N=10

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int parniBroj=0;
        int neparniBroj=0;

        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0){
                parniBroj++;
            }else{
                neparniBroj++;
            }
        }

        System.out.println("Ukupni zbroj unesenih pozitivnih cijelih brojeva: "  + (parniBroj + neparniBroj));

    }

}