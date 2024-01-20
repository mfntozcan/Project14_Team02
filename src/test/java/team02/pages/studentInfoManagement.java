package team02.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team02.utilities.Driver;


public class studentInfoManagement {
    public studentInfoManagement(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//*[.='Grades and Announcements']") public WebElement gradesandAnnouncementsButton;

    @FindBy(xpath = "//*[.='Student Info List']") public WebElement studentInfoList;

    @FindBy(xpath = "//*[.='Final Exam']") public  WebElement examGrade;

    @FindBy(xpath = "(//table[@class='table table-striped table-bordered table-hover'])[2]") public WebElement meetList;

}
