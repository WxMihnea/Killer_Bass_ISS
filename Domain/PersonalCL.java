package Domain;

public class PersonalCL {
    private Integer IDpersonal;
    private String functie;
    private String prenume;
    private String nume;
    private String nrTelefon;

    public PersonalCL(Integer IDpersonal, String functie, String prenume, String nume, String nrTelefon) {
        this.IDpersonal = IDpersonal;
        this.functie = functie;
        this.prenume = prenume;
        this.nume = nume;
        this.nrTelefon = nrTelefon;
    }

    public Integer getIDpersonal() {
        return IDpersonal;
    }

    public void setIDpersonal(Integer IDpersonal) {
        this.IDpersonal = IDpersonal;
    }

    public String getFunctie() {
        return functie;
    }

    public void setFunctie(String functie) {
        this.functie = functie;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getNrTelefon() {
        return nrTelefon;
    }

    public void setNrTelefon(String nrTelefon) {
        this.nrTelefon = nrTelefon;
    }

    @Override
    public String toString() {
        return "PersonalClinica{" +
                "IDpersonal=" + IDpersonal +
                ", functie='" + functie + '\'' +
                ", prenume='" + prenume + '\'' +
                ", nume='" + nume + '\'' +
                ", nrTelefon='" + nrTelefon + '\'' +
                '}';
    }
}

