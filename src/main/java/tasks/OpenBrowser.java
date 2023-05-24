package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class OpenBrowser implements Task {

    private String url;

    public OpenBrowser(String url){
        this.url = url;
    }

    public static OpenBrowser withUrl(String url){
        return new OpenBrowser(url);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Open.url(url));
    }
}
