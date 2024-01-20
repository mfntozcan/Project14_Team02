package team02.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team02.utilities.Driver;


public class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='header_link ms-2']")
    public WebElement loginButonu;

    @FindBy (xpath = "//*[@id='username']")
    public WebElement loginUsernameBox;

    @FindBy (xpath = "//*[@class='fw-semibold text-white bg-primary navbar-toggler collapsed']")
    public WebElement menu;





























    //Safiye(50-150)"Contact Us" kismi ile ilgili locateler

    @FindBy(xpath = "//a[text()='Contact']")
    public WebElement contactLinki_AC;

    @FindBy(css = "#name")
    public WebElement yournameKutusu_AC;
    @FindBy(css = "#email")
    public WebElement yourEmailKutusu_AC;

    @FindBy(css = "#subject")
    public WebElement subjectKutusu_AC;

    @FindBy(css = "#message")
    public WebElement messageKutusu_AC;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement yournameKutusuRequired_AC;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[2]")
    public WebElement youremailKutusuRequired_AC;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[3]")
    public WebElement subjectKutusuRequired_AC;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[4]")
    public WebElement messageKutusuRequired_AC;

    @FindBy(xpath = "//button[text()='Send Message']")
    public WebElement sendMessageButton_AC;

    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement contactMessageCreated_AC;
    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement pleaseEnterValidEmailYazisi_AC;


}
