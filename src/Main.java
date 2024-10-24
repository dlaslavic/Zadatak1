
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> listaBrojeva = new ArrayList<>();

        for (int i = 1; i < 2; i++) {
            listaBrojeva.add(i);
        }

        postojiLiParanBroj(listaBrojeva);
    }

    public static void ispisiVrijednostElementa(Integer element) {
        // Integer element;
        System.out.println("Vrijednost je: " + element);
    }

    public static void postojiLiParanBroj(List<Integer> lista) {

        for (Integer broj : lista) {
            if (broj % 2 == 0) {
                System.out.println("Paran!");
                return;
            }
        }
        System.out.println("Neparan!");

    }

}




