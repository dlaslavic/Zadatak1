

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Kreirajte program koji omogućava unos, pregled i analizu podataka o studentima. Svaki student ima svoje ime, prezime, broj indeksa i prosjek ocjena.
//Zahtjevi:
//Kreiranje klase Student:
//Kreirajte klasu Student s privatnim atributima:
//ime (tipa String)
//prezime (tipa String)
//brojIndeksa (tipa String)
//prosjekOcjena (tipa double)
//Dodajte konstruktor koji inicijalizira sve atribute.
//Kreirajte metode getIme(), getPrezime(), getBrojIndeksa(), i getProsjekOcjena() kako bi omogućili dohvaćanje tih vrijednosti.
//Glavna klasa:
//U glavnoj klasi, kreirajte listu ArrayList<Student> kako biste pohranili sve unesene studente.
//Koristite metodu Scanner za unos podataka o studentima.
//Funkcionalnosti programa:
//Unos podataka: Omogućite korisniku unos podataka za više studenata. Nakon unosa svakog studenta, korisnik treba imati opciju da unese još jednog ili završi unos.
//Ispis svih studenata: Nakon unosa svih studenata, ispišite popis sa svim podacima o studentima.
//Analiza podataka:
//Pronađite i ispišite podatke o studentu s najvišim prosjekom.
//Pronađite i ispišite podatke o studentu s najnižim prosjekom.
//Ispišite prosjek ocjena svih studenata.


    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);


        ArrayList<Student> listaStudenata = new ArrayList<Student>();
        Student student1 = new Student("", "", "", 0.0);


        System.out.println("Upišite koliko studenata želite upisati: ");
        int brojStudenata = scanner.nextInt();

         }

    }
        public static void podaciStudenta() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Upišite ime studenta:");
            String ime = scanner.nextLine();

            System.out.println("Upišite prezime studenta:");
            String prezime = scanner.nextLine();

            System.out.println("Upišite broj indeksa studenta:");
            String brojIndeksa = scanner.nextLine();

            System.out.println("Upišite prosjek ocjena:");
            Double prosjekOcjena = scanner.nextDouble();

    }
}


