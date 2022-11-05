import hr.java.projekt.controller.Controller;
import hr.java.projekt.database.Database;
import hr.java.projekt.entitet.LoginController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Scanner;

public class Main {


    private static final Logger logger = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {


        Scanner unos = new Scanner(System.in);

        Database database = new Database();
        LoginController loginController = new LoginController(database);

        System.out.println("Dobrodošli u program HospitalH!");
        System.out.println("Ovdje možete upisivati, brisati ili izmjeniti preglede pacijenata!\n\n");

        Integer userIndex = loginController.login(unos);
        Controller controller = new Controller(unos, userIndex, logger);
        controller.pocniProgram();


    }
}