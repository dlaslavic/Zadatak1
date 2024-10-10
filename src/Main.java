import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokusaj;
        int pogodak=7;

        do {
            System.out.println("Unesite broj:");
            pokusaj = scanner.nextInt();
        }while (pokusaj != pogodak);

        System.out.println("Pogodak!!!!");



    }

}