package team02.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team02.utilities.Driver;


public class YusufPage {

    public YusufPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//a[text()='Admin Management']") public WebElement adminManagement;

    @FindBy(xpath = "//input[@value='MALE']") public WebElement gender;

    @FindBy(xpath = "//div[text()='Admin Saved']") public WebElement adminSaved;



    @FindBy(xpath = "//button[normalize-space()='Menu']")
    public WebElement menuButton;
    @FindBy(xpath = "//*[.='Dean Management']")
    public WebElement deanManagementButton;
    @FindBy (xpath = "//h3[@class='fw-bold p-3 card-header']")
    public WebElement viceDeanManagementText;


    @FindBy(xpath = "//a[normalize-space()='Contact Get All']")
    public WebElement contactGetAllButton;

    @FindBy(xpath = "//h5[@class='fw-bold p-3 card-header']")
    public WebElement contactMessageText;

    @FindBy(xpath = "//th[normalize-space()='Name']")
    public WebElement nameText;

    @FindBy(xpath = "//th[normalize-space()='Email']")
    public WebElement emailText;

    @FindBy(xpath = "//th[normalize-space()='Date']")
    public WebElement dateText;

    @FindBy(xpath = "//th[normalize-space()='Subject']")
    public WebElement subjectText;

    @FindBy(xpath = "//th[normalize-space()='Message']")
    public WebElement messageText;


    @FindBy(xpath = "//h3[normalize-space()='Education Term Management']")
    public WebElement educationTermManagementText;

    @FindBy(xpath = "//a[normalize-space()='Lesson Management']")
    public WebElement lessonManagementButton;

    @FindBy(xpath = "//button[@id='controlled-tab-example-tab-lessonsList']")
    public WebElement lessonsButton;

    @FindBy(xpath = "//input[@id='lessonName']")
    public WebElement lessonTextBox;

    @FindBy(xpath = "//input[@id='compulsory']")
    public WebElement compulsoryCheckBox;

    @FindBy(xpath = "//input[@id='creditScore']")
    public WebElement creditScoreTextBox;

    @FindBy(xpath = "//div[@class='mx-auto mt-1 ms-4 mb-1 col']//div//button[@type='button'][normalize-space()='Submit']")
    public WebElement submitButtonLessonManagement;

    @FindBy(xpath = "//div[contains(text(),'Lesson Created')]")
    public WebElement verifyAddedLesson;

    @FindBy(xpath = "//span[text()='Dean3']")
    public WebElement deanNameText;

    @FindBy(xpath = "(//span[text()='MALE'])[2]")
    public WebElement deanGenderText;
    @FindBy(xpath = "//span[text()='555-555-5551']")
    public WebElement deanPhoneNumberText;

    @FindBy(xpath = "//span[text()='888-88-8881']")
    public WebElement deanSsnText;
    @FindBy(xpath = "//span[text()='DeanDemir']")
    public WebElement deanUserNameText;
    @FindBy(xpath = "(//*[@type='button'])[7]")
    public WebElement deanEditButton;

    @FindBy(xpath = "(//input[@id='name'])[2]")
    public WebElement deanEditName;
    @FindBy(xpath = "(//*[@id='surname'])[2]")
    public WebElement deanEditSurname;
    @FindBy(xpath = "(//*[@id='birthPlace'])[2]")
    public WebElement deanEditBirthPlace;
    @FindBy(xpath = "(//*[@value='MALE'])[2]")
    public WebElement deanEditGender;
    @FindBy(xpath = "(//*[@id='birthDay'])[2]")
    public WebElement deanEditBirthDay;
    @FindBy(xpath = "(//*[@id='phoneNumber'])[2]")
    public WebElement deanEditPhoneNumber;
    @FindBy(xpath = "(//*[@id='ssn'])[2]")
    public WebElement deanEditSsn;
    @FindBy(xpath = "(//*[@id='username'])[2]")
    public WebElement deanEditUserName;
    @FindBy(xpath = "(//*[@id='password'])[2]")
    public WebElement deanEditPassword;
    @FindBy(xpath = "(//div[text()='Dean updated Successful'])[1]")
    public WebElement deanEditSuccessful;
    @FindBy(xpath = "//a[@class='header_link ms-2']")
    public  WebElement girisLogin;

    @FindBy(id = "controlled-tab-example-tab-lessonProgram")
    public  WebElement lessonProgramTopMENU;

    @FindBy(xpath = "//label[normalize-space()='Choose Lessons']")
    public  WebElement chooseLessonsCheck;

    @FindBy(xpath = "//div[@class=' css-19bb58m']")
    public  WebElement chooseLessonsDDM;

