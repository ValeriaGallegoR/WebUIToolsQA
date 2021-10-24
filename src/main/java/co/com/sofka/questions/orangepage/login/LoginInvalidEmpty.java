package co.com.sofka.questions.orangepage.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userinterfaces.orangepage.OrangePage.EMPTY_CREDENTIAL_VALIDATION;

public class LoginInvalidEmpty implements Question<Boolean>{
    private String invalidEmpty;

    @Override
    public Boolean answeredBy(Actor actor) {
        return (EMPTY_CREDENTIAL_VALIDATION.resolveFor(actor).containsOnlyText(invalidEmpty));
    }
    public LoginInvalidEmpty invalidEmpty(String invalidEmpty){
        this.invalidEmpty=invalidEmpty;
        return this;
    }
    public LoginInvalidEmpty is(){
        return this;
    }
    public static LoginInvalidEmpty loginInvalidEmpty(){
        return new LoginInvalidEmpty();
    }
}
