import java.io.IOException;
import java.util.*;
public class Programare {
    private Pacient pacient;
    private Medic medic;
    private Data data;
    private int cost;


    Programare(Pacient pacient, Medic medic, Data data, int cost) throws IOException {
              this.pacient = pacient;
              this.medic = medic;
              this.data = data;
              this.cost = cost;
              medic.getClinica().adaugaProgramare(this);
    }

    public Medic getMedic() {
        return this.medic;
    }

    public Pacient getPacient() {
        return this.pacient;
    }


    public Data getData(){return this.data;}

    public int getCost (){return this.cost;}

    protected int compareTo(Programare programare){
        Data data1 = this.getData();
        Data data2 = programare.getData();
        return data1.compareTo(data2);
    }
}
