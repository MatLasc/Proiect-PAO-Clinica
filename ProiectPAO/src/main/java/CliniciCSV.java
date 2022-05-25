import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
public final class CliniciCSV { //singleton
    private static CliniciCSV instance;
    private File file;
    private Scanner reader;
    CliniciCSV() throws FileNotFoundException {
        this.file = new File("clinici.txt");
        if(!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        reader = new Scanner(file);

    }

    private void read(){
        while (reader.hasNextLine()) {
            String data = reader.nextLine();
        }
    }
    public static CliniciCSV getInstance() throws FileNotFoundException {
        if (instance == null){
            instance = new CliniciCSV();
        }
        return instance;
    }
}
