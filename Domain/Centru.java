package Domain;

public class Centru {
    private Integer IDcentru;
    private String nume;

    public Centru(Integer IDcentru, String nume) {
        this.IDcentru = IDcentru;
        this.nume = nume;
    }

    public Integer getIDcentru() {
        return IDcentru;
    }

    public void setIDcentru(Integer IDcentru) {
        this.IDcentru = IDcentru;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "Centrul{" +
                "IDcentru=" + IDcentru +
                ", nume='" + nume + '\'' +
                '}';
    }
}
