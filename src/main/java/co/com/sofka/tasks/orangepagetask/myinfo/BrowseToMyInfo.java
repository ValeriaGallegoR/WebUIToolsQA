package co.com.sofka.tasks.orangepagetask.myinfo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.sofka.userinterfaces.orangepage.OrangePage.*;

public class BrowseToMyInfo implements Task {
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

                Scroll.to(MYINFO_BUTTON),
                Click.on(MYINFO_BUTTON),

                Scroll.to(EDIT_BUTTON),
                Click.on(EDIT_BUTTON)
        );
    }

    public BrowseToMyInfo usingPassword(String password) {
        this.password = password;
        return this;
    }
    public BrowseToMyInfo usingUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public static BrowseToMyInfo browseToMyInfo() {
        return new BrowseToMyInfo();
    }
}
