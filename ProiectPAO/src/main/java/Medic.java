import java.util.*;

public class Medic extends Persoana{

    static Set<Medic> medici;

    private int salariu;

    private String specializare;

    protected Clinica clinica;

    protected Cabinet cabinet;

    Medic(String nume, int varsta, Clinica clinica, Cabinet cabinet, int salariu, String specializare){
        super(nume, varsta);
        medici.add(this);
        this.clinica = clinica;
        this.cabinet = cabinet;
        this.salariu = salariu;
        this.specializare = specializare;
    }

    public int get_salariu(){
        return this.salariu;
    }

    protected void set_salariu(int salariu){
        this.salariu = salariu;
    }

    public String getSpecializare() {
        return this.specializare;
    }

    public void setSpecializare(String specializare) {
        this.specializare = specializare;
    }

    public Clinica getClinica() {
        return clinica;
    }

    protected void setClinica(Clinica clinica) {
        this.clinica = clinica;
    }

    public Cabinet getCabinet() {
        return cabinet;
    }

    public void setCabinet(Cabinet cabinet){
        this.cabinet = cabinet;
    }

    private Queue<Programare> programari;

    public Queue<Programare> getProgramari() {
        return programari;
    }

    public void setProgramari(Queue<Programare> programari) {
        this.programari = programari;
    }

    protected void schimba_clinica(Clinica clinica){
        int x = clinica.cabinetLiber();
        if(x == -1) {
            System.out.print("Nu se poate asa ceva");
            return;
        }
        this.cabinet.elibereaza();
        this.clinica.pleacaMedic(this);
        this.setClinica(clinica);
        this.setCabinet(this.clinica.getCabinete().get(x));
        this.clinica.medicNou(this);
    }
}
