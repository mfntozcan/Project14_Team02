package team02.stepDefinition.ui_step_defs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import team02.pages.*;
import team02.utilities.ConfigReader;
import team02.utilities.Driver;
import team02.utilities.ReusableMethods;

import java.time.Duration;


public class NewAdminAccount {

    homePage homePage=new homePage();
    chooseLesson chooseLesson = new chooseLesson();
    meetManagements meetManagements = new meetManagements();

    adminManagement adminManagement=new adminManagement();

    studentInfoManagement studentInfoManagement=new studentInfoManagement();


    @And("Admin kullanici adi ve password bilgileri ile login olur")
    public void adminKullaniciAdiVePasswordBilgileriIleLoginOlur() {

        homePage.userName.sendKeys("Pasatekir");
        homePage.password.sendKeys("Pasa123.");
        homePage.loginButton.click();
    }

    @When("kullanici acilan ekranda Admin Management butonuna tiklar")
    public void kullaniciAcilanEkrandaAdminManagementButonunaTiklar() {
        adminManagement.adminManagementButton.click();



    }

    @Then("kullanici Add Admin sayfasinin acildigini dogrular")
    public void kullaniciAddAdminSayfasininAcildiginiDogrular() {
        Assert.assertTrue(adminManagement.addAdminPage.isDisplayed());

    }


    @Then("Name Bos birakilamadigi dogrulanir")
    public void nameBosBirakilamadigiDogrulanir() {

        adminManagement.name.sendKeys("");
       adminManagement.summitButton.click();
       String actualResault=adminManagement.requiredName.getText();
       Assert.assertTrue(actualResault.contains("Required"));


    }


    @Then("Surname Bos birakilamadigi dogrulanir")
    public void surnameBosBirakilamadigiDogrulanir() {
        adminManagement.surname.sendKeys("");
        adminManagement.summitButton.click();
        String actualResault=adminManagement.requiredSurname.getText();
        Assert.assertTrue(actualResault.contains("Required"));
    }


    @Then("Birt Place bos birakilamadigi dogrulanir")
    public void birtPlaceBosBirakilamadigiDogrulanir() {
        adminManagement.birthPlace.sendKeys("");
        adminManagement.summitButton.click();
        String actualResault=adminManagement.requiredBirthPlace.getText();
        Assert.assertTrue(actualResault.contains("Required"));
    }

    @When("Gender alanindan Cinsivet secilmeli")
    public void genderAlanindanCinsivetSecilmeli() {
        adminManagement.gender.click();
    }

    @Then("Gender Bos birakilamadigi dogrulanir")
    public void genderBosBirakilamadigiDogrulanir() {
    }

    @When("Dogum tarihi alanina tiklanir ve tarih girilir")
    public void dogumTarihiAlaninaTiklanirVeTarihGirilir() {
        adminManagement.birthDay.sendKeys("12121997");
    }

    @Then("Dogum tarihinin bos birakilamadigi dogrulanir")
    public void dogumTarihininBosBirakilamadigiDogrulanir() {
        adminManagement.birthDay.sendKeys("");
        adminManagement.summitButton.click();
        String actualResault=adminManagement.requiredDateOfBirth.getText();
        Assert.assertTrue(actualResault.contains("Required"));
    }

    @When("Phone alanina \\(xxx-xxx-xxxx) formatinada no girilir")
    public void phoneAlaninaXxxXxxXxxxFormatinadaNoGirilir() {
        adminManagement.phoneNumber.sendKeys("456-454-9454");
    }

    @Then("phone alaninin bos birakilamadigi dogrulanir")
    public void phoneAlanininBosBirakilamadigiDogrulanir() {
        adminManagement.phoneNumber.sendKeys("");
        adminManagement.summitButton.click();
        String actualResault=adminManagement.requiredPhone.getText();
        Assert.assertTrue(actualResault.contains("Required"));
    }

    @When("Ssn alanina \\(xxx-xx-xxxx) formatinda ssn girilir")
    public void ssnAlaninaXxxXxXxxxFormatindaSsnGirilir() {
        adminManagement.ssn.sendKeys("859-23-4877");
    }

    @Then("Ssn alaninin bos birakilamadigi dogrulanir")
    public void ssnAlanininBosBirakilamadigiDogrulanir() {
        adminManagement.ssn.sendKeys("");
        adminManagement.summitButton.click();
        String actualResault=adminManagement.requiredSsn.getText();
        Assert.assertTrue(actualResault.contains("Required"));
    }

    @When("Username alanina Name bilgisi girilir")
    public void usernameAlaninaNameBilgisiGirilir() {
        adminManagement.userName.sendKeys("Aliiyilmaz123");
    }

    @Then("Username alaninin bos birakilamadigi dogrulanir")
    public void usernameAlanininBosBirakilamadigiDogrulanir() {
        adminManagement.userName.sendKeys("");
        adminManagement.summitButton.click();
        String actualResault=adminManagement.requiredUserName.getText();
        Assert.assertTrue(actualResault.contains("Required"));
    }

    @When("Password alanina Password bilgisi girilir")
    public void passwordAlaninaPasswordBilgisiGirilir() {
        adminManagement.password.sendKeys("Ali1234.");
    }

    @Then("Password bilgisinin bos birakilamadigi dogrulanir")
    public void passwordBilgisininBosBirakilamadigiDogrulanir() {
        adminManagement.password.sendKeys("");
        adminManagement.summitButton.click();
        String actualResault=adminManagement.requiredPassword.getText();
        Assert.assertTrue(actualResault.contains("Enter your password"));
    }

    @And("submit butonuna tiklanir")
    public void submitButonunaTiklanir() {
        adminManagement.summitButton.click();

    }

    @Then("Admin List alaninda admin olusturuldugu dogrulanir")
    public void adminListAlanindaAdminOlusturulduguDogrulanir() {
        ReusableMethods.visibleWait(adminManagement.adminSavedYazisi_IO, 5);
        Assert.assertTrue(adminManagement.adminSavedYazisi_IO.isDisplayed());

    }

    @When("Name alanina tikla ve Name girilir")
    public void nameAlaninaTiklaVeNameGirilir() {
        adminManagement.name.sendKeys("Alii");


    }

    @When("Surname alanina tikla ve Surname girilmeli")
    public void surnameAlaninaTiklaVeSurnameGirilmeli() {
    adminManagement.surname.sendKeys("Yilmaz");
    }

    @When("Birth Place alanina tikla ve Birth Place girilmeli")
    public void birthPlaceAlaninaTiklaVeBirthPlaceGirilmeli() {
        adminManagement.birthPlace.sendKeys("Ankara");
    }

    @Given("kullanici Management On Schools sayfasina gider")
    public void kullaniciManagementOnSchoolsSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("manage_Url"));
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


    }

    @When("Kullanici menu butonuna tiklar")
    public void kullaniciMenuButonunaTiklar() {
        homePage.menu.click();
    }


}
