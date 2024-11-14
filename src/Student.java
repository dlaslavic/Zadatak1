public class Student {
    private  String ime;
    private  String prezime;
    private  String brojIndeksa;
    private  Double prosjekOcjena;


    public Student (String ime, String prezime, String brojIndeksa){
        this.ime = ime;
        this.prezime = prezime;
        this.brojIndeksa = brojIndeksa;
        this.prosjekOcjena = prosjekOcjena;
    }

    public  String getIme(){
        return this.ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public  String getPrezime() {
        return this.prezime;
    }
    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public  String getBrojIndeksa() {
        return this.brojIndeksa;
    }

    public void setBrojIndeksa(String brojIndeksa) {
        this.prezime = prezime;
    }

    public  Double getProsjekOcjena() {
        return this.prosjekOcjena;
    }
    public void setProsjekOcjena(Double prosjekOcjena) {
        this.prezime = prezime;
    }

    public String getPodaci() {
        return "Ime: " + ime + ", Prezime: " + prezime +
                ", Godina studija: " + brojIndeksa+ ", Prosjek: " + prosjekOcjena;
    }
}
