package co.com.sofka.tasks.orangepagetask.buzz;

import co.com.sofka.tasks.orangepagetask.myinfo.FillMyInfo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static co.com.sofka.userinterfaces.orangepage.OrangePage.*;

import static co.com.sofka.userinterfaces.orangepage.OrangePage.*;

public class FillBuzz implements Task {

    private String firstComent;
    private String reComent;

    public FillBuzz fillBuzzComent(String firstComent) {
        this.firstComent = firstComent;
        return this;
    }

    public FillBuzz fillBuzzReComent(String reComent) {
        this.reComent = reComent;
        return this;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Enter.theValue(firstComent).into(COMENTARIO),
                Click.on(POST_BUTTON),

                Scroll.to(LIKE_BUTTON),
                Click.on(LIKE_BUTTON),

                Click.on(EXPAND_BUTTON),
                Click.on(CLOSE_EXPAND),

                Click.on(SHARE_BUTTON),
                Enter.theValue(reComent).into(COMENT_SHARE_BOX),
                Click.on(SHARE_RECOMENT_BUTTON)
        );
    }
    public static FillBuzz fillBuzz(){
        return new FillBuzz();
    }
}
