package team02.stepDefinition.ui_step_defs;

import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import team02.pages.ViceDeanOgretmeneDersAtamaPage;
import team02.utilities.Driver;
import team02.utilities.ReusableMethods;

public class ViceDean_OgretmeneIkiDersAtamaStepDefs {

    ViceDeanOgretmeneDersAtamaPage ViceDeanOgretmeneDersAtamaPage = new ViceDeanOgretmeneDersAtamaPage();

    Actions actions = new Actions(Driver.getDriver());

    @When("Birden fazla ders secer ht")
    public void birden_fazla_ders_secer_ht() {
        ReusableMethods.bekle(2);
        actions.sendKeys(Keys.END, Keys.PAGE_UP).perform();
        int lessonProgramAssignmentCheckboxSize = ViceDeanOgretmeneDersAtamaPage.lessonProgramAssignmentCheckbox.size();
        ReusableMethods.clickElementByJS(ViceDeanOgretmeneDersAtamaPage.lessonProgramAssignmentCheckbox.get(lessonProgramAssignmentCheckboxSize - 1));
        ReusableMethods.clickElementByJS(ViceDeanOgretmeneDersAtamaPage.lessonProgramAssignmentCheckbox.get(lessonProgramAssignmentCheckboxSize - 2));
    }
}
