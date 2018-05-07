package Domain;

public class Client {
    private Integer IDclinica;
    private String Contact;
    private String Adresa;

    public Client(Integer IDclinica, String contact, String adresa) {
        this.IDclinica = IDclinica;
        Contact = contact;
        Adresa = adresa;
    }

    public Integer getIDclinica() {
        return IDclinica;
    }

    public void setIDclinica(Integer IDclinica) {
        this.IDclinica = IDclinica;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String contact) {
        Contact = contact;
    }

    public String getAdresa() {
        return Adresa;
    }

    public void setAdresa(String adresa) {
        Adresa = adresa;
    }

    @Override
    public String toString() {
        return "Client{" +
                "IDclinica=" + IDclinica +
                ", Contact='" + Contact + '\'' +
                ", Adresa='" + Adresa + '\'' +
                '}';
    }
}
