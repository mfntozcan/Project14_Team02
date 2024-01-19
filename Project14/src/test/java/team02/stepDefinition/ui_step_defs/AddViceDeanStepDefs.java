package team02.stepDefinition.ui_step_defs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;
import team02.pages.AddViceDeanPage;
import team02.utilities.ConfigReader;
import team02.utilities.Driver;
import team02.utilities.ReusableMethods;

import java.sql.ResultSet;

public class AddViceDeanStepDefs {

    ResultSet resultSet;
    AddViceDeanPage addVicedean = new AddViceDeanPage();
    Faker faker = new Faker();
    Response response;
    String name;
    static int userId;

    @Given("Kullanici Web sitesine gider")
    public void Kullanici_websitesine_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("manage_Url"));
    }

    @When("Kullanici Logine tiklar")
    public void Kullanici_logine_tiklar() {
        addVicedean = new AddViceDeanPage();
        if (addVicedean.loginLink.isDisplayed()) {
            addVicedean.loginLink.click();
        } else {
            addVicedean.menuButton.click();
        }
    }

    @When("Username Kutusuna {string} girer")
    public void usernamei_girer(String string) {
        addVicedean.usernameBox.sendKeys(string);
    }

    @When("Password Kutusuna {string} girer")
    public void password_i_girer(String string) {
        addVicedean.passwordBox.sendKeys(string);
    }

    @When("Login Butonuna tiklar")
    public void login_butonunun_icine_tiklar() {
        ReusableMethods.clickElementByJS(addVicedean.loginButton);
    }

    @When("Menu Butonuna tiklar")
    public void menu_butonuna_tiklar() {
        addVicedean.menuButton.click();
    }

    @And("Vice Dean Management butonuna tiklar")
    public void Vice_DeanManagementButton() {
        addVicedean.viceDeanManagementButton.click();
    }


    @When("ViceDeanName kutusuna {string} girer")
    public void Vice_Dean_kutusunagirer(String str) {
        name = faker.name().firstName();
        if (str.equals("bir isim")) {
            addVicedean.name.sendKeys(name);
        } else {
            addVicedean.name.sendKeys(str);
        }
    }

    @When("Vice DeanSurName kutusuna {string} girer")
    public void vice_dean_sur_name_kutusuna_girer(String str) {
        String surname = faker.name().lastName();
        if (str.equals("bir soyisim")) {
            addVicedean.surname.sendKeys(surname);
        } else {
            addVicedean.surname.sendKeys(str);
        }
    }
    @When("Vice DeanBirthPlace kutusuna {string} girer")
    public void vice_dean_birth_place_kutusuna_girer(String str) {
        String birthPlace = faker.lorem().word();
        if (str.equals("bir yer ismi")) {
            addVicedean.birthPlace.sendKeys(birthPlace);
        } else  {
            addVicedean.birthPlace.sendKeys(str);
            ReusableMethods.waitFor(2);
        }

    }
    @When("Vice DeanGender {string} secenegini girer")
    public void vice_dean_gender_secenegini_girer(String str) {
        String gender = "";
        if (str.equalsIgnoreCase("FEMALE")) {
            addVicedean.genderFemale.click();
            gender = "FEMALE";
        } else if (str.equalsIgnoreCase("MALE")) {
            addVicedean.genderMale.click();
            gender = "MALE";
        } else {
            System.out.println("Hatalı veri girdiniz.");
        }
        ReusableMethods.waitFor(2);
    }
    @When("Vice DeanDateOfBirth kutusuna {string} girer")
    public void vice_dean_date_of_birth_kutusuna_girer(String tarih) {
        addVicedean.birthDay.sendKeys(tarih);
        ReusableMethods.waitFor(2);
    }
    @When("Vice DeanPhone kutusuna {string} girer")
    public void vice_dean_phone_kutusuna_girer(String str) {
        if (str.equals("bir telefon numarasi")) {
            String ListPhoneNo = faker.regexify("[0-9]{3}-[0-9]{3}-[0-9]{4}");
            addVicedean.phoneNumber.sendKeys(ListPhoneNo);
        } else {
            addVicedean.phoneNumber.sendKeys(str);
        }
    }

    public static String ListSSNNo;
    @And("Vice DeanSSN kutusuna {string} girer")
    public void vice_deanssnKutusunaGirer(String ssn) {
        if (ssn.equals("bir ssn numarasi")) {
            ListSSNNo = faker.regexify("[0-8]{3}-[0-9]{2}-[0-9]{4}");
            addVicedean.ssn.sendKeys(ListSSNNo);
        } else {
            addVicedean.ssn.sendKeys(ssn);
        }
        ReusableMethods.waitFor(2);
    }

    @When("Vice DeanUserName kutusuna {string} girer")
    public void vice_dean_user_name_kutusuna_girer(String str) {
        String username = faker.random().nextInt(1000,9999)+ "ali";
        if (str.equals("bir kullanici adi")) {
            addVicedean.username.sendKeys(username);
        } else {
            addVicedean.username.sendKeys(str);
        }
    }

    @When("Vice DeanPassword kutusuna sifre girer")
    public void vice_dean_password_kutusuna_sifre_girer() {
        addVicedean.adminPassword.sendKeys("Celal7186.");
    }

    @When("Vice DeanSubmit butonuna tiklar")
    public void vice_dean_submit_butonuna_tiklar() {
        addVicedean.adminSubmit.click();
        ReusableMethods.waitFor(2);
    }

    @Then("Vice Dean kaydi yapildigi dogrulanir")
    public void vice_dean_kaydi_yapildigi_dogrulanir() {
        Assert.assertTrue(addVicedean.VicedeanSavedPopUp.isDisplayed());
    }
    @Then("Vice Dean kaydi yapilamadigi dogrulanir")
    public void vice_dean_kaydi_yapilamadigi_dogrulanir() {
        Assert.assertTrue(addVicedean.VicedeanSavedPopUp.isDisplayed());
    }

}

