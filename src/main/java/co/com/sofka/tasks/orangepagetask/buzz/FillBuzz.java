package co.com.sofka.tasks.orangepagetask.buzz;

import co.com.sofka.tasks.orangepagetask.myinfo.FillMyInfo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static co.com.sofka.userinterfaces.orangepage.OrangePage.*;

import static co.com.sofka.userinterfaces.orangepage.OrangePage.*;

public class FillBuzz implements Task {

    private String firstComent;

    public FillBuzz fillBuzzComent(String firstComent) {
        this.firstComent = firstComent;
        return this;
    }

    public void javascriptExecutor(String script, WebElement element){
        JavascriptExecutor jse = (JavascriptExecutor)POST_BUTTON;
        jse.executeScript(script,element);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Enter.theValue(firstComent).into(COMENTARIO),
                //javascriptExecutor("arguments[0].click();", POST_BUTTON),
                Click.on(POST_BUTTON)
        );
    }
    public static FillBuzz fillBuzz(){
        return new FillBuzz();
    }
}
