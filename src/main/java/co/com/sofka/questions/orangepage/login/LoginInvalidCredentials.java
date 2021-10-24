package co.com.sofka.questions.orangepage.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userinterfaces.orangepage.OrangePage.INVALID_CREDENTIALS_VALIDATION;

public class LoginInvalidCredentials implements Question<Boolean> {

    private String invalidCredentials;

    @Override
    public Boolean answeredBy(Actor actor) {
        return (INVALID_CREDENTIALS_VALIDATION.resolveFor(actor).containsOnlyText(invalidCredentials));
    }
    public LoginInvalidCredentials invalidCredentials(String invalidCredentials){
        this.invalidCredentials=invalidCredentials;
        return this;
    }
    public LoginInvalidCredentials is(){
        return this;
    }
    public static LoginInvalidCredentials loginInvalidCredentials(){
        return new LoginInvalidCredentials();
    }
}
