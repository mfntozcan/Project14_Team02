package team02.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team02.utilities.Driver;
import java.util.List;

public class ViceDeanOgretmeneDersAtamaPage {

    public ViceDeanOgretmeneDersAtamaPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//tbody)[3]//tr")
    public List<WebElement> totalLessonProgramList;
    @FindBy(xpath = "//input[@id='lessonProgramId']")
    public List<WebElement> lessonProgramAssignmentCheckbox;
    @FindBy(xpath = "//select[@id='teacherId']")
    public WebElement chooseTeacherAssignmentDdm;
    @FindBy(xpath = "(//button[text()='Submit'])[4]")
    public WebElement lessonProgramAssignmentSubmit;
    @FindBy(xpath = "(//a[@role='button'])[22]")
    public WebElement sayfadaSonaGelme;
    @FindBy(xpath = "(//span[@class='page-link'])[3]")
    public WebElement toplamSayfa;
    @FindBy(xpath = "(//a[@role='button'])[20]")
    public WebElement sayfadaGeriGelme;
}
