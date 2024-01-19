package team02.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team02.utilities.Driver;

public class ViceDeanAddTeacherPage {
    public ViceDeanAddTeacherPage () {PageFactory.initElements(Driver.getDriver(),this);}
        @FindBy(xpath = "//*[@href='/login']") public WebElement loginLink;
        @FindBy(xpath = "//a[text()='Teacher Management']") public WebElement teacherManagementButton;





    }

