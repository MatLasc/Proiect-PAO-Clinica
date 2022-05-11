public class Adresa {
    public String strada;
    public String numar;
    public String localitate;

    Adresa(String strada, String numar, String localitate){
        this.strada = strada;
        this.numar = numar;
        this.localitate = localitate;
    }

    private void setLocalitate(String localitate) {
        this.localitate = localitate;
    }

    private void setNumar(String numar) {
        this.numar = numar;
    }

    private void setStrada(String strada) {
        this.strada = strada;
    }

    public String getLocalitate() {
        return localitate;
    }

    public String getStrada() {
        return strada;
    }

    public String getNumar() {
        return numar;
    }

    protected void relocalizare(String strada, String numar, String localitate){
        setLocalitate(localitate);
        setNumar(numar);
        setStrada(strada);
    }

    protected void afisareAdresa(){
        System.out.print("Clinica se afla in localitatea " + this.getLocalitate() + " pe strada " + this.getStrada() + " la numarul " + this.getNumar() + ".\n");
    }


}
