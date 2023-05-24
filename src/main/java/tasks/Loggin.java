package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.HomeMaxTime;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Loggin implements Task {

    private final String username;
    private final String password;

    public Loggin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static Loggin withCredencials(String username, String password){

        return instrumented(Loggin.class, username, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(HomeMaxTime.NOMBRE_USUARIO),
                Enter.theValue(username).into(HomeMaxTime.NOMBRE_USUARIO),
                Click.on(HomeMaxTime.CONTRASENA),
                Enter.theValue(password).into(HomeMaxTime.CONTRASENA),
                Click.on(HomeMaxTime.BTN_CONECTARSE));
    }
}
