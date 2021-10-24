package co.com.sofka.tasks.orangepagetask.myinfo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.sofka.userinterfaces.orangepage.OrangePage.PHOTO_BUTTON;
import static co.com.sofka.userinterfaces.orangepage.OrangePage.SELECT_IMAGE;
import static co.com.sofka.userinterfaces.orangepage.OrangePage.UPLOAD;

public class ChangePhoto implements Task {

    private String changePhoto;
    private String selectPhoto;
    private String ruta;

    public ChangePhoto ruta(String ruta) {
        this.ruta = System.getProperty("user.dir")+ruta;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Scroll.to(PHOTO_BUTTON),
                Click.on(PHOTO_BUTTON),

                Enter.keyValues(ruta).into(SELECT_IMAGE),

                Scroll.to(UPLOAD),
                Click.on(UPLOAD)
        );

    }

    public static ChangePhoto changePhoto() {
        return new ChangePhoto();
    }

}