    @FindBy(xpath = "//label[normalize-space()='Choose Day']")
    public  WebElement chooseDayText;

    @FindBy(xpath = "//select[@id='day']")
    public  WebElement chooseDayOptions;

    @FindBy(xpath = "//label[normalize-space()='Start Time']")
    public  WebElement startTimeText;

    @FindBy(xpath = "//input[@id='startTime']")
    public  WebElement startTimeBox;

    @FindBy(xpath = "//label[normalize-space()='Stop Time']")
    public  WebElement stopTimeText;

    @FindBy(xpath = "//input[@id='stopTime']")
    public  WebElement stopTimeBox;

    @FindBy(xpath = "(//th[.='Lesson'])[1]")
    public  WebElement lessonTitle;
    @FindBy(xpath = "(//th[.='Day'])[1]")
    public  WebElement dayTitle;
    @FindBy(xpath = "(//th[.='Start Time'])[1]")
    public  WebElement startTimeTitle;

    @FindBy(xpath = "(//th[.='Stop Time'])[1]")
    public  WebElement stopTimeTitle;

    @FindBy(xpath = "(//button[@class='fw-semibold btn btn-primary btn-lg'])[3]")
    public  WebElement submitbuttonLessonManagementadd;

    @FindBy(xpath = "//tbody/tr[217]/td[2]/span[1]")
    public  WebElement addLessonLessonProgramAssignment ;

    @FindBy(xpath = "//tbody/tr[217]/td[1]/span[1]/div[1]/input[1]")
    public  WebElement addLessonLessonProgramAssignmentAnyCheckbox ;

    @FindBy(xpath = "(//select[@id='teacherId'])[1]")
    public  WebElement addLessonLessonProgramAssignmentChooseTeacher ;

    @FindBy(xpath = "//div[@class=' mb-3 mt-4 col']//button[@type='button'][normalize-space()='Submit']")
    public  WebElement addLessonLessonProgramAssignmentChooseTeacherSubmit ;




    @FindBy(xpath = "//*[@href='/login']") public WebElement loginLink;
    @FindBy(id = "username") public WebElement usernameLogin;
    @FindBy(id = "password") public WebElement passwordLogin;
    @FindBy(xpath = "//button[@class='fw-semibold btn btn-primary']") public WebElement loginButtonGiris;

    @FindBy(xpath = "//button[@class='fw-semibold text-white bg-primary navbar-toggler collapsed']") public WebElement menu;
    @FindBy(xpath = "//a[text()='Dean Management']") public WebElement deanManagement;
    @FindBy(xpath = "//input[@id='name']") public WebElement nameDean;
    @FindBy(xpath = "//input[@id='surname']") public WebElement surnameDean;
    @FindBy(xpath = "//input[@id='birthPlace']") public WebElement birthPlace;

    @FindBy(xpath = "//input[@id='birthDay']") public WebElement dateOfBirth;

    @FindBy(xpath = "//input[@id='phoneNumber']") public WebElement phone;

    @FindBy(xpath = "//input[@id='ssn']") public WebElement ssn;
    @FindBy(xpath = "//input[@id='username']") public WebElement userName;

    @FindBy(xpath = "//input[@id='password']") public WebElement password;
    @FindBy(xpath = "//button[@class='fw-semibold btn btn-primary btn-lg']") public WebElement submitButton;
    @FindBy(xpath = "//div[text()='Dean Saved']") public WebElement deanSaved;
    @FindBy(xpath = "//div[text()='Required']") public WebElement requiredUyarıMesajı;
    @FindBy(xpath = "//div[text()='You have entered an invalid value. Valid values are: MALE, FEMALE']") public WebElement genderUyarıMesajı;
    @FindBy(xpath = "//div[text()='Please enter valid SSN number']") public WebElement ssnUyarıMesajı;
    @FindBy(xpath = "//div[text()='Minimum 11 character (XXX-XX-XXXX)']") public WebElement ssnUyarıMesajı2;
    @FindBy(xpath = "//div[text()='Enter your password']") public WebElement passwordUyarıMesajı;
    @FindBy(xpath = "//div[text()='At least 8 characters']") public WebElement passwordKarakterUyarıMesajı;
    @FindBy(xpath = "//div[text()='One uppercase character']") public WebElement passwordBuyukHarfUyarıMesajı;
    @FindBy(xpath = "//div[text()='One lowercase character']") public WebElement passwordKucukHarfUyarıMesajı;
    @FindBy(xpath = "//div[text()='One number']") public WebElement passwordRakamUyarıMesajı;

}

