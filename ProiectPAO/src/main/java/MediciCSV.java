import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
public final class MediciCSV {
    private static MediciCSV instance;
    private File file;
    private Scanner reader;
    MediciCSV() throws FileNotFoundException {
        this.file = new File("medici.txt");
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
    public static MediciCSV getInstance() throws FileNotFoundException {
        if (instance == null){
            instance = new MediciCSV();
        }
        return instance;
    }

}
