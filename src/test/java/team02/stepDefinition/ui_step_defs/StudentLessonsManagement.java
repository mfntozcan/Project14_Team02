package team02.stepDefinition.ui_step_defs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import team02.pages.*;
import team02.utilities.ReusableMethods;


public class StudentLessonsManagement {
    team02.pages.homePage homePage=new homePage();
    team02.pages.chooseLesson chooseLesson = new chooseLesson();
    team02.pages.meetManagements meetManagements = new meetManagements();

    team02.pages.adminManagement adminManagement=new adminManagement();

    team02.pages.studentInfoManagement studentInfoManagement=new studentInfoManagement();




    @When("kullanici acilan ekranda Choose Lesson butonuna tiklar")
    public void kullaniciAcilanEkrandaChooseLessonButonunaTiklar() {
        chooseLesson.chooseLessonButton.click();
    }

    @Then("kullanici Choose Lesson Management sayfasinin acildigini dogrular")
    public void kullaniciChooseLessonManagementSayfasininAcildiginiDogrular() {
        Assert.assertTrue(chooseLesson.chooseLessonPage.isDisplayed());
    }

    @Then("Ogrenci Choose Lesson listesinde: Teacher, Day.Start Time ve Stop Time bilgilerini gorebildigi dogrulanir")
    public void ogrenciChooseLessonListesindeTeacherDayStartTimeVeStopTimeBilgileriniGorebildigiDogrulanir() {

        Assert.assertTrue(chooseLesson.teacher.isDisplayed());
        Assert.assertTrue(chooseLesson.day.isDisplayed());
        Assert.assertTrue(chooseLesson.startTime.isDisplayed());
        Assert.assertTrue(chooseLesson.stopTime.isDisplayed());


    }

    @When("kullanici Choose Lesson basligin altindaki secilmek istenilen ders veya dersler ikonuna tiklar")
    public void kullaniciChooseLessonBasliginAltindakiSecilmekIstenilenDersVeyaDerslerIkonunaTiklar() {
        ReusableMethods.scroll(chooseLesson.forLessonScroll);

        ReusableMethods.bekle(2);

        chooseLesson.lessonChooseButton.click();
        
        
        
    }

    @And("kullanici submit butonuna tiklar")
    public void kullaniciSubmitButonunaTiklar() {

        ReusableMethods.bekle(2);
        ReusableMethods.scroll(chooseLesson.forScroll);
        ReusableMethods.bekle(2);
        chooseLesson.submitButton.click();
        
    }

    @Then("kullanci derslerin secildigini dogrular")
    public void kullanciDerslerinSecildiginiDogrular() {

        String actualMessage=chooseLesson.mesageVerify1Ep.getText();
        String expectedMessage="Lesson added to Student";
        Assert.assertTrue(actualMessage.contains(expectedMessage));
    }

    @Then("kullanici ayni gun ve saate gelen dersleri secemedigini dogrular")
    public void kullaniciAyniGunVeSaateGelenDersleriSecemediginiDogrular() {
      String actualMessage=  chooseLesson.errorMessageVerify.getText();
      String expectedMessage="Error: Course schedule cannot be selected for the same hour and day";
      Assert.assertTrue(actualMessage.contains(expectedMessage));


    }

    @When("kullanici Choose Lesson Listte silinmesi isdedigi dersi siler")
    public void kullaniciChooseLessonListteSilinmesiIsdedigiDersiSiler() {
        
    }

    @Then("dersin silindigi dogrulanir")
    public void dersinSilindigiDogrulanir() {
        
    }

    @Then("kullanici secilen dersin Lesson Program List'e eklendigini dorular")
    public void kullaniciSecilenDersinLessonProgramListEEklendiginiDorular() {

        ReusableMethods.scroll(chooseLesson.lessonProgramList);

        String dersbilgisi=chooseLesson.secilendersinBilgisi.getText();
        String LessonProgramList=chooseLesson.lessonProgramList.getText();

        Assert.assertTrue(LessonProgramList.contains(dersbilgisi));

    }

    @When("kullanici acilan ekranda Grades and Announcements butonuna tiklar")
    public void kullaniciAcilanEkrandaGradesAndAnnouncementsButonunaTiklar() {
        studentInfoManagement.gradesandAnnouncementsButton.click();

        
    }

    @Then("kullanici Student Info List sayfasinin acildigini dogrular")
    public void kullaniciStudentInfoListSayfasininAcildiginiDogrular() {
        Assert.assertTrue(studentInfoManagement.studentInfoList.isDisplayed());
        
    }

    @Then("kullanici sinav notlarini gorebildigini dogrular")
    public void kullaniciSinavNotlariniGorebildiginiDogrular() {
        Assert.assertTrue(studentInfoManagement.examGrade.isDisplayed());
    }

    @Then("kullanici danışmanın kendisi için oluşturduğu toplantıları görebildigi dogrulanir")
    public void kullaniciDanışmanınKendisiIçinOluşturduğuToplantılarıGörebildigiDogrulanir() {
        Assert.assertTrue(studentInfoManagement.meetList.isDisplayed());
    }

    @And("ogrenci kullanici adi ve password bilgileri ile login olur")
    public void ogrenciKullaniciAdiVePasswordBilgileriIleLoginOlur() {
        homePage.userName.sendKeys("Haci");
        homePage.password.sendKeys("Haci123.");
        homePage.loginButton.click();
    }
}
