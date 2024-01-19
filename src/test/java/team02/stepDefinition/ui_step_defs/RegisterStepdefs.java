package team02.stepDefinition.ui_step_defs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import team02.pages.RegisterPage;
import team02.utilities.Driver;
import team02.utilities.ReusableMethods;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import static org.junit.Assert.assertTrue;

public class RegisterStepdefs {
    @Given("kullanici {string} e gider_AC")
    public void kullaniciEGider_AC(String url) {
        Driver.getDriver().get(url);
    }

    RegisterPage registerPage = new RegisterPage();
    public static Faker fakerAC = new Faker();

    public static String nameAC = fakerAC.name().firstName();
    public static String surnameAC = fakerAC.name().lastName();
    public static String phoneNummerAC = fakerAC.number().numberBetween(100, 999) + "-" + fakerAC.number().numberBetween(100, 999) + "-" + fakerAC.number().numberBetween(1000, 9999);
    public static String ssnAC = fakerAC.number().numberBetween(100, 899) + "-" + fakerAC.number().numberBetween(10, 99) + "-" + fakerAC.number().numberBetween(1000, 9999);
    public static String birthPlaceAC = fakerAC.address().city();
    public static Date dateAC = fakerAC.date().birthday(25, 60);
    static SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
    static SimpleDateFormat fortmat2 = new SimpleDateFormat("yyyy-MM-dd");
    public static String dateOfBirthAC = format.format(dateAC);
    public static String birthdayAC = fortmat2.format(dateAC);
    public static String userNameAC = nameAC + surnameAC;

    public static String passwordAC = fakerAC.internet().password() + "Aa2";


    @And("kullanici Register butonuna tiklar_AC")
    public void kullaniciRegisterButonunaTiklar_AC() {
        registerPage = new RegisterPage();
        ReusableMethods.click(registerPage.registerButton_AC);
    }

    @Then("kullanici name alanina isim girer_AC")
    public void kullaniciNameAlaninaIsimGirer_AC() {
        ReusableMethods.bekle(1);
        registerPage.nameKutusu_AC.sendKeys(nameAC);
    }

    @And("kullanici surname alanina soyisim girer_AC")
    public void kullaniciSurnameAlaninaSoyisimGirer_AC() {
        ReusableMethods.bekle(1);
        registerPage.surnameKutusu_AC.sendKeys(surnameAC);
    }

    @And("kullanici Birth Place alanina dogum yeri girer_AC")
    public void kullaniciBirthPlaceAlaninaDogumYeriGirer_AC() {
        ReusableMethods.bekle(1);
        registerPage.birthPlaceKutusu_AC.sendKeys(birthPlaceAC);
    }

    @And("kullanici Phone Number alanina telefonnumarasi girer_AC")
    public void kullaniciPhoneNumberAlaninaTelefonnumarasiGirer_AC() {
        ReusableMethods.bekle(1);
        registerPage.phoneNumberKutusu_AC.sendKeys(phoneNummerAC);
    }

    @And("kullanici Gender alanindan cinsiyet secer_AC")
    public void kullaniciGenderAlanindanCinsiyetSecer_AC() {
        ReusableMethods.bekle(1);
        ReusableMethods.click(registerPage.genderRadioButtun_AC);
    }

    @And("kullanici Birth Date alanina dogum gunu girer_AC")
    public void kullaniciBirthDateAlaninaDogumGunuGirer_AC() {
        ReusableMethods.bekle(1);
        registerPage.birthDayKutusu_AC.sendKeys(generateRandomDate());
    }
    public static String generateRandomDate() {
        Random random = new Random();

        int day = 1 + random.nextInt(31); // 1 ile 31 arasında rastgele bir gun
        int month = 1 + random.nextInt(12); // 1 ile 12 arasında rastgele bir ay
        int year = 1990 + random.nextInt(33); // 1990 ile 2022 arasında rastgele bir yil(yil araligini degistirebiliriz)

        return day + "." + month + "." + year;
    }

    @And("kullanici SSN alanina ssn girer_AC")
    public void kullaniciSSNAlaninaSsnGirer_AC() {
        ReusableMethods.bekle(1);
        registerPage.ssnKutusu_AC.sendKeys(ssnAC);
    }

    @And("kullanici User Name alanina username girer_AC")
    public void kullaniciUserNameAlaninaUsernameGirer_AC() {
        ReusableMethods.bekle(1);
        registerPage.userNameKutusu_AC.sendKeys(userNameAC);
    }

    @And("kullanici Password alanina password girer_AC")
    public void kullaniciPasswordAlaninaPasswordGirer_AC() {
        ReusableMethods.bekle(1);
        registerPage.passwordKutusu_AC.sendKeys(passwordAC);
    }

    @And("kullanici Register dugmesine tiklar_AC")
    public void kullaniciRegisterDugmesineTiklar_AC() {
        ReusableMethods.bekle(1);
        ReusableMethods.click(registerPage.registerMaviButton_AC);
        ReusableMethods.bekle(2);
    }

    @And("Kayit islemi basariyla tamamlanir_AC")
    public void kayitIslemiBasariylaTamamlanir_AC() {
        ReusableMethods.visibleWait(registerPage.guestUserRegisterYazisi_AC, 5);
        assertTrue(registerPage.guestUserRegisterYazisi_AC.getText().contains("Guest User registered."));
    }

    @And("Kullanici sayfayi kapatir_AC")
    public void kullaniciSayfayiKapatir_AC() {
        Driver.closeDriver();
    }

}