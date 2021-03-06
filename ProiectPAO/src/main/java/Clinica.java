import java.io.IOException;
import java.util.*;
public class Clinica {

    private List<Programare> programari;
    private Adresa adresa;
    private Set<Medic> medici;
    private List<Cabinet> cabinete;
    private int nrCabinete;

    Clinica(int nrCabinete){
        this.nrCabinete = nrCabinete;
        int i;
        for(i = 0; i < nrCabinete; i++) {
            cabinete.add(new Cabinet(i + 1));
        }
    }

    public void setProgramari(List<Programare> programari) {
        this.programari = programari;
    }

    public void setAdresa(Adresa adresa) {
        this.adresa = adresa;
    }

    public void setMedic(Set<Medic> medici) {
        this.medici = medici;
    }

    public Adresa getAdresa() {
        return adresa;
    }

    public List<Programare> getProgramari() {
        return this.programari;
    }

    public Set<Medic> getMedici() {
        return this.medici;
    }

    public List<Cabinet> getCabinete() {
        return this.cabinete;
    }


    public void medicNou(Medic medic){
         this.medici.add(medic);
    }
    public void pleacaMedic (Medic medic){
        this.medici.remove(medic);
    }

    protected int cabinetLiber() {
        int i = 0;
        while (i < this.nrCabinete && (this.cabinete.get(i).ocupat)) {
                i++;
        }
        if(i == this.nrCabinete)
            return -1;
        return i;
    }

    protected Medic medicPotrivit(String specializare){
        for (Medic medic: this.medici) {
            if(medic.getSpecializare().equals(specializare)) return medic;
            }
        return null;
    }

    protected void adaugaProgramare(Programare programare) throws IOException {
        this.getProgramari().add(programare);
        AuditService.audit("Programare noua\n");
    }

    protected void sortareProgramari(){
        Collections.sort(this.programari, new ProgSort());
    }
}
