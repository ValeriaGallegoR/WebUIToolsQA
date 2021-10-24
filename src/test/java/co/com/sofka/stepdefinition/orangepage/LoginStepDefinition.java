package co.com.sofka.stepdefinition.orangepage;

import co.com.sofka.stepdefinition.Setup;
import co.com.sofka.tasks.orangepagetask.login.BrowseToMyLogin;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static co.com.sofka.questions.orangepage.login.LoginInvalidCredentials.loginInvalidCredentials;
import static co.com.sofka.questions.orangepage.login.LoginInvalidEmpty.loginInvalidEmpty;
import static co.com.sofka.questions.orangepage.login.LoginValidation.*;
import static co.com.sofka.tasks.landingpage.OpenLandingPage.openLandingPage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;


public class LoginStepDefinition extends Setup {

    private static final String ACTOR_NAME = "Employe";

    @Given("el empleado se encuentra en la pagina login de la plataforma")
    public void elEmpleadoSeEncuentraEnLaPaginaLoginDeLaPlataforma() {
        actorSetupTheBrowser(ACTOR_NAME);
        theActorInTheSpotlight().attemptsTo(
                openLandingPage()
        );
    }
    @When("el empleado ingrese contraseña y usuario valido")
    public void elEmpleadoIngreseContraseñaYUsuarioValido() {
        theActorInTheSpotlight().attemptsTo(
                new BrowseToMyLogin()
                        .usingUserName("Admin")
                        .usingPassword("admin123")
        );
    }
    @Then("el sistema deberá mostrar un mensaje de Welcome con el nombre del usuario")
    public void elSistemaDeberáMostrarUnMensajeDeWelcomeConElNombreDelUsuario() {
        theActorInTheSpotlight().should(
                seeThat(
                        loginValidation()
                                .loginValidationMessage("Welcome Paul")
                                .is(),equalTo(true)
                )
        );
    }

    //----------------------------------------------------
    @When("el empleado ingrese contraseña valida y usuario invalido")
    public void elEmpleadoIngreseContraseñaValidaYUsuarioInvalido() {
        theActorInTheSpotlight().attemptsTo(
                new BrowseToMyLogin()
                        .usingUserName("Valeria")
                        .usingPassword("admin123")
        );
    }
    @Then("el sistema deberá mostrar un mensaje de invalid credentials")
    public void elSistemaDeberáMostrarUnMensajeDeInvalidCredentials() {
        theActorInTheSpotlight().should(
                seeThat(
                        loginInvalidCredentials()
                                .invalidCredentials("Invalid credentials")
                                .is(),equalTo(true)
                )
        );
    }

    //----------------------------------------------------
    @When("el empleado ingrese contraseña invalida y usuario valido")
    public void elEmpleadoIngreseContraseñaInvalidaYUsuarioValido() {
        theActorInTheSpotlight().attemptsTo(
                new BrowseToMyLogin()
                        .usingUserName("Admin")
                        .usingPassword("Valeria")
        );
    }
    @Then("el sistema deberá mostrar un mensaje de error")
    public void elSistemaDeberáMostrarUnMensajeDeError() {
        theActorInTheSpotlight().should(
                seeThat(
                        loginInvalidCredentials()
                                .invalidCredentials("Invalid credentials")
                                .is(),equalTo(true)
                )
        );
    }

    //----------------------------------------------------
    @When("el empleado no introduce el UserName ni el Password")
    public void elEmpleadoNoIntroduceElUserNameNiElPassword() {
        theActorInTheSpotlight().attemptsTo(
                new BrowseToMyLogin()
                        .usingUserName("")
                        .usingPassword("")
        );
    }
    @Then("el sistema deberá mostrar un mensaje de Username cannot be empty")
    public void elSistemaDeberáMostrarUnMensajeDeUsernameCannotBeEmpty() {
        theActorInTheSpotlight().should(
                seeThat(
                        loginInvalidEmpty()
                                .invalidEmpty("Username cannot be empty")
                                .is(),equalTo(true)
                )
        );
    }
}
