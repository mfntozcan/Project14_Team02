package team02.stepDefinition.ui_step_defs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import team02.pages.*;
import team02.utilities.Driver;
import team02.utilities.ReusableMethods;


public class TeacherMeetingUpdate {
    team02.pages.homePage homePage=new homePage();
    team02.pages.chooseLesson chooseLesson = new chooseLesson();
    team02.pages.meetManagements meetManagements = new meetManagements();

    team02.pages.adminManagement adminManagement=new adminManagement();

    team02.pages.studentInfoManagement studentInfoManagement=new studentInfoManagement();





    @When("Login butonuna tiklarr")
    public void loginButonunaTiklarr() {
        homePage.login.click();
    }

    @And("kullanici adi ve password bilgileri ile login olur")
    public void kullaniciAdiVePasswordBilgileriIleLoginOlur() {
        homePage.userName.sendKeys("Bilo");
        homePage.password.sendKeys("Bilo123.");
        homePage.loginButton.click();
    }

    @When("Kullanici menu butonuna tiklarr")
    public void kullaniciMenuButonunaTiklarr() {
        homePage.menu.click();
    }

    @When("kullanici meetManagemet butonuna tiklar")
    public void kullaniciMeetManagemetButonunaTiklar() {
        homePage.meetManagementButton.click();
    }

    @Then("MeetList Ekraninda Date,Start Time,Stop Time ve Description kisimlarinin oldugu dogrulanir.")
    public void meetlistEkranindaDateStartTimeStopTimeVeDescriptionKisimlarininOlduguDogrulanir() {
       Assert.assertTrue(meetManagements.date.isDisplayed());
       Assert.assertTrue(meetManagements.startTime.isDisplayed());
       Assert.assertTrue(meetManagements.stopTime.isDisplayed());
       Assert.assertTrue(meetManagements.description.isDisplayed());
    }

    @When("Sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }

    @Then("kullanici Meet List alaninda bulunan edit butonuna tiklar")
    public void kullaniciMeetListAlanindaBulunanEditButonunaTiklar() {
       ReusableMethods.scroll(meetManagements.startTime);
        ReusableMethods.bekle(2);
        meetManagements.edit.click();
    }

    @When("Choose Student alaninda ogrenci silinir")
    public void chooseStudentAlanindaOgrenciSilinir() {
        meetManagements.ogrenciSilmeButonu.click();
    }




    @When("ogrenci liste button tikla")
    public void ogrenciListeButtonTikla() {
        ReusableMethods.bekle(3);
        meetManagements.StudentList.click();




    }

    @Then("Meet Managemet ekraninin acildigi dogrulanir")
    public void meetManagemetEkranininAcildigiDogrulanir() {

        Assert.assertTrue(meetManagements.meetManagementEkrani.isDisplayed());

    }

    @Then("Edit Meet ekraninin acildigi dogrulanir")
    public void editMeetEkranininAcildigiDogrulanir() {
        Assert.assertTrue(meetManagements.dateButton.isDisplayed());
        
    }

    @When("Guncellenmek istenilen tarih girilir")
    public void guncellenmekIstenilenTarihGirilir() {
        meetManagements.dateButton.sendKeys("20122024",Keys.ENTER);
    }

    @When("Submit Butonuna tiklanir")
    public void submitButonunaTiklanir() {
        meetManagements.summitButton.click();
    }

    @Then("Guncelleme basarili bir sekilde yapilir")
    public void guncellemeBasariliBirSekildeYapilir() {

        ReusableMethods.visibleWait(meetManagements.editSubmitVerifyEp,2);
        Assert.assertTrue(meetManagements.editSubmitVerifyEp.getText().contains("Meet Updated Successfully"));


    }

    @When("Guncellenmek desciription bilgisi girilir")
    public void guncellenmekDesciriptionBilgisiGirilir() {
        ReusableMethods.bekle(2);
        meetManagements.descriptionBilgisi.sendKeys("2");

    }

    @When("Guncellenmek istenilen time girilir")
    public void guncellenmekIstenilenTimeGirilir() {
        meetManagements.startTimeButton.sendKeys("1320");
    }

    @When("Silinmesi istenilen toplanti silinir")
    public void silinmesiIstenilenToplantiSilinir() {
        ReusableMethods.scroll(meetManagements.startTime);
        ReusableMethods.bekle(2);
        meetManagements.deleteButton.click();
    }

    @Then("Toplantini silindigini dogrula")
    public void toplantiniSilindiginiDogrula() {

        ReusableMethods.visibleWait(meetManagements.deleteVerify,2);
        Assert.assertTrue(meetManagements.deleteVerify.getText().contains("Meet deleted successfully"));
    }

    @And("ogretmen kullanici adi ve password bilgileri ile login olur")
    public void ogretmenKullaniciAdiVePasswordBilgileriIleLoginOlur() {
        homePage.userName.sendKeys("fikrifikri");
        homePage.password.sendKeys("Fikri123.");
        homePage.loginButton.click();
    }
}