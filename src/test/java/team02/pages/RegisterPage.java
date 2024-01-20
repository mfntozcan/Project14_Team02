package team02.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team02.utilities.Driver;

public class RegisterPage {

    public RegisterPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='header_link me-2']")
    public WebElement registerButton_AC;

    //input 1 den 10 name den password a
    @FindBy(css = " #name")    //input[1]
    public WebElement nameKutusu_AC;

    @FindBy(css = "#surname")    //2
    public WebElement surnameKutusu_AC;

    @FindBy(css = "#birthPlace")    //3
    public WebElement birthPlaceKutusu_AC;


    @FindBy(css = "#phoneNumber")   //4
    public WebElement phoneNumberKutusu_AC;


    @FindBy(xpath = "//input[@value='FEMALE']")  //5  erkek 6
    public WebElement genderRadioButtun_AC;


    @FindBy(xpath = "(//input)[7]")
    public WebElement birthDayKutusu_AC;


    @FindBy(xpath = "(//input)[8]")
    public WebElement ssnKutusu_AC;

    @FindBy(xpath = "(//input)[9]")
    public WebElement userNameKutusu_AC;
    @FindBy(xpath = "(//input)[10]")
    public WebElement passwordKutusu_AC;

    @FindBy(xpath = "//button[@class='fw-semibold btn btn-primary']")
    public WebElement registerMaviButton_AC;

    @FindBy(xpath = " (//div[@class='invalid-feedback'])[1]")
    public WebElement nameRequried_AC;

    @FindBy(xpath = " (//div[@class='invalid-feedback'])[2]")
    public WebElement surnameRequried_AC;

    @FindBy(xpath = " (//div[@class='invalid-feedback'])[3]")
    public WebElement birthplaceRequried_AC;

    @FindBy(xpath = " (//div[@class='invalid-feedback'])[4]")
    public WebElement phoneRequried_AC;

    @FindBy(xpath = " (//div[@class='invalid-feedback'])[5]")
    public WebElement birthdayRequried_AC;

    @FindBy(xpath = " (//div[@class='invalid-feedback'])[6]")
    public WebElement ssnRequried_AC;

    @FindBy(xpath = " (//div[@class='invalid-feedback'])[7]")
    public WebElement usernameRequried_AC;

    @FindBy(xpath = " (//div[@class='invalid-feedback'])[8]")
    public WebElement passwordRequried_AC;    //At least 8 characters .. gibi uyari mesajlari ayni locate de

    @FindBy(xpath = "//div[@class='Toastify__toast-body']")   //div[text()='Guest User registered.']
    public WebElement guestUserRegisterYazisi_AC;
    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement ssnAlreadyRegisterYazisi_AC;

    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement ssnHataYazisi_AC;

    @FindBy(xpath = "//div[text()='Please enter valid phone number']")
    public WebElement phoneNumberUyari_AC;

    //div[@class="Toastify__toast-body"]  cikan alert in locate
    //div[@role='alert']
}