package team02.stepDefinition.ui_step_defs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import team02.pages.ViceDeanAddLessonProgramPage;
import team02.utilities.ConfigReader;
import team02.utilities.Driver;
import team02.utilities.ReusableMethods;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ViceDean_TekDersEklemeStepDefs {

    ViceDeanAddLessonProgramPage ViceDeanAddLessonProgramPage = new ViceDeanAddLessonProgramPage();
    Faker faker = new Faker();
    Random random = new Random();

    static int beforeLessonProgram;
    int afterLessonProgram;

    @Given("Kullanici web sitesine girer ht")
    public void kullanici_web_sitesine_girer_ht() {
        Driver.getDriver().get(ConfigReader.getProperty("manage_Url"));
    }

    @When("Kullanici login e tiklar ht")
    public void kullanici_login_e_tiklar_ht() {
        ViceDeanAddLessonProgramPage.loginLink.click();
    }

    @When("Username kutusuna {string} girer ht")
    public void username_kutusuna_girer_ht(String string) {
        ViceDeanAddLessonProgramPage.usernameBox.sendKeys(string);
    }

    @When("Password kutusuna {string} girer ht")
    public void password_kutusuna_girer_ht(String string) {
        ViceDeanAddLessonProgramPage.passwordBox.sendKeys(string);
    }

    @When("Login butonuna tiklar ht")
    public void login_butonuna_tiklar_ht() {
        ReusableMethods.bekle(5);
        ReusableMethods.clickElementByJS(ViceDeanAddLessonProgramPage.loginButton);
    }

    @When("Lesson Program butonuna tiklar ht")
    public void lesson_program_butonuna_tiklar_ht() {
        ReusableMethods.bekle(5);
        ViceDeanAddLessonProgramPage.lessonProgramButton.click();
    }

    @When("Choose Lessons boxuna ders girer ht")
    public void choose_lessons_boxuna_ders_girer_ht() {
        ReusableMethods.bekle(5);
        List<String> list = new ArrayList<>();
        list.add("almanca");
        list.add("fransızca");
        list.add("sanat");
        list.add("SDLC");
        ViceDeanAddLessonProgramPage.chooseLessonsSelect.click();
        ViceDeanAddLessonProgramPage.chooseLessonsSelect.sendKeys(list.get(random.nextInt(list.size())), Keys.ENTER);
    }

    @When("Choose  Education Term dropdownundan egitim donemi secer ht")
    public void choose_education_term_dropdownundan_egitim_donemi_secer_ht() {
        ReusableMethods.bekle(5);
        Select select = new Select(ViceDeanAddLessonProgramPage.chooseEducationTermDdm);
        int index = faker.number().numberBetween(1, 5);
        select.selectByIndex(index);
    }

    @When("Choose Day dropdownundan ders icin gun secer ht")
    public void choose_day_dropdownundan_ders_icin_gun_secer_ht() {
        ReusableMethods.bekle(5);
        Select select = new Select(ViceDeanAddLessonProgramPage.chooseDayDdm);
        int index = faker.number().numberBetween(1, 5);
        select.selectByIndex(index);

    }

    @When("Start Time boxundan ders icin baslama saati {string} girer ht")
    public void start_time_boxundan_ders_icin_baslama_saati_girer_ht(String string) {
        ReusableMethods.bekle(5);
        ViceDeanAddLessonProgramPage.startTimeBox.sendKeys(string);
    }

    @When("Stop Time boxundan ders icin bitis saati {string} girer ht")
    public void stop_time_boxundan_ders_icin_bitis_saati_girer_ht(String string) {
        ReusableMethods.bekle(5);
        ViceDeanAddLessonProgramPage.stoptTimeBox.sendKeys(string);
    }

    @When("Submit butonuna tiklar ht")
    public void submit_butonuna_tiklar_ht() {
        ReusableMethods.bekle(5);
        beforeLessonProgram = ViceDeanAddLessonProgramPage.lessonProgramAssignmentList.size();
        ReusableMethods.scroll(ViceDeanAddLessonProgramPage.addLessonProgramSubmit);
        ReusableMethods.clickElementByJS(ViceDeanAddLessonProgramPage.addLessonProgramSubmit);
        ReusableMethods.bekle(5);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }

    @Then("Ders programinin olustugu dogrulanir ht")
    public void ders_programinin_olustugu_dogrulanir_ht() {
        ReusableMethods.bekle(5);
        afterLessonProgram = ViceDeanAddLessonProgramPage.lessonProgramAssignmentList.size();
        Assert.assertEquals(afterLessonProgram - beforeLessonProgram, 1);
    }

    @And("Sayfayi kapat ht")
    public void sayfayi_kapat_ht() {
        Driver.closeDriver();
    }
}



