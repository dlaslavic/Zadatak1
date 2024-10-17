import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite koliko elemenata zelite popuniti: ");

        int n = scanner.nextInt();

        int[] staroPolje = new int[10];
        List polje = new ArrayList<>();

        var test = staroPolje.length;
        var test1 = polje.size();

        for (int i = 0; i < n; i++){
            System.out.println("Unesite vrijednost" + (i + 1) + ". elementa: ");
            int uneseniElement = scanner.nextInt();
            polje.add(uneseniElement);
        }

        for (int i = 0; i < polje.size(); i++){
            System.out.println("Vrijednost elementa " + (i+ 1) + " je " + polje.get(i));

        }

    }

}
