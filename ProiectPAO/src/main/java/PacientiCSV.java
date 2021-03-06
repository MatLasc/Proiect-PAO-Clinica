import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
public final class PacientiCSV {
        private static PacientiCSV instance;
        private File file;
        private Scanner reader;
        PacientiCSV() throws FileNotFoundException {
            this.file = new File("pacienti.txt");
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

    public static PacientiCSV getInstance() throws FileNotFoundException {
        if (instance == null){
            instance = new PacientiCSV();
        }
        return instance;
    }
}



