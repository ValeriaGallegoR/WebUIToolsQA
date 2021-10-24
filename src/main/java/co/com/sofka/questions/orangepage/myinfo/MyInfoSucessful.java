package co.com.sofka.questions.orangepage.myinfo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userinterfaces.orangepage.OrangePage.NAME_VALIDATION;

public class MyInfoSucessful implements Question<Boolean> {

    private String name;

    @Override
    public Boolean answeredBy(Actor actor) {
        return (NAME_VALIDATION.resolveFor(actor).containsOnlyText(name));
    }
    public MyInfoSucessful infoSucessful(String name){
        this.name=name;
        return this;
    }
    public MyInfoSucessful is(){
        return this;
    }
    public static MyInfoSucessful myInfoSucessful(){
        return new MyInfoSucessful();
    }
}
