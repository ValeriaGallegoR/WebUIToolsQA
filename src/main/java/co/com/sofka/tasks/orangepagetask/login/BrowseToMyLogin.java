package co.com.sofka.tasks.orangepagetask.login;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.sofka.userinterfaces.orangepage.OrangePage.*;


public class BrowseToMyLogin implements Task {
    private String userName;
    private String password;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Scroll.to(USER_NAME),
                Enter.theValue(userName).into(USER_NAME),

                Scroll.to(PASSWORD),
                Enter.theValue(password).into(PASSWORD),

                Scroll.to(SUBMIT_LOGIN),
                Click.on(SUBMIT_LOGIN)
        );
    }

    public BrowseToMyLogin usingPassword(String password) {
        this.password = password;
        return this;
    }
    public BrowseToMyLogin usingUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public static BrowseToMyLogin browseToMyLogin() {
        return new BrowseToMyLogin();
    }
}
