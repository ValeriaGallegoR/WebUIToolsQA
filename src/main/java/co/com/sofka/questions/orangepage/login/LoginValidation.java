package co.com.sofka.questions.orangepage.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static co.com.sofka.userinterfaces.orangepage.OrangePage.*;

public class LoginValidation implements Question<Boolean> {
    private String welcome;

    @Override
    public Boolean answeredBy(Actor actor) {
        return (WELCOME_VALIDATION.resolveFor(actor).containsOnlyText(welcome));
    }
    public LoginValidation loginValidationMessage(String welcome){
        this.welcome=welcome;
        return this;
    }
    public LoginValidation is(){
        return this;
    }
    public static LoginValidation loginValidation(){
        return new LoginValidation();
    }
}
