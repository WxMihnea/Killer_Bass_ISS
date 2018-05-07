package Domain;

public class Boli {
    private Integer IDboala;
    private String denumire;
    private String descriere;

    public Boli(Integer IDboala, String denumire, String descriere) {
        this.IDboala = IDboala;
        this.denumire = denumire;
        this.descriere = descriere;
    }

    public Integer getIDboala() {
        return IDboala;
    }

    public void setIDboala(Integer IDboala) {
        this.IDboala = IDboala;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    @Override
    public String toString() {
        return "Boli{" +
                "IDsange=" + IDboala +
                ", denumire='" + denumire + '\'' +
                ", descriere='" + descriere + '\'' +
                '}';
    }
}
