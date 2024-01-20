package team02.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team02.utilities.Driver;

public class ViceDeanCreateStudentPage {
    public ViceDeanCreateStudentPage() {
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//*[contains( text(),'Student Management')]") public WebElement StudentManagement;
    @FindBy(id = "advisorTeacherId") public WebElement ChooseTeacher;
    @FindBy(xpath = "//*[@id='name']") public WebElement name;
    @FindBy(id = "surname") public WebElement surname;
    @FindBy(id = "birthPlace") public WebElement birthPlace;
    @FindBy(id = "email") public WebElement email;
    @FindBy(xpath = "(//*[@type='radio'])[1]") public WebElement Female;
    @FindBy(id = "birthDay") public WebElement birthDay;
    @FindBy(id = "ssn") public WebElement ssn;
    @FindBy(id = "phoneNumber") public WebElement phoneNumber;
    @FindBy(id = "username") public WebElement username;
    @FindBy(id = "fatherName") public WebElement fatherName;
    @FindBy(id = "motherName") public WebElement motherName;
    @FindBy(id = "password") public WebElement password;
    @FindBy(xpath = "(//*[@type='button'])[5]") public WebElement sumbitButton;










}
