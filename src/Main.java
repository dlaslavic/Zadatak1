
import java.io.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Napravite klsu student s osnovnim informacijama (ime, prezime, brIndexa).
//Napravite 3 studenta unutar maina te zapišite sve informacije o svakom studentu u datoteku koja
//se naziva student.txt.
//Ispišite sve podatke u datoteku da bude pregleedno i citljivo.
//Nakon upisa u datoteku na kraju prebrojite koliko je slova zapisao u datoteci te ispišite tu informaciju korisniku.


public class Main {

    public static void main(String[] args) throws IOException {

        Student student1 = new Student("Pero", "Perić", "012");
        Student student2 = new Student("Ivo", "Ivić", "013");
        Student student3 = new Student("Jura", "Jurić", "014");

        Reader in = new StringReader("Student");
        Writer out = new FileWriter("student.txt");
        PrintWriter easyOut = new PrintWriter(out);

        easyOut.println(student1);
        easyOut.write("\n");
        easyOut.println(student2);
        easyOut.write("\n");
        easyOut.println(student3);

        int i = 0;

        int nextChar;
        while ((nextChar = in.read()) != -1){
            out.write(nextChar);
            i++;
            System.out.println("ASCII znakova u fileu je: " + nextChar);
        }

        easyOut.close();

    }

}


