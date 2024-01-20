package team02.stepDefinition.ui_step_defs;

import io.cucumber.java.en.When;
import team02.pages.ViceDeanAddLessonProgramPage;
import team02.utilities.ReusableMethods;
public class ViceDean_IkinciKezDersEklemeStepDefs {

    ViceDeanAddLessonProgramPage ViceDeanAddLessonProgramPage = new ViceDeanAddLessonProgramPage();

    @When("Dolu olan box'lar disindaki Start Time ve Stop Time alanlarini {string} ve {string} olarak doldur ht")
    public void dolu_olan_box_lar_disindaki_start_time_ve_stop_time_alanlarini_ve_olarak_doldur_ht(String string, String string2) {
        ReusableMethods.bekle(5);
        ViceDeanAddLessonProgramPage.startTimeBox.sendKeys(string);
        ViceDeanAddLessonProgramPage.stoptTimeBox.sendKeys(string);
    }
}
