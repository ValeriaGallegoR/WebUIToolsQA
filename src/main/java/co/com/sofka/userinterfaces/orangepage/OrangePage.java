package co.com.sofka.userinterfaces.orangepage;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;

public class OrangePage extends PageObject {
    //For login
    public static final Target USER_NAME = Target
            .the("userName")
            .located(id("txtUsername"));

    public static final Target PASSWORD = Target
            .the("password")
            .located(id("txtPassword"));

    public static final Target SUBMIT_LOGIN = Target
            .the("loginSubmit")
            .located(id("btnLogin"));


    //For myInfo
    public static final Target MYINFO_BUTTON = Target
            .the("my info Button")
            .located(id("menu_pim_viewMyDetails"));

    public static final Target EDIT_BUTTON = Target
            .the("edit Button")
            .located(xpath("//*[@id=\"btnSave\"]"));

    public static final Target FIRST_NAME = Target
            .the("first Name")
            .located(id("personal_txtEmpFirstName"));

    public static final Target MIDDLE_NAME = Target
            .the("middle Name")
            .located(id("personal_txtEmpMiddleName"));

    public static final Target LAST_NAME = Target
            .the("last Name")
            .located(xpath("//*[@id=\"personal_txtEmpLastName\"]"));

    public static final Target OTHER_ID = Target
            .the("other Id")
            .located(id("personal_txtOtherID"));

    public static final Target NUMBER_LICENSE = Target
            .the("license Number")
            .located(id("personal_txtLicenNo"));

    public static final Target DATE_LICENSE_EXPIRID = Target
            .the("date Of License Input")
            .located(xpath("//*[@id=\"personal_txtLicExpDate\"]"));

    public static final Target GENDER_MALE = Target
            .the("gender Male")
            .located(xpath("//*[@id=\"personal_optGender_1\"]"));

    public static final Target GENDER_FEMALE = Target
            .the("gender Female")
            .located(xpath("//*[@id=\"personal_optGender_2\"]"));

    public static final Target DATE_BIRTHDAY = Target
            .the("date Of Birthday")
            .located(xpath("//*[@id=\"personal_DOB\"]"));

    public static final Target IMAGE_DATE_BIRTHDAY = Target
            .the("Image date Of Birthday")
            .located(xpath("//*[@id=\"frmEmpPersonalDetails\"]/fieldset/ol[3]/li[4]/img"));

    public static final Target SS_NUMBER = Target
            .the("ss Number")
            .located(id("personal_txtNICNo"));

    public static final Target SIN_NUMBER = Target
            .the("sin Number")
            .located(id("personal_txtSINNo"));

    public static final Target MARITIAL = Target
            .the("marital status")
            .located(id("personal_cmbMarital"));

    public static final Target MARITIAL_MARRIED = Target
            .the("marital Married")
            .located(xpath("//*[@id=\"personal_cmbMarital\"]/option[3]"));

    public static final Target MARITIAL_SINGLE = Target
            .the("marital Single")
            .located(xpath("//*[@id=\"personal_cmbMarital\"]/option[2]"));

    public static final Target MARITIAL_OTHER = Target
            .the("marital Other")
            .located(xpath("//*[@id=\"personal_cmbMarital\"]/option[4]"));

    public static final Target NICK_NAME = Target
            .the("nick Name")
            .located(id("personal_txtEmpNickName"));

    public static final Target MILITARY_SERVICES = Target
            .the("military Service")
            .located(id("personal_txtMilitarySer"));

    public static final Target SMOKER_BUTTON = Target
            .the("smoker Button")
            .located(id("personal_chkSmokeFlag"));

    public static final Target SAVE_BUTTON = Target
            .the("save Button")
            .located(xpath("//*[@id=\"btnSave\"]"));

    public static final Target NATIONALITY = Target
            .the("nationality")
            .located(id("personal_cmbNation"));

    //for Update photo
    public static final Target PHOTO_BUTTON = Target
            .the("photo button")
            .located(xpath("//*[@id=\"empPic\"]"));

