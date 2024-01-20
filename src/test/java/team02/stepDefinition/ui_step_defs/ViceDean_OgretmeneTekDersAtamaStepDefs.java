package team02.stepDefinition.ui_step_defs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import team02.pages.ViceDeanOgretmeneDersAtamaPage;
import team02.utilities.Driver;
import team02.utilities.ReusableMethods;

public class ViceDean_OgretmeneTekDersAtamaStepDefs {

    ViceDeanOgretmeneDersAtamaPage ViceDeanOgretmeneDersAtamaPage = new ViceDeanOgretmeneDersAtamaPage();
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());

    int beforeLessonProgram;
    int afterLessonProgram;

    @When("Ders secer ht")
    public void ders_secer_ht() {
        ReusableMethods.bekle(2);
        actions.sendKeys(Keys.END, Keys.PAGE_UP).perform();
        int lessonProgramAssignmentCheckboxSize = ViceDeanOgretmeneDersAtamaPage.lessonProgramAssignmentCheckbox.size();
        ReusableMethods.clickElementByJS(ViceDeanOgretmeneDersAtamaPage.lessonProgramAssignmentCheckbox.get(lessonProgramAssignmentCheckboxSize - 1));
    }

    @When("Choose Teacher dropdownundan ders icin ogretmen secer ht")
    public void choose_teacher_dropdownundan_ders_icin_ogretmen_secer_ht() {
        ReusableMethods.bekle(2);
        Select select = new Select(ViceDeanOgretmeneDersAtamaPage.chooseTeacherAssignmentDdm);
        int index = faker.number().numberBetween(1, 50);
        select.selectByIndex(index);
    }

    @And("Submit butonuna tiklarr ht")
    public void submit_butonuna_tiklar_ht() {
        ReusableMethods.bekle(5);
        actions.sendKeys(Keys.HOME, Keys.PAGE_DOWN, Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(2);
        ReusableMethods.clickElementByJS(ViceDeanOgretmeneDersAtamaPage.sayfadaSonaGelme);
        int totalPage = Integer.valueOf(ViceDeanOgretmeneDersAtamaPage.toplamSayfa.getText().substring(0, 2));
        for (int i = 0; i < totalPage; i++) {
            beforeLessonProgram = ViceDeanOgretmeneDersAtamaPage.totalLessonProgramList.size() + beforeLessonProgram;
            ReusableMethods.click(ViceDeanOgretmeneDersAtamaPage.sayfadaGeriGelme);
        }
        System.out.println("beforeLessonProgram = " + beforeLessonProgram);
        ReusableMethods.bekle(5);
        actions.sendKeys(Keys.END, Keys.PAGE_UP).perform();
        ReusableMethods.clickElementByJS(ViceDeanOgretmeneDersAtamaPage.lessonProgramAssignmentSubmit);
    }

    @Then("Ogretmene ders atayabildigi dogrulanir ht")
    public void ogretmene_ders_atayabildigi_dogrulanir_ht() {
        ReusableMethods.bekle(5);
        actions.sendKeys(Keys.HOME, Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(5);
        ReusableMethods.click(ViceDeanOgretmeneDersAtamaPage.sayfadaSonaGelme);
        int totalPage = Integer.valueOf(ViceDeanOgretmeneDersAtamaPage.toplamSayfa.getText().substring(0, 2));
        for (int i = 0; i < totalPage; i++) {
            afterLessonProgram = ViceDeanOgretmeneDersAtamaPage.totalLessonProgramList.size() + afterLessonProgram;
            ReusableMethods.click(ViceDeanOgretmeneDersAtamaPage.sayfadaGeriGelme);
        }
        System.out.println("afterLessonProgram = " + afterLessonProgram);
        ReusableMethods.bekle(5);
        Assert.assertEquals(afterLessonProgram - beforeLessonProgram, 1);
    }
}
