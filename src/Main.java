import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Provjeriti teleoperatera preko unesenog broja

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite broj mobitela: ");
        String phoneNumber = scanner.nextLine();

        String  prva3Broja = phoneNumber.substring(0, 3);

        switch (prva3Broja){
            case  "095":
                System.out.println("Telemach");
                break;
            case  "099":
                System.out.println("Simpa");
                break;
            case  "091":
                System.out.println("A1");
                break;
            case  "098":
                System.out.println("HT");
                break;
            default:
                System.out.println("Ostali operateri!");

        }

    }

}
