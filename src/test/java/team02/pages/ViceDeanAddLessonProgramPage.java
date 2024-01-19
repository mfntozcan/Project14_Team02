package team02.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team02.utilities.Driver;
import java.util.List;

public class ViceDeanAddLessonProgramPage {

    public ViceDeanAddLessonProgramPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@href='/login']")
    public WebElement loginLink;
    @FindBy(id = "username")
    public WebElement usernameBox;
    @FindBy(id = "password")
    public WebElement passwordBox;
    @FindBy(xpath = "//button[@class='fw-semibold btn btn-primary']")
    public WebElement loginButton;
    @FindBy(xpath = "//button[text()='Lesson Program']")
    public WebElement lessonProgramButton;
    @FindBy(xpath = "//input[@aria-haspopup='true']")
    public WebElement chooseLessonsSelect;
    @FindBy(xpath = "//select[@id='educationTermId']")
    public WebElement chooseEducationTermDdm;
    @FindBy(xpath = "//select[@id='day']")
    public WebElement chooseDayDdm;
    @FindBy(xpath = "//input[@id='startTime']")
    public WebElement startTimeBox;
    @FindBy(xpath = "//input[@id='stopTime']")
    public WebElement stoptTimeBox;
    @FindBy(xpath = "(//button[text()='Submit'])[3]")
    public WebElement addLessonProgramSubmit;
    @FindBy(xpath = "(//tbody)[4]//tr")
    public List<WebElement> lessonProgramAssignmentList;
}

