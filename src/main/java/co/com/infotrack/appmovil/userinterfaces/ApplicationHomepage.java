package co.com.infotrack.appmovil.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ApplicationHomepage {

    public static final Target SignUP = Target.the("boton del login")
            .located(By.id("org.wordpress.android:id/create_site_button"));
    public static final Target SignUPEmail = Target.the("Loguearse con el correo")
            .located(By.id("org.wordpress.android:id/signup_email"));

    public static final Target EmailAddress = Target.the("Ingresar el correo para el login")
            .located(By.id("org.wordpress.android:id/input"));

    public static final Target Next = Target.the("Siguiente interación despues de ingresar el correo")
            .located(By.id("org.wordpress.android:id/primary_button"));




}
