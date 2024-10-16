import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite veličinu polja: ");

        int velicinaPolja = scanner.nextInt();
        int[] polje = new int[velicinaPolja];


        for (int i = 0; i<polje.length; i++) {
            System.out.println("Unesite vrijednost elemenata " + i + 1 + ". elementa:");
            polje[i] = scanner.nextInt();

        }

        int maxElement = polje[0];
        for (int i = 0; i < polje.length; i++) {
            if (polje[i] > maxElement) {
                maxElement = polje[i];
            }
        }

        System.out.println("Maximalni element polja je: " + maxElement);

    }
}
