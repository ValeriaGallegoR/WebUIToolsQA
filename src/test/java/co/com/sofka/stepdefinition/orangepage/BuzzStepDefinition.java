package co.com.sofka.stepdefinition.orangepage;

import co.com.sofka.stepdefinition.Setup;
import co.com.sofka.tasks.orangepagetask.myinfo.FillMyInfo;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static co.com.sofka.questions.orangepage.buzz.BuzzComentSucessful.validationComentSucessful;
import static co.com.sofka.questions.orangepage.myinfo.MyInfoSucessful.myInfoSucessful;
import static co.com.sofka.tasks.landingpage.OpenLandingPage.openLandingPage;
import static co.com.sofka.tasks.orangepagetask.buzz.BrowseToBuzz.browseToBuzz;
import static co.com.sofka.tasks.orangepagetask.buzz.FillBuzz.fillBuzz;
import static co.com.sofka.tasks.orangepagetask.myinfo.BrowseToMyInfo.browseToMyInfo;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class BuzzStepDefinition extends Setup {

    private static final String ACTOR_NAME = "Employe";
    private DataTable dataToValidate;
    private FillMyInfo fillMyInfo;

    @Given("el usuario se encuentra en la pagina inicial de la plataforma")
    public void elUsuarioSeEncuentraEnLaPaginaInicialDeLaPlataforma() {
        actorSetupTheBrowser(ACTOR_NAME);
        theActorInTheSpotlight().attemptsTo(
                openLandingPage()
        );
    }
    @When("el usuario ejecuta acciones referente a los comentarios")
    public void elUsuarioEjecutaAccionesReferenteALosComentarios() {
        theActorInTheSpotlight().attemptsTo(
                browseToBuzz()
                        .usingUserName("Admin")
                        .usingPassword("admin123"),
                fillBuzz()
                        .fillBuzzComent("Hola, este es mi primer comentario")
        );
    }

    @Then("el sistema debera guardar mi cambios realizados")
    public void elSistemaDeberaGuardarMiCambiosRealizados() {
        theActorInTheSpotlight().should(
                seeThat(
                        validationComentSucessful()
                                .buzzComentSucessful("Carlos Zapata")
                                .is(),equalTo(true)
                )
        );
    }
}
