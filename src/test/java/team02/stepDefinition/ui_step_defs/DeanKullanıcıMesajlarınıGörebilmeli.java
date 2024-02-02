package team02.stepDefinition.ui_step_defs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import team02.hooks.Hooks;
import team02.pages.DeanPageAltay;
import team02.pages.MehmetPage;
import team02.pojos.dean_controller.DeanPostPojo;
import team02.utilities.ConfigReader;
import team02.utilities.Driver;
import team02.utilities.ReusableMethods;


public class DeanKullanıcıMesajlarınıGörebilmeli {


    DeanPageAltay deanPageAltay = new DeanPageAltay();

    MehmetPage mehmetPage = new MehmetPage();

    ReusableMethods reusableMethods = new ReusableMethods();
    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();
    Hooks hooks = new Hooks();



    @And("Dean olarak uygulamaya giriş yap")
    public void deanOlarakUygulamayaGirişYap() {
            deanPageAltay.loginButtonTikla.sendKeys(Keys.ENTER);

        }


    @When("ViceDean Management a tikla")
    public void vicedeanManagementATikla() {
        deanPageAltay.viceDeanManagement.click();
        ReusableMethods.bekle(2);

    }

    @Then("Vice Dean List sayfasının göründüğünü dogrula")
    public void viceDeanListSayfasınınGöründüğünüDogrula()throws InterruptedException {
        Assert.assertTrue(deanPageAltay.viceDeanYazisi.isDisplayed());
    }

    @Then("Silme Butonunun göründüğünü doğrula")
    public void silmeButonununGöründüğünüDoğrula() {
        Assert.assertFalse(deanPageAltay.silmeButonu.isDisplayed());
    }

    @When("Main Menu den Contact Get All linkine tıkla")
    public void mainMenuDenContactGetAllLinkineTıkla() {
        deanPageAltay.contactGetAll.click();
        ReusableMethods.bekle(2);


    }

    @Then("Name bilgilerinin göründüğünü dogrula")
    public void nameBilgilerininGöründüğünüDogrula(){
        deanPageAltay.nameBilgisi.getText().equals("Malik");

    }

    @Then("Email  bilgilerinin göründüğünü dogrula")
    public void emailBilgilerininGöründüğünüDogrula() {
        Assert.assertTrue(deanPageAltay.emailBilgisi.isDisplayed());
    }

    @Then("Date  bilgilerinin göründüğünü dogrula")
    public void dateBilgilerininGöründüğünüDogrula() {
        Assert.assertTrue(deanPageAltay.tarihBilgisi.isDisplayed());
    }

    @Then("Subject  bilgilerinin göründüğünü dogrula")
    public void subjectBilgilerininGöründüğünüDogrula() {
        Assert.assertTrue(deanPageAltay.subjectBilgisi.isDisplayed());
    }

    @Then("Message  bilgilerinin göründüğünü dogrula")
    public void messageBilgilerininGöründüğünüDogrula() {
        Assert.assertTrue(deanPageAltay.mesajBilgisi.isDisplayed());

    }

    @Then("Contact Message sayfasının göründüğünü dogrula")
    public void contactMessageSayfasınınGöründüğünüDogrula() {
        Assert.assertTrue(deanPageAltay.contactMessage.isDisplayed());
    }

    @Then("Message sütunundan mesaj silinebildigini doğrula")
    public void messageSütunundanMesajSilinebildiginiDoğrula()throws InterruptedException {
        Assert.assertSame("sil", "message ");


    }
}
