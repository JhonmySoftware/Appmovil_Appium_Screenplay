package co.com.infotrack.appmovil.tasks;

import co.com.infotrack.appmovil.models.ModelsLogin;
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

    private final String filePath;

    public Login(String filePath) {
        this.filePath = filePath;
    }

    public static Login withExcelFile(String filePath) {
        return Tasks.instrumented(Login.class, filePath);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        ModelsLogin.setSheetName("testData");

        String sheetName = "testData";
        List<Map<String, String>> testData;
        try {
            testData = ExcelReader.readExcel(filePath, sheetName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String emailAddress = testData.get(0).get("Correo");
        actor.attemptsTo(
                Click.on(ApplicationHomepage.SignUP),
                Click.on(ApplicationHomepage.SignUPEmail),
                Enter.theValue(emailAddress).into(ApplicationHomepage.EmailAddress),
                Click.on(ApplicationHomepage.Next)
        );
    }

}

