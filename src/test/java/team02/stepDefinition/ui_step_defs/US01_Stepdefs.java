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

public class US01_Stepdefs {
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

    @And("Name kutusu bos olunca kayit isleminin tamamlanmadigini dogrular_AC")
    public void nameKutusuBosOluncaKayitIslemininTamamlanmadiginiDogrular_AC() {
        ReusableMethods.bekle(2);
        ReusableMethods.scroll(registerPage.nameKutusu_AC);
        ReusableMethods.bekle(2);
        assertTrue(registerPage.nameRequried_AC.isDisplayed());
    }

    @And("Surname kutusu bos olunca kayit isleminin tamamlanmadigini dogrular_AC")
    public void surnameKutusuBosOluncaKayitIslemininTamamlanmadiginiDogrular_AC() {
        ReusableMethods.bekle(2);
        ReusableMethods.scroll(registerPage.surnameKutusu_AC);
        ReusableMethods.bekle(2);
        assertTrue(registerPage.surnameRequried_AC.isDisplayed());
    }

    @And("kullanici Birth Place alanini bos birakir_AC")
    public void kullaniciBirthPlaceAlaniniBosBirakir_AC() {
    }

    @And("Birth Place kutusu bos olunca kayit isleminin tamamlanmadigini dogrular_AC")
    public void birthPlaceKutusuBosOluncaKayitIslemininTamamlanmadiginiDogrular_AC() {
        ReusableMethods.bekle(2);
        ReusableMethods.scroll(registerPage.birthPlaceKutusu_AC);
        ReusableMethods.bekle(2);
        assertTrue(registerPage.birthplaceRequried_AC.isDisplayed());
    }

    @And("kullanici Phone Number alanini bos birak_AC")
    public void kullaniciPhoneNumberAlaniniBosBirak_AC() {
    }

    @And("phone Number kutusu bos olunca kayit isleminin tamamlanmadigini dogrular_AC")
    public void phoneNumberKutusuBosOluncaKayitIslemininTamamlanmadiginiDogrular_AC() {
        ReusableMethods.bekle(2);
        ReusableMethods.scroll(registerPage.phoneNumberKutusu_AC);
        assertTrue(registerPage.phoneRequried_AC.isDisplayed());
    }

    @And("kullanici Phone Number alanina patterne uygun olmayan bir numara girer_AC")
    public void kullaniciPhoneNumberAlaninaPatterneUygunOlmayanBirNumaraGirer_AC() {
        registerPage.phoneNumberKutusu_AC.sendKeys("323-432-12348");
        ReusableMethods.bekle(2);
    }

    @And("Phone Number alanina patterne uygun olmayan bir numara girildigi icin kayit isleminin tamamlanmadigini dogrular_AC")
    public void phoneNumberAlaninaPatterneUygunOlmayanBirNumaraGirildigiIcinKayitIslemininTamamlanmadiginiDogrular_AC() {
        assertTrue(registerPage.phoneNumberUyari_AC.getText().contains("Please enter valid phone number"));
    }

    @And("kullanici SSN alanina patterne uygun olmayan bir numara girer_AC")
    public void kullaniciSSNAlaninaPatterneUygunOlmayanBirNumaraGirer_AC() {
        registerPage.ssnKutusu_AC.sendKeys("423-732-1234");
        ReusableMethods.bekle(2);
    }

    @And("SSN alanina patterne uygun olmayan bir numara girildigi icin kayit isleminin tamamlanmadigini dogrular_AC")
    public void ssnAlaninaPatterneUygunOlmayanBirNumaraGirildigiIcinKayitIslemininTamamlanmadiginiDogrular_AC() {
        assertTrue(registerPage.ssnHataYazisi_AC.isDisplayed());
    }

    @And("kullanici SSN alanini bos birakir_AC")
    public void kullaniciSSNAlaniniBosBirakir_AC() {
    }

    @And("ssn kutusu bos olunca kayit isleminin tamamlanmadigini dogrular_AC")
    public void ssnKutusuBosOluncaKayitIslemininTamamlanmadiginiDogrular_AC() {
            ReusableMethods.bekle(2);
            ReusableMethods.scroll(registerPage.ssnKutusu_AC);
            assertTrue(registerPage.ssnRequried_AC.isDisplayed());
    }


    @And("kullanici Birth Date alanini bos birakir_AC")
    public void kullaniciBirthDateAlaniniBosBirakir_AC() {
    }

    @And("Birth Date alanini bos birakinca kayit olunamadigini dogrular_AC")
    public void birthDateAlaniniBosBirakincaKayitOlunamadiginiDogrular_AC() {
        ReusableMethods.bekle(2);
        ReusableMethods.scroll(registerPage.birthDayKutusu_AC);
        assertTrue(registerPage.birthdayRequried_AC.isDisplayed());
    }

    @And("kullanici User Name alanini bos birakir_AC")
    public void kullaniciUserNameAlaniniBosBirakir_AC() {
    }

    @And("User Name alani bos birakilarak kayit olunamadigini dogrular_AC")
    public void userNameAlaniBosBirakilarakKayitOlunamadiginiDogrular_AC() {
        ReusableMethods.bekle(2);
        ReusableMethods.scroll(registerPage.userNameKutusu_AC);
        assertTrue(registerPage.usernameRequried_AC.isDisplayed());
    }

