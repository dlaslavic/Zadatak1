public class Polaznik {

    private String ime;

    private String prezime;

    private Integer dob;

    private String spol;


    public Polaznik(String imePolaznika, String prezimePolaznika) {
        this.ime = imePolaznika;
        this.prezime = prezimePolaznika;
    }

    public Polaznik(String imePolaznika, String prezimePolaznika, Integer dobPolaznika, String spolPolaznika) {
        this.ime = imePolaznika;
        this.prezime = prezimePolaznika;
        this.dob = dobPolaznika;
        this.spol = spolPolaznika;

    }

    public Polaznik() {

    }


    public String getIme() {
        return this.ime;
    }

    public String getPrezime() {
        return this.prezime;
    }

    public Integer getDob() {
        return this.dob;
    }

    public String getSpol() {
        return this.spol;
    }

    public void promijeniGodinu(Integer novaVrijednostGodine){
        this.dob = novaVrijednostGodine;
    }


}