package team02.stepDefinition.ui_step_defs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.openqa.selenium.interactions.Actions;
import team02.utilities.ConfigReader;
import team02.utilities.Driver;
import team02.utilities.ReusableMethods;

import java.sql.ResultSet;

public class DeanManagementStepDefs {
    ResultSet resultSet;
    AddDeanPage addDean = new AddDeanPage();
    DeanManagementPage deanManagementPage = new DeanManagementPage();
    Faker faker = new Faker();
    Response response;
    Actions actions = new Actions(Driver.getDriver());


    String name;
    static int userId;

    @Given("Kullanici web sitesine girer")
    public void kullaniciWebSitesineGirer() {
        Driver.getDriver().get(ConfigReader.getProperty("manage_Url"));
    }

    @When("Kullanici login e tiklar")
    public void kullanici_login_e_tiklar() {
        addDean = new AddDeanPage();
        if (addDean.loginLink.isDisplayed()) {
            addDean.loginLink.click();
        } else {
            addDean.menuButton.click();
        }
    }

    @When("Username kutusuna {string} girer")
    public void username_i_girer(String string) {
        addDean.usernameBox.sendKeys(string);
    }

    @When("Password kutusuna {string} girer")
    public void password_i_girer(String string) {
        addDean.passwordBox.sendKeys(string);
    }



    @When("Login butonuna tiklar")
    public void login_butonuna_tiklar() {
        ReusableMethods.clickElementByJS(addDean.loginButton);
    }


    @And("Menu butonuna gider")
    public void menu_butonuna_gider() {
        ReusableMethods.bekle(1);
        ReusableMethods.click(deanManagementPage.menuButton);
    }

    @And("Dean Management butonuna tiklar")
    public void deanManagementButonunaTiklar() {
        ReusableMethods.click(deanManagementPage.DeanManagementButton);
    }

    @And("Edit butonuna tiklar")
    public void EditButonunaTiklar() {
        ReusableMethods.bekle(1);
        ReusableMethods.click(deanManagementPage.EditButton);
    }

    @And("Birth Place butonu bilgileri guncellenir")
    public void BirthPlaceButonuBilgileriGuncellenir(){
        ReusableMethods.bekle(1);
        ReusableMethods.cleanByJs(deanManagementPage.EditBirthPlaceButton);

        deanManagementPage.EditBirthPlaceButton.sendKeys("Istanbul");}

    @And("Male buttona tiklar")
    public void MaleButtonaTiklar(){
        ReusableMethods.click(deanManagementPage.updateGenderButton);
    }

    @And("Password kutusuna password girilir")
    public void PasswordTekrarGirilir(){
        deanManagementPage.updatePasswordButton.sendKeys("Kagan1610");
    }

    @And("Guncelleme onayi icin submit butonuna tiklanir")
    public void updateSubmitTiklar(){
        deanManagementPage.submitButton.click();
    }
    @Then("Dean Update Successfull yazisi gorulmeli")
    public void DeanUpdateYazisiGorulmeli(){
        ReusableMethods.bekle(1);
        deanManagementPage.DeanUpdatedSuccesfull.isDisplayed();

    }
}


