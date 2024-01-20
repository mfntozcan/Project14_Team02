package team02.stepDefinition.ui_step_defs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import team02.pages.MehmetPage;
import team02.utilities.ConfigReader;
import team02.utilities.Driver;
import team02.utilities.ReusableMethods;

public class ViceDeanCanAddLesson {

    MehmetPage mehmetPage = new MehmetPage();


    ReusableMethods reusableMethods = new ReusableMethods();
    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();

    @Given("Verilen URL'e git")
    public void verilenURLEGit() {Driver.getDriver().get(ConfigReader.getProperty("manage_Url"));
    }

    @When("Login linkine tıkla")
    public void loginLinkineTıkla() {

        mehmetPage = new MehmetPage();
        if (mehmetPage.loginButton.isDisplayed()) {
            mehmetPage.loginButton.click();
        } else {
            mehmetPage.menuButton.click();
        }


    }

    @And("Username kısmına gecerli bir veri gir")
    public void usernameKısmınaGecerliBirVeriGir() {
        mehmetPage.userNameBox.sendKeys("Eminerana" , Keys.TAB);

    }

    @And("Password kutusuna gecerli bir şifre gir")
    public void passwordKutusunaGecerliBirŞifreGir() {
        mehmetPage.passwordBox.sendKeys("Emine2000", Keys.TAB);
    }

    @And("Vice Dean olarak uygulamaya giriş yap")
    public void viceDeanOlarakUygulamayaGirişYap() {
        mehmetPage.loginButtonTikla.sendKeys(Keys.ENTER);


    }


      @When("Menu butonuna tikla")
      public void menuButonunaTikla() {
          ReusableMethods.visibleWait(mehmetPage.menuButton,1);
          mehmetPage.menuButton.click();
          ReusableMethods.bekle(2);
      }

      @When("Lesson Management a tikla")
      public void lessonManagementATikla() {
      mehmetPage.lessonManagementGiris.click();
      ReusableMethods.bekle(2);}




    @When("Cıkan ekrandan Lesson butonuna tıkla")
    public void cıkanEkrandanLessonButonunaTıkla() {
        mehmetPage.lesson.sendKeys(Keys.ENTER);
        ReusableMethods.bekle(2);

    }

    @Then("Add Lesson sayfası görüdüğünü dogrula")
    public void addLessonSayfasıGörüdüğünüDogrula() {
        Assert.assertTrue(mehmetPage.lessonManagementYazisi.isDisplayed());

    }

    @And("Lesson Name kısmına ders  ismi girin")
    public void lessonNameKısmınaDersIsmiGirin() {
        ReusableMethods.visibleWait(mehmetPage.lesson,1) ;
        mehmetPage.lessonName.sendKeys(faker.name().firstName());
        ReusableMethods.bekle(2);
    }

    @And("Compulsory kutucugunu işretleyin")
    public void compulsoryKutucugunuIşretleyin() {
      //  mehmetPage.checkbox.click();
      //  ReusableMethods.clickElementByJS(mehmetPage.checkbox);
        mehmetPage.compulsory.click();
        ReusableMethods.bekle(2);
    }

    @And("Credit Score kısmına bir Score girin")
    public void creditScoreKısmınaBirScoreGirin() {
        ReusableMethods.visibleWait(mehmetPage.creditScore,3) ;
        mehmetPage.creditScore.sendKeys(faker.number().digit());
        ReusableMethods.bekle(1);
    }

    @When("Submit butonu tıklayın")
    public void submitButonuTıklayın() {
        mehmetPage.submitButton.click();
        ReusableMethods.bekle(1);

    }

    @Then("Lesson created mesajı görüldüğünü dogrula")
    public void lessonCreatedMesajıGörüldüğünüDogrula() {
        ReusableMethods.bekle(2);
        Assert.assertTrue(mehmetPage.lessonCreatedyazisi.isDisplayed());
    }

    @And("Lesson Name kısmını bos bırakın yada tek bir harf yazın")
    public void lessonNameKısmınıBosBırakınYadaTekBirHarfYazın() {

    }

    @Then("Lesson created mesajı görülmediğini dogrula")
    public void lessonCreatedMesajıGörülmediğiniDogrula() {


    }


    @When("Add Lesson sayfası görülmeli")
    public void addLessonSayfasıGörülmeli() {
    }

    @Then("Compulsory kutucugunu işretlemeyin")
    public void compulsoryKutucugunuIşretlemeyin() {


    }
}
