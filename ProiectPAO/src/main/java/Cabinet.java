public class Cabinet {
    protected int numar;
    protected boolean ocupat;
    Cabinet(int numar){
        this.numar = numar;
        this.ocupat = false;
    }

    public int getNumar() {
        return this.numar;
    }
    public void ocupa(){
        this.ocupat = true;
    }

    public void elibereaza(){
        this.ocupat = false;
    }


    public void status(){
        System.out.print("Cabinetul ");
        System.out.print(this.getNumar());
        if(this.ocupat)
            System.out.print(" este ocupat");
        else
            System.out.print(" este liber");
    }

}
