package team02.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team02.utilities.Driver;

public class ViceDeanManagementSystemPage {
    public ViceDeanManagementSystemPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@href='/login']") public WebElement loginLink;
    @FindBy(xpath = "//a[@class='header_link ms-2']") public WebElement sagustlogin;

    @FindBy(xpath = "//*[@placeholder ='username']") public WebElement username;
    @FindBy(xpath = "//*[@placeholder ='Password']") public WebElement password;
    @FindBy(xpath = "(//*[@type ='button'])[3]") public WebElement loginin;
    @FindBy(xpath = "(//*[@type='button'])[1]") public WebElement menuButton;
    @FindBy(xpath = "//button[1]")
    public WebElement loginMenuButton;
    @FindBy(xpath ="//*[contains( text(),'Teacher Management')]") public WebElement teachermanagment;
    @FindBy(xpath ="//*[contains( text(),'TeacherMurat')]") public WebElement teachermurat;
    @FindBy(xpath ="(//*[@type='button'])[8]") public WebElement edit;
    @FindBy(xpath = "(//*[@class='text-dark btn btn-outline-info'])[2]") public WebElement editButton;
    @FindBy(id = "birthPlace")public WebElement birthplace;

















}
