package co.com.sofka.tasks.orangepagetask.buzz;

import co.com.sofka.tasks.orangepagetask.myinfo.BrowseToMyInfo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.sofka.userinterfaces.orangepage.OrangePage.*;
import static co.com.sofka.userinterfaces.orangepage.OrangePage.EDIT_BUTTON;

public class BrowseToBuzz implements Task {

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
                Click.on(SUBMIT_LOGIN),

                Click.on(BUZZ_MODULE),
                Click.on(UPDATE_STATUS)
        );
    }
    public BrowseToBuzz usingPassword(String password) {
        this.password = password;
        return this;
    }
    public BrowseToBuzz usingUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public static BrowseToBuzz browseToBuzz() {
        return new BrowseToBuzz();
    }
}
