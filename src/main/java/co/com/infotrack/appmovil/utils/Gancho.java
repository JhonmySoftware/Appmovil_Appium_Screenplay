package co.com.infotrack.appmovil.utils;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class Gancho {

    @Before
    public void PrepararStatus() {
        OnStage.setTheStage(new OnlineCast());
    }
}
