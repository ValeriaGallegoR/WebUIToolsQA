package co.com.sofka.tasks.orangepagetask.myinfo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.conditions.Check;

import static co.com.sofka.userinterfaces.orangepage.OrangePage.*;
import static co.com.sofka.util.Gender.MALE;

public class FillMyInfo implements Task {
    private String firstName;
    private String middleName;
    private String lastName;
    private String otherId;
    private String licenseNumber;
    private String licenseDate;
    private String ssNumber;
    private String sinNumber;
    private String gender;
    private String maritialStatus;
    private String nationality;
    private String dateBirthday;
    private String nickName;
    private String militaryServices;


    public FillMyInfo usingFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public FillMyInfo usingMiddleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    public FillMyInfo usingLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public FillMyInfo usingOtherId(String otherId) {
        this.otherId = otherId;
        return this;
    }

    public FillMyInfo usingLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
        return this;
    }

    public FillMyInfo usingLicenseDate(String licenseDate) {
        this.licenseDate = licenseDate;
        return this;
    }

    public FillMyInfo usingSsNumber(String ssNumber) {
        this.ssNumber = ssNumber;
        return this;
    }

    public FillMyInfo usingSinNumber(String sinNumber) {
        this.sinNumber = sinNumber;
        return this;
    }

    public FillMyInfo usingGender(String gender) {
        this.gender = gender;
        return this;
    }

    public FillMyInfo usingMaritialStatus(String maritialStatus) {
        this.maritialStatus = maritialStatus;
        return this;
    }

    public FillMyInfo usingNationality(String nationality) {
        this.nationality = nationality;
        return this;
    }

    public FillMyInfo usingDateBirthday(String dateBirthday) {
        this.dateBirthday = dateBirthday;
        return this;
    }

    public FillMyInfo usingNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }

    public FillMyInfo usingMilitaryServices(String militaryServices) {
        this.militaryServices = militaryServices;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Scroll.to(FIRST_NAME),
                Enter.theValue(firstName).into(FIRST_NAME),

                Scroll.to(MIDDLE_NAME),
                Enter.theValue(middleName).into(MIDDLE_NAME),

                Scroll.to(LAST_NAME),
                Enter.theValue(lastName).into(LAST_NAME),

                Scroll.to(OTHER_ID),
                Enter.theValue(otherId).into(OTHER_ID),

                Scroll.to(NUMBER_LICENSE),
                Enter.theValue(licenseNumber).into(NUMBER_LICENSE),

                Scroll.to(DATE_LICENSE_EXPIRID),
                Clear.field(DATE_LICENSE_EXPIRID),
                Enter.theValue(licenseDate).into(DATE_LICENSE_EXPIRID),

                Scroll.to(SS_NUMBER),
                Enter.theValue(ssNumber).into(SS_NUMBER),

                Scroll.to(SIN_NUMBER),
                Enter.theValue(sinNumber).into(SIN_NUMBER),

                Check.whether(MALE.getValue().equals(gender))
                        .andIfSo(
                                Scroll.to(GENDER_MALE),
                                Click.on(GENDER_MALE)
                        )
                        .otherwise(
                                Scroll.to(GENDER_FEMALE),
                                Click.on(GENDER_FEMALE)
                        ),

                Scroll.to(MARITIAL),
                SelectFromOptions.byVisibleText("Single").from(MARITIAL),

                Scroll.to(NATIONALITY),
                SelectFromOptions.byVisibleText("Colombian").from(NATIONALITY),

                Scroll.to(DATE_BIRTHDAY),
                Clear.field(DATE_BIRTHDAY),
                Enter.theValue(dateBirthday).into(DATE_BIRTHDAY),
                Click.on(IMAGE_DATE_BIRTHDAY),

                Scroll.to(NICK_NAME),
                Enter.theValue(nickName).into(NICK_NAME),

                Scroll.to(SMOKER_BUTTON),
                Click.on(SMOKER_BUTTON),

                Scroll.to(MILITARY_SERVICES),
                Enter.theValue(militaryServices).into(MILITARY_SERVICES),

                Scroll.to(SAVE_BUTTON),
                Click.on(SAVE_BUTTON)
        );
    }
    public static FillMyInfo fillMyInfo(){
        return new FillMyInfo();
    }
}
