import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int parniBroj = 0;
        int neparniBroj= 0;

        for (int i=1; i < 100; i++){
            if (i % 2 == 0){
                parniBroj++;
            }else{
                neparniBroj++;
            }
        }
        System.out.println("Broj parnih brojeva je: " + parniBroj);
        System.out.println("Broj neparnih brojeva je: " + neparniBroj);
    }

}