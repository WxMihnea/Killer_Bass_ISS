package Domain;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Donator {
    private Integer donatorID;
    private String nume;
    private String prenume;
    private String cnp;
    private String dataNasterii;
    private String nrTelefon;
    private String email;
    private String judet;
    private String oras;
    private String strada;
    private Integer apartament;
    private String bloc;
    private String scara;
    private Integer numar;
    private String codPostal;

    public Donator(Integer donatorID, String nume, String prenume, String cnp, String dataNasterii, String nrTelefon, String email, String judet, String oras, String strada, Integer apartament, String bloc, String scara, Integer numar, String codPostal) {
        this.donatorID = donatorID;
        this.nume = nume;
        this.prenume = prenume;
        this.cnp = cnp;
        this.dataNasterii = dataNasterii;
        this.nrTelefon = nrTelefon;
        this.email = email;
        this.judet = judet;
        this.oras = oras;
        this.strada = strada;
        this.apartament = apartament;
        this.bloc = bloc;
        this.scara = scara;
        this.numar = numar;
        this.codPostal = codPostal;
    }

    public Integer getDonatorID() {
        return donatorID;
    }

    public void setDonatorID(Integer donatorID) {
        this.donatorID = donatorID;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public String getDataNasterii() {
        return dataNasterii;
    }

    public void setDataNasterii(String dataNasterii) {
        this.dataNasterii = dataNasterii;
    }

    public String getNrTelefon() {
        return nrTelefon;
    }

    public void setNrTelefon(String nrTelefon) {
        this.nrTelefon = nrTelefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJudet() {
        return judet;
    }

    public void setJudet(String judet) {
        this.judet = judet;
    }

    public String getOras() {
        return oras;
    }

    public void setOras(String oras) {
        this.oras = oras;
    }

    public String getStrada() {
        return strada;
    }

    public void setStrada(String strada) {
        this.strada = strada;
    }

    public Integer getApartament() {
        return apartament;
    }

    public void setApartament(Integer apartament) {
        this.apartament = apartament;
    }

    public String getBloc() {
        return bloc;
    }

    public void setBloc(String bloc) {
        this.bloc = bloc;
    }

    public String getScara() {
        return scara;
    }

    public void setScara(String scara) {
        this.scara = scara;
    }

    public Integer getNumar() {
        return numar;
    }

    public void setNumar(Integer numar) {
        this.numar = numar;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    @Override
    public String toString() {
        return "Donator{" +
                "donatorID=" + donatorID +
                ", nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", cnp=" + cnp +
                ", dataNasterii='" + dataNasterii + '\'' +
                ", nrTeelefon='" + nrTelefon + '\'' +
                ", email='" + email + '\'' +
                ", judet=" + judet +
                ", oras=" + oras +
                ", strada=" + strada +
                ", apartament=" + apartament +
                ", bloc=" + bloc +
                ", scara=" + scara +
                ", numar=" + numar +
                ", codPostal=" + codPostal +
                '}';
    }

}

