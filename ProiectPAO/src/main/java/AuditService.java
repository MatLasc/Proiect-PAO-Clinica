import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class AuditService{
     protected static File file;
     protected static  FileWriter fw;
     protected static BufferedWriter bw;

     static protected void open() throws IOException {
          file = new File("audit.txt");
          fw = new FileWriter(file.getAbsoluteFile());
          bw = new BufferedWriter(fw);
     }

     static protected void audit(String s) throws IOException {
          bw.write(s);
     }

     static protected void close() throws IOException {
          bw.close();
     }
}