    @And("kullanici Password alanini bos birakir_AC")
    public void kullaniciPasswordAlaniniBosBirakir_AC() {
    }

    @And("Password alani bos birakilarak kayit olunamadigini dogrular_AC")
    public void passwordAlaniBosBirakilarakKayitOlunamadiginiDogrular_AC() {
        ReusableMethods.bekle(2);
        ReusableMethods.scroll(registerPage.passwordKutusu_AC);
        assertTrue(registerPage.passwordRequried_AC.isDisplayed());
    }

    @And("kullanici Password alanina yedi karakterli bir  {string} girer_AC")
    public void kullaniciPasswordAlaninaYediKarakterliBirGirer_AC(String sifre) {
        sifre = fakerAC.internet().password(7,7);
        registerPage.passwordKutusu_AC.sendKeys(sifre);
    }

    @And("Sekiz karakterden daha az karakterli bir sifre ile kayit olunamadigini dogrular_AC")
    public void sekizKarakterdenDahaAzKarakterliBirSifreIleKayitOlunamadiginiDogrular_AC() {
        ReusableMethods.bekle(2);
        assertTrue(registerPage.passwordRequried_AC.getText().contains("At least 8 characters"));

    }

    @And("kullanici Password alanina sadece rakamlardan olusan bir sifre girer_AC")
    public void kullaniciPasswordAlaninaSadeceRakamlardanOlusanBirSifreGirer_AC() {
        ReusableMethods.bekle(2);
        registerPage.passwordKutusu_AC.sendKeys("123456789");
    }

    @And("Kayit isleminin tamamlanmadigini dogrular_AC")
    public void kayitIslemininTamamlanmadiginiDogrular_AC() {
        assertTrue(registerPage.passwordRequried_AC.getText().contains("One lowercase character"));
    }

    @And("kullanici Password alanina sadece kucuk harflerden olusan bir sifre girer_AC")
    public void kullaniciPasswordAlaninaSadeceKucukHarflerdenOlusanBirSifreGirer_AC() {
        ReusableMethods.bekle(2);
        registerPage.passwordKutusu_AC.sendKeys("ascdgstejkl");
    }

    @And("kullanici sadece kucuk harflerden olusan bir sifre ile kayit olamaz_AC")
    public void kullaniciSadeceKucukHarflerdenOlusanBirSifreIleKayitOlamaz_AC() {
        assertTrue(registerPage.passwordRequried_AC.getText().contains("One uppercase character"));
    }

    @And("kullanici Password alanina sadece buyuk harflerden olusan bir sifre girer_AC")
    public void kullaniciPasswordAlaninaSadeceBuyukHarflerdenOlusanBirSifreGirer_AC() {
        ReusableMethods.bekle(2);
        registerPage.passwordKutusu_AC.sendKeys("ASCDBEJDKFL");
    }

    @And("kullanici sadece buyuk harflerden olusan bir sifre ile kayit olamaz_AC")
    public void kullaniciSadeceBuyukHarflerdenOlusanBirSifreIleKayitOlamaz_AC() {
        assertTrue(registerPage.passwordRequried_AC.getText().contains("One lowercase character"));
    }

    @And("kullanici Password alanina sadece buyuk ve kucuk harflerden olusan bir sifre girer_AC")
    public void kullaniciPasswordAlaninaSadeceBuyukVeKucukHarflerdenOlusanBirSifreGirer_AC() {
        ReusableMethods.bekle(2);
        registerPage.passwordKutusu_AC.sendKeys("ASCDBEJDKFLacsbdnjdjd");
    }

    @And("kullanici sadece buyuk ve kucuk harflerden olusan bir sifre ile kayit olamaz_AC")
    public void kullaniciSadeceBuyukVeKucukHarflerdenOlusanBirSifreIleKayitOlamaz_AC() {
        assertTrue(registerPage.passwordRequried_AC.getText().contains("One number"));
    }

    @And("kullanici Password alanina sadece rakam ve buyuk harflerden olusan bir sifre girer_AC")
    public void kullaniciPasswordAlaninaSadeceRakamVeBuyukHarflerdenOlusanBirSifreGirer_AC() {
        ReusableMethods.bekle(2);
        registerPage.passwordKutusu_AC.sendKeys("ASCDBEJDKFL123456");
    }

    @And("kullanici sadece rakam ve buyuk harflerden olusan bir sifre ile kayit olamaz_AC")
    public void kullaniciSadeceRakamVeBuyukHarflerdenOlusanBirSifreIleKayitOlamaz_AC() {
        ReusableMethods.bekle(2);
        assertTrue(registerPage.passwordRequried_AC.getText().contains("One lowercase character"));
    }

    @And("kullanici SSN alanina kayitli bir ssn girer_AC")
    public void kullaniciSSNAlaninaKayitliBirSsnGirer_AC() {
        registerPage.ssnKutusu_AC.sendKeys("230-475-1234");
    }

    @And("Daha once kayitli bir SSN ile kayit olunamadigini dogrular_AC")
    public void dahaOnceKayitliBirSSNIleKayitOlunamadiginiDogrular_AC() {
        assertTrue(registerPage.ssnAlreadyRegisterYazisi_AC.isDisplayed());
    }
}
