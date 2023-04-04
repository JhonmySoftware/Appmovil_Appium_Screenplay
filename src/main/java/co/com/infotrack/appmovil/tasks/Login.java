package co.com.infotrack.appmovil.tasks;

import co.com.infotrack.appmovil.userinterfaces.ApplicationHomepage;
import co.com.infotrack.appmovil.utils.ExcelReader;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Login implements Task {

    private static final String SHEET_NAME = "testData";
    private static final String DEFAULT_FILE_PATH = "src\\test\\resources\\data\\testData.xls";
    private final List<Map<String, String>> testData;

    public Login(String filePath) {
        try {
            this.testData = ExcelReader.readExcel(filePath, SHEET_NAME);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Login withExcelFile() {
        return Tasks.instrumented(Login.class, DEFAULT_FILE_PATH);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String emailAddress = testData.get(0).get("Correo");
        actor.attemptsTo(
                Click.on(ApplicationHomepage.SignUP),
                Click.on(ApplicationHomepage.SignUPEmail),
                Enter.theValue(emailAddress).into(ApplicationHomepage.EmailAddress),
                Click.on(ApplicationHomepage.Next)
        );
    }

    public List<Map<String, String>> getTestData() {
        return testData;
    }

    // crear instancias de la clase Login con diferentes rutas
    // de archivo, pasando la ruta deseada al constructor, como se muestra a continuación:
    // Login loginTask = new Login("src\\test\\resources\\data\\testData.xls");

}


