package team02.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team02.utilities.Driver;


public class adminManagement {

    public adminManagement(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "(//*[.='Admin Management'])[3]") public WebElement adminManagementButton;
    @FindBy(xpath = "//*[.='Add Admin']") public WebElement addAdminPage;

    @FindBy(xpath = "//input[@placeholder='Name']") public WebElement name;
    @FindBy(xpath = "//input[@placeholder='Surname']") public WebElement surname;
    @FindBy(xpath = "//input[@placeholder='Birth Place']") public WebElement birthPlace;
    @FindBy(xpath = "//input[@value='MALE']") public WebElement gender;

    @FindBy(xpath = "//input[@id='birthDay']") public WebElement birthDay;
    @FindBy(xpath = "//input[@id='phoneNumber']") public WebElement phoneNumber;
    @FindBy(xpath = "//input[@id='ssn']") public WebElement ssn;
    @FindBy(xpath = "//input[@id='username']") public WebElement userName;
    @FindBy(xpath = "//input[@id='password']") public WebElement password;

    @FindBy(xpath = "//button[@class='fw-semibold btn btn-primary btn-lg']") public WebElement summitButton;

    @FindBy(xpath = "//table[@class='table table-striped table-bordered table-hover']") public WebElement adminList;

    @FindBy(xpath = "(//*[.='Required'])[1]") public WebElement requiredName;
    @FindBy(xpath = "(//*[.='Required'])[2]") public WebElement requiredSurname;
    @FindBy(xpath = "(//*[.='Required'])[3]") public WebElement requiredBirthPlace;
    @FindBy(xpath = "(//*[.='Required'])[4]") public WebElement requiredDateOfBirth;
    @FindBy(xpath = "(//*[.='Required'])[5]") public WebElement requiredPhone;
    @FindBy(xpath = "(//*[.='Required'])[6]") public WebElement requiredSsn;
    @FindBy(xpath = "(//*[.='Required'])[7]") public WebElement requiredUserName;
    @FindBy(xpath = "//*[.='Enter your password']") public WebElement requiredPassword;
    @FindBy(xpath = "(//*[.='Admin Saved'])[5]") public WebElement adminSavedYazisi_IO;


}
