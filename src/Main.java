import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int uneseniBroj1, uneseniBroj2, zbroj;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Odabrani operator: +");

        System.out.println("Molim Vas unesite jedan broj:");
        uneseniBroj1 = scanner.nextInt();

        System.out.println("Molim Vas unesite drugi broj:");
        uneseniBroj2 = scanner.nextInt();

        zbroj = uneseniBroj1 + uneseniBroj2;
        System.out.println(uneseniBroj1 + " + " + uneseniBroj2 + " = " + zbroj);
    }

}