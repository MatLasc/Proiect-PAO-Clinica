import java.util.*;
public class Clinica {

    private Set<Programare> programari;
    private Adresa adresa;
    private Set<Medic> medic;

    public void setProgramari(Set<Programare> programari) {
        this.programari = programari;
    }

    public void setAdresa(Adresa adresa) {
        this.adresa = adresa;
    }

    public void setMedic(Set<Medic> medic) {
        this.medic = medic;
    }

    public Adresa getAdresa() {
        return adresa;
    }

    public Set<Programare> getProgramari() {
        return programari;
    }

    public Set<Medic> getMedic() {
        return medic;
    }
}
