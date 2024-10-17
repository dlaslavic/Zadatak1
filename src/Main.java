import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Provjeriti teleoperatera preko unesenog broja

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite broj mobitela: ");
        String phoneNumber = scanner.nextLine();

        Boolean a1 = phoneNumber.startsWith("091");
        Boolean ht = phoneNumber.startsWith("098");

        if (phoneNumber.startsWith("091")){
            System.out.println("A1");
        } else if (phoneNumber.startsWith("098")){
            System.out.println("HT");
        } else if (phoneNumber.startsWith("095")){
            System.out.println("Telemach");
        } else if (phoneNumber.startsWith("099")) {
            System.out.println("Simpa");

        }

    }

}
