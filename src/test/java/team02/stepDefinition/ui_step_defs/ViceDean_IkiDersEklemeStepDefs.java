package team02.stepDefinition.ui_step_defs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import team02.pages.ViceDeanAddLessonProgramPage;
import team02.utilities.ReusableMethods;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ViceDean_IkiDersEklemeStepDefs {

    ViceDeanAddLessonProgramPage ViceDeanAddLessonProgramPage = new ViceDeanAddLessonProgramPage();

    int afterLessonProgram;
    Random random = new Random();

    @When("Choose Lessons boxundan birden fazla ders secer ht")
    public void choose_lessons_boxundan_birden_fazla_ders_secer_ht() {
        ReusableMethods.bekle(5);
        List<String> list = new ArrayList<>();
        list.add("almanca");
        list.add("fransızca");
        list.add("sanat");
        list.add("SDLC");
        ViceDeanAddLessonProgramPage.chooseLessonsSelect.click();
        String ders = list.get(random.nextInt(list.size()));
        ViceDeanAddLessonProgramPage.chooseLessonsSelect.sendKeys(ders, Keys.ENTER);
        String ikinciDers = null;
        do {
            ikinciDers = list.get(random.nextInt(list.size()));
        } while (ders.equals(ikinciDers));
        ViceDeanAddLessonProgramPage.chooseLessonsSelect.sendKeys(ikinciDers, Keys.ENTER);
    }

    @Then("Ders programinin hepsinin olustugu dogrulanir ht")
    public void ders_programinin_hepsinin_olustugu_dogrulanir_ht() {
        ReusableMethods.bekle(5);
        afterLessonProgram = ViceDeanAddLessonProgramPage.lessonProgramAssignmentList.size();
        Assert.assertEquals(afterLessonProgram - ViceDean_TekDersEklemeStepDefs.beforeLessonProgram, 2);
    }
}
