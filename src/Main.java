import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Tražiti od korisnika unos liste stringova sve dok ne napiše "Stop". Nakon toga izbrojati koliko stringova sadrži
//riječ "Java".
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //var test1 = !true;
        //var test2 = !false;

        List<String> lista = new ArrayList<>();
        String uneseniString;
        Integer brojac = 0;

        do {
            System.out.println("Unesite string: ");
            uneseniString = scanner.nextLine();
            lista.add(uneseniString);
        }while (!uneseniString.equals("Stop"));

        for (int i = 0; i< lista.size(); i++){
            if (lista.get(i).contains("Java"));{
                brojac++;
            }
        }

        System.out.println("Broj recenica koje sadrze Java rijec je: " + brojac);
    }

}
