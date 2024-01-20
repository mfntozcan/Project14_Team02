package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team02.utilities.Driver;


public class HomePageAykut {
    public HomePageAykut(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath ="//button[@class='fw-semibold text-white bg-primary navbar-toggler collapsed']") public WebElement menu;

    @FindBy(xpath = "//*[.='Meet Management']") public WebElement meetManagementButton;

    @FindBy(xpath = "//a[@class='header_link ms-2']") public WebElement login;

    @FindBy(xpath = "(//button[@type='button'])[3]") public WebElement loginButton;
    @FindBy(id = "username") public WebElement userName;
    @FindBy(id="password") public WebElement password;


}
