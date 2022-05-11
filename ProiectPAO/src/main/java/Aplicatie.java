import java.io.IOException;

public class Aplicatie {

    public static void main(String[] args) throws IOException {
        AuditService.open();
        Retea_Medicala retea_medicala = new Retea_Medicala();
        AuditService. close();
    }

}
