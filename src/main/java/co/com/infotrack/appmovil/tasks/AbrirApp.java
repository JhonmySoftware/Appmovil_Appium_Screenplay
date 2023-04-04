package co.com.infotrack.appmovil.tasks;

import co.com.infotrack.appmovil.userinterfaces.ApplicationHomepage;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class AbrirApp implements Task {

    public static AbrirApp one() {
        return (AbrirApp) Tasks.instrumented(AbrirApp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    }
}
