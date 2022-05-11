import java.util.*;
public class Retea_Medicala {
    Set<Persoana>persoane;
    Set<Clinica> clinici;
    List<Programare> programari;

    Retea_Medicala(){}

    protected void afiseaza_nume(){
        for(Persoana persoana : persoane){
            System.out.print(persoana.getNume());
        }
    }

    protected void adauga_programare(Programare programare){
        this.programari.add(programare);
    }
}
