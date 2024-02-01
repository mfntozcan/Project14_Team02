package team02.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team02.utilities.Driver;

public class MehmetPage {



    public MehmetPage() {
        PageFactory.initElements(Driver.getDriver(), this);}



    @FindBy(xpath = "//*[@class='header_link ms-2']") public WebElement loginButton;
    @FindBy(xpath = "(//input[@class='form-control'])[1]") public WebElement userNameBox;

    @FindBy(id = "password") public WebElement passwordBox;

    @FindBy(xpath = "(//button[@type='button'])[3]") public WebElement loginButtonTikla;

    @FindBy(xpath = "//*[@id='controlled-tab-example-tab-lessonsList']") public WebElement lessonButtonTikla;

    // @FindBy(xpath = "//button[text()='Menu']") public WebElement menuButton;
    @FindBy(xpath = "(//button[@aria-label='Toggle navigation'])[1]") public WebElement menuButton;
    //  @FindBy(xpath = "//button[@aria-controls='offcanvasNavbar-expand-false']") public WebElement menuButton;


    @FindBy(xpath = "//a[.='Lesson Management']") public WebElement lessonManagementGiris;

    @FindBy(xpath = "//button[@id='controlled-tab-example-tab-lessonsList']") public WebElement lesson;



    @FindBy(xpath = "(//h3[@bg='primary'])[2]") public WebElement lessonManagementYazisi;

    @FindBy(xpath = "//*[@id='lessonName']")  public WebElement lessonName;

    @FindBy(xpath = "//*[@id='compulsory']") public WebElement compulsory;

    @FindBy(xpath = "//input[@placeholder='Credit Score']") public WebElement creditScore;

    @FindBy(xpath = "(//button[@class='fw-semibold btn btn-primary btn-lg'])[2]") public  WebElement submitButton;


    @FindBy(xpath = "//*[@*='Toastify__toast-container Toastify__toast-container--top-center']") public WebElement lessonCreatedyazisi;

    @FindBy(xpath = "(//h5[@bg='primary'])[2]") public WebElement addLessonSayfasi;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[4]") public WebElement required;




//div[@class='Toastify__toast-body']


    //*[.='text message']











    }
