import java.io.IOException;

public class Aplicatie {

    public static void main(String[] args) throws IOException {
        AuditService.open();
        ReteaMedicala reteaMedicala = new ReteaMedicala();
        AuditService. close();
    }

}