    public static final Target SELECT_IMAGE = Target
            .the("select image")
            .located(xpath("//*[@id=\"photofile\"]"));

    public static final Target UPLOAD = Target
            .the("upload image")
            .located(xpath("//*[@id=\"btnSave\"]"));

    // for Buzz module

    public static final Target BUZZ_MODULE = Target
            .the("buzz module")
            .located(id("menu_buzz_viewBuzz"));

    public static final Target UPDATE_STATUS = Target
            .the("update status")
            .located(id("status-tab-label"));

    public static final Target COMENTARIO = Target
            .the("comentario")
            .located(xpath("//*[@id=\"createPost_content\"]"));

    public static final Target POST_BUTTON = Target
            .the("post button")
            .located(xpath("//body[1]/div[1]/div[3]/div[1]/div[6]/div[2]/div[1]/div[1]/p[1]/input[1]"));

    public static final Target LIKE_BUTTON = Target
            .the("like button")
            .located(xpath("//div[@id='postBodyThirdRowNew']//div[@id='postLikebody_14']" +
                    "//a[@id='postLikeno_14']//img[@id='postLike_14']"));

    public static final Target EXPAND_BUTTON = Target
            .the("expand button")
            .located(xpath("//img[@id='shareViewMore_14']"));

    public static final Target CLOSE_EXPAND = Target
            .the("close expand button")
            .located(xpath("//img[@id='shareViewMoreMod1_14']"));

    public static final Target SHARE_BUTTON = Target
            .the("share button")
            .located(xpath("//body/div[@id='wrapper']/div[@id='content']/div[@id='dashBoardBuzz']" +
                    "/div[@id='buzzContainer']/ul[@id='buzz']" +
                    "/li[@id='postInList14']/div[@id='postBody']/div[@id='postBodyThirdRowNew']" +
                    "/div[@id='postSharebody_14']/a[@id='postShareno_14']/img[1]"));

    public static final Target COMENT_SHARE_BOX = Target
            .the("coment share box")
            .located(xpath("//body/div[@id='wrapper']/div[@id='content']/div[@id='dashBoardBuzz']" +
                    "/div[@id='buzzContainer']/ul[@id='buzz']/li[@id='postInList14']" +
                    "/div[@id='postBody']/div[@id='posthide_14']/div[1]/div[2]/form[1]/textarea[1]"));

    public static final Target SHARE_RECOMENT_BUTTON = Target
            .the("share recoment button")
            .located(xpath("//body/div[@id='wrapper']/div[@id='content']/div[@id='dashBoardBuzz']" +
                    "/div[@id='buzzContainer']/ul[@id='buzz']" +
                    "/li[@id='postInList14']/div[@id='postBody']/div[@id='posthide_14']" +
                    "/div[1]/div[2]/div[1]/input[1]"));

    //for validation
    public static final Target WELCOME_VALIDATION = Target
            .the("validation welcome")
            .located(id("welcome"));

    public static final Target NAME_VALIDATION = Target
            .the("validation name")
            .located(xpath("//*[@id=\"profile-pic\"]/h1"));

    public static final Target INVALID_CREDENTIALS_VALIDATION = Target
            .the("validation credentials")
            .located(xpath("//span[@id='spanMessage']"));

    public static final Target EMPTY_CREDENTIAL_VALIDATION = Target
            .the("validation empty credentials")
            .located(xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[5]/span"));

    public static final Target COMENT_SUCESSFUL = Target
            .the("validation coment sucessful")
            .located(xpath("//body/div[@id='wrapper']/div[@id='content']/div[@id='dashBoardBuzz']" +
                    "/div[@id='buzzContainer']/ul[@id='buzz']/li[@id='postInList14']/div[@id='postBody']" +
                    "/div[@id='postBodyFirstRow']/div[@id='postFirstRowColumnTwo']/div[@id='postEmployeeName']" +
                    "/label[1]"));
}
