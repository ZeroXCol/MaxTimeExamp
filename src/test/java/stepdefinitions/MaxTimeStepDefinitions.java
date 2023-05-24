package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.Loggin;
import tasks.OpenBrowser;

public class MaxTimeStepDefinitions {


    private String user;
    private String password;

    @Managed(driver = "chrome")
    private WebDriver herbrowser;
    private Actor fabianV = Actor.named("Fabian");

    @Before
    public void permissions(){
        fabianV.can(BrowseTheWeb.with(herbrowser));
    }

    @Given("before of sing in Maxtime {string} and {string}")
    public void beforeOfSingInMaxtimeAnd(String user, String password) {
        this.user = user;
        this.password = password;
        fabianV.attemptsTo(OpenBrowser.withUrl("https://operacion.choucairtesting.com/MaxtimeChc/Login.aspx?ReturnUrl=%2fMaxtimeChc%2fDefault.aspx#ShortcutViewID=Analista_ListView&ShortcutObjectClassName=MaxTime.Module.BusinessObjects.Analista"),
                Loggin.withCredencials(user,password));
    }

    @When("is selected the option register day")
    public void isSelecteTheOptionRegisterDay() {

        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
    }
    @When("Get in the values")
    public void getInTheValues() {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
    }
    @Then("Close the day")
    public void closeTheDay() {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
    }

}
