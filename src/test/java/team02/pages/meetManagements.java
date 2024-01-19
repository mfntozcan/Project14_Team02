package team02.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team02.utilities.Driver;


public class meetManagements {
public meetManagements(){
    
    PageFactory.initElements(Driver.getDriver(),this);
}

@FindBy(xpath = "(//*[.='Meet Management'])[2]") public WebElement meetManagement;

@FindBy(xpath = "//*[.='Date']") public WebElement date;
    @FindBy(xpath = "//*[.='Start Time']") public WebElement startTime;

    @FindBy(xpath = "(//*[.='Meet Management'])[3]") public WebElement meetManagementEkrani;
    @FindBy(xpath = "//*[.='Stop Time']") public WebElement stopTime;
    @FindBy(xpath = "//*[.='Description']") public WebElement description;
    @FindBy(xpath = "//button[@class='text-dark btn btn-outline-info']") public WebElement edit;

    @FindBy(xpath = "//div[@class=' css-v7duua']") public WebElement ogrenciSilmeButonu;

    //@FindBy(id = "react-select-3-listbox") public WebElement ogrenciList;

    @FindBy(xpath = "(//div[@class=' css-19bb58m'])[2]") public WebElement StudentList;


    @FindBy(id = "react-seLect-a-listbox") public WebElement ogrenciListMenu;

  //  @FindBy(xpath = "(//div[@class=' css-19bb58m'])[2]") public WebElement ListButton;

    @FindBy(id = "react-select-3-placeholder") public WebElement listButton;

    @FindBy(id = "date") public WebElement dateButton;

    @FindBy(xpath = "(//button[@class='fw-semibold btn btn-primary btn-lg'])[2]") public WebElement summitButton;

    @FindBy(xpath = "//*[@class='Toastify__toast-body']")
    public WebElement editSubmitVerifyEp;

    @FindBy(xpath = "(//input[@id='description'])[2]") public WebElement descriptionBilgisi;

    @FindBy(xpath = "(//input[@id='startTime'])[2]") public WebElement startTimeButton;
    @FindBy(xpath = "(//button[@class='btn btn-danger'])[2]") public WebElement deleteButton;

    @FindBy(xpath = "//*[@class='Toastify__toast-container Toastify__toast-container--top-center'])[1]") public WebElement deleteVerify;
}
