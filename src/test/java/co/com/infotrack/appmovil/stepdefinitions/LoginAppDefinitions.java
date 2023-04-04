package co.com.infotrack.appmovil.stepdefinitions;

import co.com.infotrack.appmovil.tasks.AbrirApp;
import co.com.infotrack.appmovil.tasks.Login;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class LoginAppDefinitions {

    @Before
    public void IniciarEscenario() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que jhon ingresa a la aplicacion Wordpress$")
    public void queJhonIngresaALaAplicacionWordpress() {
        OnStage.theActorCalled("Jhon").wasAbleTo(AbrirApp.one());
    }

    @Cuando("^Se logue con el usuario y contrasenia asignado$")
    public void seLogueConElUsuarioYContraseniaAsignado() {
        String filePath = "src\\test\\resources\\data\\testData.xls";
        Login loginTask = Login.withExcelFile(filePath);
        OnStage.theActorCalled("jhon").attemptsTo(loginTask);
    }


    @Entonces("^Verifica el login correcto a la app$")
    public void verificaElLoginCorrectoALaApp() {
        // Write code here that turns the phrase above into concrete actions
    }





}
