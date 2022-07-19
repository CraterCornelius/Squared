import org.example.Squared.services.SQRService;

public class Main {

    public static void main(String[] args) {

        SQRService service = new SQRService();
        System.out.println(service.fetchSquares(300, 1000 ));
    }
}
