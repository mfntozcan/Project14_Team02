package team02.stepDefinition.ui_step_defs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import team02.pages.ViceDeanAddLessonProgramPage;
import team02.utilities.ReusableMethods;
public class ViceDean_BosBirakilanAlanlarlaDersOlusmamaStepDefs {

    ViceDeanAddLessonProgramPage ViceDeanAddLessonProgramPage = new ViceDeanAddLessonProgramPage();

    int afterLessonProgram;
    @When("Choose Lessons boxunu bos birakir ht")
    public void choose_lessons_boxunu_bos_birakir_ht() {
        System.out.println("Choose Lessons boxun bos birakilir");
    }

    @When("Choose  Education Term dropdownunu bos birakir ht")
    public void choose_education_term_dropdownunu_bos_birakir_ht() {
        System.out.println("Choose  Education Term dropdownu bos birakilir");
    }

    @When("Choose Day dropdownunu bos birakir ht")
    public void choose_day_dropdownunu_bos_birakir_ht() {
        System.out.println("Choose Day dropdownu bos birakilir");
    }

    @Then("Ders programinin olusmadigi dogrulanir ht")
    public void ders_programinin_olusmadigi_dogrulanir_ht() {
        ReusableMethods.bekle(5);
        afterLessonProgram = ViceDeanAddLessonProgramPage.lessonProgramAssignmentList.size();
        Assert.assertEquals(afterLessonProgram, ViceDean_TekDersEklemeStepDefs.beforeLessonProgram);
        System.out.println("beforeLessonProgram = " + ViceDean_TekDersEklemeStepDefs.beforeLessonProgram);
        System.out.println("afterLessonProgram = " + afterLessonProgram);
    }
}
