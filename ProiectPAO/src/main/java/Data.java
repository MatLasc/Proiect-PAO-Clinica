public class Data {
    private int zi;
    private int luna;
    private int an;
    private int ora;
    private int minut;
    Data(int ora, int minut, int zi, int luna, int an){
        this.ora = ora;
        this.minut = minut;
        this.zi = zi;
        this.luna = luna;
        this.an = an;
    }

    protected int compareTo(Data data){
        if(this.an > data.an)
            return 1;
        if(this.an < data.an)
            return -1;
        if(this.luna > data.luna)
            return 1;
        if(this.luna < data.luna)
            return -1;
        if(this.zi > data.zi)
            return 1;
        if(this.zi < data.zi)
            return -1;
        if(this.ora > data.ora)
            return 1;
        if(this.ora < data.ora)
            return -1;
        if(this.minut > data.minut)
            return 1;
        if(this.minut < data.minut)
            return -1;
        return 0;
    }
}


