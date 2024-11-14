public class Student {
    private final String ime;
    private final String prezime;
    private final String brojIndeksa;


    public Student(String ime, String prezime, String brojIndeksa) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojIndeksa = brojIndeksa;

    }

    public void ispisiSveVrijednosti() {
        System.out.println("Ime: " + this.ime);
        System.out.println("Prezime: " + this.prezime);
        System.out.println("Broj indeksa: " + this.brojIndeksa);
    }

}

