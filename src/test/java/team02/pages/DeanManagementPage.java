package team02.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team02.utilities.Driver;

public class DeanManagementPage {
    public DeanManagementPage (){PageFactory.initElements(Driver.getDriver(),this);}
    @FindBy(xpath = "(//a[@class='page-link'])[4]") public WebElement LastPage;
    @FindBy(xpath = "//button[text()='Menu']") public WebElement menuButton;
    @FindBy(xpath = "/html/body/div/div/header/div[1]/div/div/div/nav/button") public WebElement MenuButtonYusuf;
    @FindBy(xpath = "//*[@id='root']/div/main/div/div[1]/div[3]/div/div/div[1]/table/tbody/tr[3]/td[6]/span/button")
    public WebElement EditButton;
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/a[2]") public WebElement DeanManagementButton;

    @FindBy(xpath = "(//*[@id='birthPlace'])[2]") public WebElement EditBirthPlaceButton;
    @FindBy(xpath = "/html/body/div[3]/div/div/div[2]/div[1]/div/div/form/div/div[4]/div/div[2]/div/input")
    public WebElement updateGenderButton;
    @FindBy(xpath = "(//*[@id='password'])[2]") public WebElement updatePasswordButton;
    @FindBy(xpath = "/html/body/div[3]/div/div/div[2]/div[2]/button") public WebElement submitButton;
    @FindBy(xpath = "(//div[@class='Toastify__toast-body'])[1]")
    public WebElement DeanUpdatedSuccesfull;

}
