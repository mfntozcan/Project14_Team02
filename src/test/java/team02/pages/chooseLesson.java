package team02.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team02.utilities.Driver;


public class chooseLesson {
    public chooseLesson(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "(//*[.='Choose Lesson'])[3]") public WebElement chooseLessonButton;
    @FindBy(xpath = "(//*[.='Choose Lesson'])[3]") public WebElement chooseLessonPage;

    @FindBy(xpath = "//*[.='Teacher']") public WebElement teacher;
    @FindBy(xpath = "(//*[.='Day'])[1]") public WebElement day;

    @FindBy(xpath = "(//*[.='Start Time'])[1]") public WebElement startTime;

    @FindBy(xpath = "(//*[.='Stop Time'])[1]") public WebElement stopTime;

    @FindBy(xpath = "//input[@value='3326']") public WebElement forScroll;

    @FindBy(xpath = "(//input[@id='lessonProgramId'])[7]") public WebElement lessonChooseButton;


    @FindBy(xpath = "(//input[@id='lessonProgramId'])[3]") public WebElement forLessonScroll;

    @FindBy(xpath = "//*[@class='Toastify__toast-body']") public WebElement mesageVerify1Ep;

    @FindBy(xpath = "//*[.='Error: Course schedule cannot be selected for the same hour and day']") public WebElement errorMessageVerify;



    @FindBy(xpath = "//button[@class='fw-semibold btn btn-primary btn-lg']") public WebElement submitButton;

    @FindBy(xpath = "(//tr//td//span)[38]") public WebElement secilendersinBilgisi;

    @FindBy(xpath = "(//tbody[@class='table-group-divider'])[2]") public WebElement lessonProgramList;


}
