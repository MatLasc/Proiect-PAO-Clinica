import java.util.*;

public class Medic extends Persoana{

    private Queue<Programare> programari;

    public Queue<Programare> getProgramari() {
        return programari;
    }

    public void setProgramari(Queue<Programare> programari) {
        this.programari = programari;
    }
}
