import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxBroj = 10;
        int[] uneseniBrojevi = new int[4];

        System.out.println("Unesi 4 cijela broja: ");
        System.out.println("Prvi broj: ");


        for (int i = 0; i <= uneseniBrojevi.length; i++) {
            System.out.println(i + 1 + ". broj: ");
            uneseniBrojevi[0] = scanner.nextInt();

        }
        for (int broj : uneseniBrojevi) {
            if (broj > maxBroj) {
                System.out.println("Broj koji je veći od 10: " + broj);
            }
        }

    }
}
