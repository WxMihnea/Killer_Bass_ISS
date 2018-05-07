package Domain;

public class DateSange {
    private Integer IDsange;
    private String grupaSanguina;
    private String sanatos;
    private String RH;
    private String trombocite;
    private String leucocite;
    private String hematii;

    public DateSange(Integer IDsange, String grupaSanguina, String sanatos, String RH, String trombocite, String leucocite, String hematii) {
        this.IDsange = IDsange;
        this.grupaSanguina = grupaSanguina;
        this.sanatos = sanatos;
        this.RH = RH;
        this.trombocite = trombocite;
        this.leucocite = leucocite;
        this.hematii = hematii;
    }

    public Integer getIDsange() {
        return IDsange;
    }

    public void setIDsange(Integer IDsange) {
        this.IDsange = IDsange;
    }

    public String getGrupaSanguina() {
        return grupaSanguina;
    }

    public void setGrupaSanguina(String grupaSanguina) {
        this.grupaSanguina = grupaSanguina;
    }

    public String getSanatos() {
        return sanatos;
    }

    public void setSanatos(String sanatos) {
        this.sanatos = sanatos;
    }

    public String getRH() {
        return RH;
    }

    public void setRH(String RH) {
        this.RH = RH;
    }

    public String getTrombocite() {
        return trombocite;
    }

    public void setTrombocite(String trombocite) {
        this.trombocite = trombocite;
    }

    public String getLeucocite() {
        return leucocite;
    }

    public void setLeucocite(String leucocite) {
        this.leucocite = leucocite;
    }

    public String getHematii() {
        return hematii;
    }

    public void setHematii(String hematii) {
        this.hematii = hematii;
    }
    @Override
    public String toString() {
        return "DateSange{" +
                "IDsange=" + IDsange +
                ", grupaSanguina='" + grupaSanguina + '\'' +
                ", sanatos='" + sanatos + '\'' +
                ", RH=" + RH +
                ", trombocite='" + trombocite + '\'' +
                ", leucocite='" + leucocite + '\'' +
                ", hematii='" + hematii + '\'' +
                '}';
    }
}
