import java.io.IOException;
import java.util.*;
public class Pacient extends Persoana {
    Pacient(String nume, int varsta){
        super(nume,varsta);
    }
    protected void faceProgramare(Clinica clinica, String specializare) throws IOException {
        Medic medic = clinica.medicPotrivit(specializare);
        if(medic == null) {
            System.out.print("Niciun medic disponibil");
            return;
        }
        clinica.getProgramari().add(new Programare(this, medic, new Data(0,0,0,0,0) , 0));
    }
}
