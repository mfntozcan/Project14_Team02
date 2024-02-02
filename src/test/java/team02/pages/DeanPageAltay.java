package team02.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team02.utilities.Driver;

public class DeanPageAltay {


    public DeanPageAltay() {
        PageFactory.initElements(Driver.getDriver(), this);}



    @FindBy(xpath = "(//input[@class='form-control'])[1]") public WebElement userNameBox;

    @FindBy(id = "password") public WebElement passwordBox;

    @FindBy(xpath = "(//button[@type='button'])[3]") public WebElement loginButtonTikla;

    @FindBy(xpath = "(//button[@aria-label='Toggle navigation'])[1]") public WebElement menuButton;

    @FindBy(xpath = "//a[.='Vice Dean Management']") public WebElement viceDeanManagement;
    @FindBy(xpath = "//h3") public WebElement viceDeanYazisi;

    @FindBy(xpath = "(//button[@class='text-dark btn btn-outline-info'])[1]") public WebElement silmeButonu;

    @FindBy(xpath = "//a[.='Contact Get All']") public WebElement contactGetAll;

    @FindBy(xpath = "//span[.='Malik']") public WebElement nameBilgisi;

    @FindBy(xpath =  "//span[.='theo.deckow@yahoo.com']") public  WebElement emailBilgisi;

    @FindBy(xpath =  "(//span[.='2024-01-31'])[1]") public  WebElement tarihBilgisi;
    @FindBy(xpath =  "//span[.='Matematik']") public  WebElement subjectBilgisi;
    @FindBy(xpath =  "//span[.='team06 project']") public  WebElement mesajBilgisi;

    @FindBy(xpath = "//h5") public WebElement contactMessage;




















}
