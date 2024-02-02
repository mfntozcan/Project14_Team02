package team02.stepDefinition.api_step_defs;

import io.cucumber.java.en.*;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import team02.pojos.dean_controller.DeanPostPojo;
import team02.pojos.dean_controller.DeanPostResponsePojo;
import static io.restassured.RestAssured.given;

import static org.junit.Assert.assertEquals;
import static team02.base_url.BaseUrl.setUp;
import static team02.base_url.BaseUrl.spec;

public class DeanControllerApi {
    DeanPostPojo payload;
    Response response;
    DeanPostResponsePojo actualData;
    static int userId;
    DeanPostPojo expectedData;

    @When("Menu butonuna tiklar")
    public void menu_butonuna_tiklar() {
        ReusableMethods.bekle(1);
        addDean.menuButton.click();
    }




    @When("DeanName kutusuna {string} girer")
    public void dean_name_kutusuna_girer(String str) {
        name = faker.name().firstName();
        if (str.equals("bir isim")) {
            addDean.name.sendKeys(name);
        } else {
            addDean.name.sendKeys(str);
        }
    }
    @When("DeanSurName kutusuna {string} girer")
    public void dean_sur_name_kutusuna_girer(String str) {
        String surname = faker.name().lastName();
        if (str.equals("bir soyisim")) {
            addDean.surname.sendKeys(surname);
        } else {
            addDean.surname.sendKeys(str);
        }
    }
    @When("DeanBirthPlace kutusuna {string} girer")
    public void dean_birth_place_kutusuna_girer(String str) {
        String birthPlace = faker.lorem().word();
        if (str.equals("bir yer ismi")) {
            addDean.birthPlace.sendKeys(birthPlace);
        } else  {
            addDean.birthPlace.sendKeys(str);
            ReusableMethods.waitFor(2);
        }

    }
    @When("DeanGender {string} secenegini girer")
    public void dean_gender_secenegini_girer(String str) {
        String gender = "";
        if (str.equalsIgnoreCase("FEMALE")) {
            addDean.genderFemale.click();
            gender = "FEMALE";
        } else if (str.equalsIgnoreCase("MALE")) {
            addDean.genderMale.click();
            gender = "MALE";
        } else {
            System.out.println("Hatalı veri girdiniz.");
        }
        ReusableMethods.waitFor(2);
    }
    @When("DeanDateOfBirth kutusuna {string} girer")
    public void dean_date_of_birth_kutusuna_girer(String tarih) {
        addDean.birthDay.sendKeys(tarih);
        ReusableMethods.waitFor(2);
    }
    @When("DeanPhone kutusuna {string} girer")
    public void dean_phone_kutusuna_girer(String str) {
        if (str.equals("bir telefon numarasi")) {
            String ListPhoneNo = faker.regexify("[0-9]{3}-[0-9]{3}-[0-9]{4}");
            addDean.phoneNumber.sendKeys(ListPhoneNo);
        } else {
            addDean.phoneNumber.sendKeys(str);
        }
    }

    public static String ListSSNNo;
    @And("DeanSSN kutusuna {string} girer")
    public void deanssnKutusunaGirer(String ssn) {
        if (ssn.equals("bir ssn numarasi")) {

            ListSSNNo = faker.regexify("[0-8]{3}-[0-9]{2}-[0-9]{4}");
            addDean.ssn.sendKeys(ListSSNNo);
        } else {
            addDean.ssn.sendKeys(ssn);
        }
        ReusableMethods.waitFor(2);
    }

    @When("DeanUserName kutusuna {string} girer")
    public void dean_user_name_kutusuna_girer(String str) {
        String username = faker.random().nextInt(1000,9999)+ "yusuf";
        if (str.equals("bir kullanici adi")) {
            addDean.username.sendKeys(username);
        } else {
            addDean.username.sendKeys(str);
        }
    }

    @When("DeanPassword kutusuna sifre girer")
    public void dean_password_kutusuna_sifre_girer() {
        addDean.deanPassword.sendKeys("12345678Aa");
    }


    @When("Dean password kutusunu bos birakir")
    public void dean_password_kutusunu_bos_birakir(){addDean.deanPassword.sendKeys("");}

    @When("DeanSubmit butonuna tiklar")
    public void dean_submit_butonuna_tiklar() {
        addDean.deanSubmit.click();
        ReusableMethods.waitFor(2);
    }

    @Then("Dean kayit yapilamadigini dogrular")
    public void dean_kayit_yapilamadigini_dogrular(){Assert.assertTrue(addDean.deanSavedPopUp.isEnabled());}

    @Then("Dean kaydi yapildigi dogrulanir")
    public void dean_kaydi_yapildigi_dogrulanir() {
        Assert.assertTrue(addDean.deanSavedPopUp.isDisplayed());
    }
}
