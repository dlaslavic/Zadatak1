import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Od korisnika tražiti da unese 5 stringova te ispisati samo stringove koji se jednake duljine kao prvi string.

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> lista = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Unesite vrijednost: ");
            String unesenaVrijednost = scanner.nextLine();
            lista.add(unesenaVrijednost);
        }

        String prviElement = lista.get(0);
        for (int i = 0; i < lista.size(); i++){
            if (prviElement.length()==lista.get(i).length()) {
                System.out.println(lista.get(i));

            }

       }


    }

}
