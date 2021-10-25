package co.com.sofka.stepdefinition.orangepage;

import co.com.sofka.stepdefinition.Setup;
import co.com.sofka.tasks.orangepagetask.myinfo.FillMyInfo;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static co.com.sofka.questions.orangepage.myinfo.MyInfoSucessful.myInfoSucessful;
import static co.com.sofka.tasks.orangepagetask.myinfo.BrowseToMyInfo.*;
import static co.com.sofka.tasks.landingpage.OpenLandingPage.openLandingPage;
import static co.com.sofka.tasks.orangepagetask.myinfo.ChangePhoto.changePhoto;
import static co.com.sofka.tasks.orangepagetask.myinfo.FillMyInfo.fillMyInfo;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;


public class BMyInfoStepDefinition extends Setup {

    private static final String ACTOR_NAME = "Employe";
    private DataTable dataToValidate;
    private FillMyInfo fillMyInfo;

    @Given("el empleado se encuentra en la sesion personal details de la plataforma")
    public void elEmpleadoSeEncuentraEnLaSesionPersonalDetailsDeLaPlataforma() {
        actorSetupTheBrowser(ACTOR_NAME);
        theActorInTheSpotlight().attemptsTo(
                openLandingPage()
        );
    }

    @When("el empleado llene los campos requeridos")
    public void elEmpleadoLleneLosCamposRequeridos() {
        theActorInTheSpotlight().attemptsTo(
                browseToMyInfo()
                        .usingUserName("Admin")
                        .usingPassword("admin123")
        );
    }

    @When("presione el boton save")
    public void presioneElBotonSave(io.cucumber.datatable.DataTable dataTable) {
        dataToValidate = dataTable;
        theActorInTheSpotlight().attemptsTo(
                fillMyInfo()
                        .usingFirstName(dataTable.row(0).get(1))
                        .usingMiddleName(dataTable.row(1).get(1))
                        .usingLastName(dataTable.row(2).get(1))
                        .usingOtherId(dataTable.row(3).get(1))
                        .usingLicenseNumber(dataTable.row(4).get(1))
                        .usingLicenseDate(dataTable.row(5).get(1))
                        .usingSsNumber(dataTable.row(6).get(1))
                        .usingSinNumber(dataTable.row(7).get(1))
                        .usingGender(dataTable.row(8).get(1))
                        .usingMaritialStatus(dataTable.row(9).get(1))
                        .usingNationality(dataTable.row(10).get(1))
                        .usingDateBirthday(dataTable.row(11).get(1))
                        .usingNickName(dataTable.row(12).get(1))
                        .usingMilitaryServices(dataTable.row(13).get(1)),
                changePhoto()
                        .ruta("\\src\\test\\resources\\images.orangepage\\fotoperfil.jpg")
        );
    }
    @Then("el sistema guardara los cambios realizados")
    public void elSistemaGuardaraLosCambiosRealizados() {
        theActorInTheSpotlight().should(
                seeThat(
                        myInfoSucessful()
                                .infoSucessful("Carlos Lucas Zapata")
                                .is(),equalTo(true)
                )
        );
    }
}

