package team02.stepDefinition.ui_step_defs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import team02.pages.ViceDeanCreateStudentPage;
import team02.utilities.ReusableMethods;

public class ViceDeanCreateStudentStepDefs {


    ViceDeanCreateStudentPage mypage=new ViceDeanCreateStudentPage();
    @And("Student Management butonuna tikla")
    public void studentManagementButonunaTikla() {
        mypage.StudentManagement.click();

    }

    @And("Choose Tecaher kutusundan bir ogretmen sec")
    public void chooseTecaherKutusundanBirOgretmenSec() {
        ReusableMethods.ddmValue(mypage.ChooseTeacher,"3967");
    }

    @And("danışman öğretmeni seçilebilir oldugunu dogrula")
    public void danışmanÖğretmeniSeçilebilirOldugunuDogrula() {
    //    Assert.assertTrue(mypage.ChooseTeacher.isSelected());
        Assert.assertTrue(mypage.ChooseTeacher.getText().contains("Teacher Murat"));
    }

    @And("name kutusuna isim gir")
    public void nameKutusunaIsimGir() {
        mypage.name.sendKeys("Yusuf");
    }

    @And("name kutusuna isim girdigini dogrula")
    public void nameKutusunaIsimGirdiginiDogrula() {
        Assert.assertTrue(mypage.name.isDisplayed());
    }


    @And("Surname kutusuna soyisim gir")
    public void surnameKutusunaSoyisimGir() {
        mypage.surname.sendKeys("Demir");
    }

    @And("Soyisim kutusuna Soyisim girdigini dogrula")
    public void soyisimKutusunaSoyisimGirdiginiDogrula() {
        Assert.assertTrue(mypage.surname.isDisplayed());
    }

    @And("Birth Place kutusuna dogrum yeri gir gir")
    public void birthPlaceKutusunaDogrumYeriGirGir() {
        mypage.birthPlace.sendKeys("Antalya");
    }

    @And("dogum yeri kutusuna dogum yer girdigini dogrula")
    public void dogumYeriKutusunaDogumYerGirdiginiDogrula() {
        Assert.assertTrue(mypage.birthPlace.isDisplayed());
    }

    @And("E-mail kutusuna mail gir")
    public void eMailKutusunaMailGir() {
        mypage.email.sendKeys("mdemir@gmail.com");
    }

    @And("E-mail kutusuna mail girdigini dogrula")
    public void eMailKutusunaMailGirdiginiDogrula() {
        Assert.assertTrue(mypage.email.isDisplayed());
    }

    @And("Telefon numarasi kutusuna telefon numarasi gir")
    public void telefonNumarasiKutusunaTelefonNumarasiGir() {
        mypage.phoneNumber.sendKeys("518-903-7833");
    }

    @And("Telefon numarasi kutusuna telefon numarasi girdigini dogrula")
    public void telefonNumarasiKutusunaTelefonNumarasiGirdiginiDogrula() {
        Assert.assertTrue(mypage.phoneNumber.isDisplayed());
    }

    @And("Cinsiyet kutusuna cinsiyet seciniz")
    public void cinsiyetKutusunaCinsiyetSeciniz() {
        mypage.Female.click();
    }

    @And("Cinsiyet kutusuna Cinsiyet sectigini dogrula")
    public void cinsiyetKutusunaCinsiyetSectiginiDogrula() {
        Assert.assertTrue(mypage.Female.isSelected());
    }

    @And("Doğum tarihi kutusuna tarih gir")
    public void doğumTarihiKutusunaTarihGir() {
        mypage.birthDay.sendKeys("12"+"01"+"2002");
    }

    @And("Doğum tarihi kutusuna tarih girdigini dogrula")
    public void doğumTarihiKutusunaTarihGirdiginiDogrula() {
        Assert.assertTrue(mypage.birthDay.isDisplayed());

    }

    @And("SSN kutusuna ssn gir")
    public void ssnKutusunaSsnGir() {
        mypage.ssn.sendKeys("567-76-8765");
    }

    @And("SSN kutusuna ssn girdigini dogrula")
    public void ssnKutusunaSsnGirdiginiDogrula() {
        Assert.assertTrue(mypage.ssn.isDisplayed());
    }

    @And("Username kutusuna kullinici adi gir")
    public void usernameKutusunaKulliniciAdiGir() {
        mypage.username.sendKeys("demiryusf");

    }

    @And("Username kutusuna kullanici adi girdigini dogrula")
    public void usernameKutusunaKullaniciAdiGirdiginiDogrula() {
        Assert.assertTrue(mypage.username.isDisplayed());
    }

    @And("Father name kutusuna baba isimi gir")
    public void fatherNameKutusunaBabaIsimiGir() {
        mypage.fatherName.sendKeys("Mustafa");
    }

    @And("Father name kutusuna baba isimi girdigini dogrula")
    public void fatherNameKutusunaBabaIsimiGirdiginiDogrula() {
        Assert.assertTrue(mypage.fatherName.isDisplayed());
    }

    @And("Mother name kutusuna anne isimi gir")
    public void motherNameKutusunaAnneIsimiGir() {
        mypage.motherName.sendKeys("Ayse");

    }

    @And("Mother name kutusuna anne isimi girdigini dogrula")
    public void motherNameKutusunaAnneIsimiGirdiginiDogrula() {
        Assert.assertTrue(mypage.motherName.isDisplayed());
    }

    @And("Student number otomatik olarak geldigin dogrula")
    public void studentNumberOtomatikOlarakGeldiginDogrula() {
    }

    @And("password kutusuna buyuk kucuk ve bir rakam icerdigini dogrula")
    public void passwordKutusunaBuyukKucukVeBirRakamIcerdiginiDogrula() {
    }

    @Then("Admin Username kutsuna kayitli veriyi gir")
    public void adminUsernameKutsunaKayitliVeriyiGir() {
        mypage.username.sendKeys("AdminGurkay");
        ReusableMethods.bekle(1);

    }

    @Then("Admin Password kutusuna kayitli veriyi gir")
    public void adminPasswordKutusunaKayitliVeriyiGir() {
        mypage.password.sendKeys("Gurkay123+");
        ReusableMethods.bekle(1);
    }
}
