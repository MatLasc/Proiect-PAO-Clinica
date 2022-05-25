import java.util.*;
public class ReteaMedicala {
    Set<Persoana>persoane;
    Set<Clinica> clinici;
    List<Programare> programari;

    ReteaMedicala(){}

    public void setProgramari(List<Programare> programari) {
        this.programari = programari;
    }

    public void setClinici(Set<Clinica> clinici) {
        this.clinici = clinici;
    }

    public void setPersoane(Set<Persoana> persoane) {
        this.persoane = persoane;
    }

    public List<Programare> getProgramari() {
        return programari;
    }

    public Set<Clinica> getClinici() {
        return clinici;
    }

    public Set<Persoana> getPersoane() {
        return persoane;
    }

    protected void afiseaza_nume(){
        for(Persoana persoana : persoane){
            System.out.print(persoana.getNume());
        }
    }


    protected void adaugaProgramare(Programare programare){
        this.programari.add(programare);
    }
}
