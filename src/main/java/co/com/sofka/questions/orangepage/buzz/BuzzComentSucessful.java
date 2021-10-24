package co.com.sofka.questions.orangepage.buzz;

import co.com.sofka.questions.orangepage.myinfo.MyInfoSucessful;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userinterfaces.orangepage.OrangePage.COMENT_SUCESSFUL;

public class BuzzComentSucessful implements Question<Boolean> {

    private String coment;

    @Override
    public Boolean answeredBy(Actor actor) {
        return (COMENT_SUCESSFUL.resolveFor(actor).containsOnlyText(coment));
    }
    public BuzzComentSucessful buzzComentSucessful(String coment){
        this.coment=coment;
        return this;
    }
    public BuzzComentSucessful is(){
        return this;
    }

    public static BuzzComentSucessful validationComentSucessful(){
        return new BuzzComentSucessful();
    }
}
